package appUI;

import javax.swing.*;

import com.opencsv.exceptions.CsvValidationException;

import Models.Client;
import Models.Item;
import Models.PhysicalItem;
import Models.SystemDatabase;
import Models.SystemPayment;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class RentPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel searchResultsPanel;
	private MainLibraryFront mainLibraryFront; //reference to MainLibraryFront
	private SystemDatabase database; //reference to database
	private Client client; //reference to client
	
    public RentPage(CardLayout cardLayout, JPanel mainPanel, Client client, SystemDatabase database, MainLibraryFront mainLibraryFront) {
        this.mainLibraryFront = mainLibraryFront; //Initialize library reference
        this.database = database; //Initialize database reference
        this.client = client;
        setLayout(new BorderLayout());

        //Back Button, Header, and Search Bar
        JPanel headerPanel = new JPanel(new BorderLayout());
        JButton backFromSearch = new JButton("Back");
        headerPanel.add(backFromSearch, BorderLayout.WEST);

        JLabel searchLabel = new JLabel("Rent Books", SwingConstants.CENTER);
        headerPanel.add(searchLabel, BorderLayout.CENTER);

        JPanel searchInputPanel = new JPanel(new FlowLayout());
        JTextField searchText = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchInputPanel.add(searchText);
        searchInputPanel.add(searchButton);
        
        //Adding headerPanel and searchInputPanel to a combined top panel
        JPanel combinedTopPanel = new JPanel(new BorderLayout());
        combinedTopPanel.add(headerPanel, BorderLayout.NORTH);
        combinedTopPanel.add(searchInputPanel, BorderLayout.SOUTH);
        add(combinedTopPanel, BorderLayout.NORTH);

        //Results panel
        searchResultsPanel = new JPanel();
        searchResultsPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        searchResultsPanel.setAlignmentX(Component.CENTER_ALIGNMENT); 
        add(searchResultsPanel, BorderLayout.CENTER);

        searchButton.addActionListener(e -> {
            String searchQuery = searchText.getText();
            if (!searchQuery.isEmpty()) {
                performSearch(searchQuery); 
            }
        });
        
        //Back button to go to main page
        backFromSearch.addActionListener(e -> {
            cardLayout.show(mainPanel, "LibraryFront");
            searchText.setText(""); 
            searchResultsPanel.removeAll(); 
            searchResultsPanel.revalidate();
            searchResultsPanel.repaint();
            this.mainLibraryFront.refreshRentedBooksPanel(client); //Refresh the rented books list when returning to the main page
        });
    }
    
    private void performSearch(String name) {
        searchResultsPanel.removeAll(); 
        //TODO: retrieve the item from the database, getPhysicalItem not complete
        Item item = database.getPhysicalItem(name); 
        if (item != null && item instanceof PhysicalItem) { 
            // Display item details
            JLabel itemLabel = new JLabel(item.getName());
            searchResultsPanel.add(itemLabel);

            // If there are copies available, show the Rent button
            JButton actionButton = new JButton("Rent");
            actionButton.addActionListener(e -> rentItemAction(item));
            searchResultsPanel.add(actionButton);
            
            // Show recommended books if similar books exist
            try {
				ArrayList<String> similarBooks = database.recommend(name);
				
				if (similarBooks.size() > 0) {
				
					JLabel recommendations = new JLabel("Recommendations:");
			        recommendations.setBounds(0, 0, 450, 248);
			        recommendations.setHorizontalTextPosition(SwingConstants.CENTER);
			        recommendations.setHorizontalAlignment(SwingConstants.CENTER);
			        searchResultsPanel.add(recommendations);
					
					
					int y = 20;
					for(String book: similarBooks) {
						JLabel bookLabel = new JLabel(book);			
						//bookLabel.setBounds(20, y, 50, 50);
						searchResultsPanel.add(bookLabel);
						
						y += 20;
					}
				}
			} catch (CsvValidationException e1) {
				e1.printStackTrace();
			}
            
            
            

        } else {
            searchResultsPanel.add(new JLabel("No item found in library with name: " + name));
        }

        searchResultsPanel.revalidate();
        searchResultsPanel.repaint();
    }

    private void rentItemAction(Item item) {
        // Rent button logic
        JPanel paymentPanel = new JPanel(new GridLayout(3, 2));
        JComboBox<String> paymentTypes = new JComboBox<>(new String[]{"Credit", "Debit", "Mobile Wallet"});
        JTextField paymentIdField = new JTextField();
        JButton payButton = new JButton("Pay");

        paymentPanel.add(new JLabel("Select payment type:"));
        paymentPanel.add(paymentTypes);
        paymentPanel.add(new JLabel("Enter your PIN/ID:"));
        paymentPanel.add(paymentIdField);
        paymentPanel.add(payButton);

        // Create the payment dialog
        JDialog paymentDialog = new JDialog();
        paymentDialog.setTitle("Payment");
        paymentDialog.setContentPane(paymentPanel);
        paymentDialog.setSize(300, 200);
        paymentDialog.setModal(true);
        paymentDialog.setLocationRelativeTo(this);

        payButton.addActionListener(payEvent -> {
            //Checking the fields when the Pay button is clicked
            String selectedPaymentType = (String) paymentTypes.getSelectedItem();
            String paymentId = paymentIdField.getText().trim();

            if (selectedPaymentType == null || selectedPaymentType.isEmpty() || paymentId.isEmpty()) {
                //If any field is empty, show a warning message
                JOptionPane.showMessageDialog(paymentDialog, "Please fill in all fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            } else {
                double paymentAmount = 5.00; // Example amount
                String paymentMessage = SystemPayment.getInstance().payment(selectedPaymentType, paymentAmount, paymentId);
                JOptionPane.showMessageDialog(paymentDialog, paymentMessage, "Payment Status", JOptionPane.INFORMATION_MESSAGE);
                
                if (item instanceof PhysicalItem) {
                    // Setting due date to 24hrs for testing purposes
                    LocalDateTime dueDate = LocalDateTime.now().plusDays(1);
                    ((PhysicalItem)item).rentPhysicalItem(item.getName(), dueDate, this.client);
                    this.mainLibraryFront.refreshRentedBooksPanel(this.client);
                }
                paymentDialog.dispose();
            }
        });

        paymentDialog.setVisible(true);
    }
}



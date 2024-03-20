package appUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

import com.opencsv.exceptions.CsvValidationException;

import Models.Client;
import Models.SystemDatabase;
import java.time.LocalDateTime; 
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainLibraryFront extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private JPanel rentedBooksPanel;
    private JPanel notificationsPanel;
    
    public MainLibraryFront(Client client, SystemDatabase database) throws CsvValidationException {
    	//Set window title and layout
        super("YorkU Library Front");
        
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        JButton rentBooks = new JButton("Rent Books");
        JButton openVirtualBooks = new JButton("Open Virtual Books");
        JButton viewNewsletters = new JButton("View Newsletters");
        JButton requestBook = new JButton("Request Book");
        JButton sellableItems = new JButton("Buy Items");

        
        //Main Page with buttons
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(rentBooks);
        buttonBox.add(Box.createVerticalStrut(10));
        buttonBox.add(openVirtualBooks);
        buttonBox.add(Box.createVerticalStrut(10)); 
        buttonBox.add(viewNewsletters);
        buttonBox.add(Box.createVerticalStrut(10));
        buttonBox.add(requestBook);
        
        
        buttonBox.setAlignmentY(Component.CENTER_ALIGNMENT);

        //Encapsulate buttonBox in a container panel to center horizontally
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(buttonBox);
        buttonPanel.add(Box.createHorizontalGlue());
        
        //Panel for displaying rented books
        rentedBooksPanel = new JPanel();
        rentedBooksPanel.setLayout(new BoxLayout(rentedBooksPanel, BoxLayout.Y_AXIS));
        
        //List of rented books
        refreshRentedBooksPanel(client);
        rentedBooksPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		
        //Notifications Panel for displaying overdue/expiring books
        notificationsPanel = new JPanel();
        refreshNotificationsPanel(client);
        
        //Main Container Panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        containerPanel.add(notificationsPanel, BorderLayout.WEST);
        containerPanel.add(buttonPanel);
        containerPanel.add(rentedBooksPanel);

        //Additional functionalities based on user type
        setupUserSpecificButtons(client, buttonBox);
        
        mainPanel.add(containerPanel, "LibraryFront");
        mainPanel.add(new RentPage(cardLayout, mainPanel, client, database, this), "RentBooks");
        mainPanel.add(new OpenVirtualBooks(cardLayout, mainPanel, client, database, this), "OpenVirtualBooks");
        mainPanel.add(new SubscriptionPage(cardLayout, mainPanel, client), "ViewNewsletters");
        
        //Add action listeners for buttons
        rentBooks.addActionListener(e -> cardLayout.show(mainPanel, "RentBooks"));
        openVirtualBooks.addActionListener(e -> cardLayout.show(mainPanel, "OpenVirtualBooks"));
        viewNewsletters.addActionListener(e -> cardLayout.show(mainPanel, "ViewNewsletters"));
        requestBook.addActionListener(e -> displayRequestPopup());

        
        //display student course book
        if(client.getType().equals("Student")) {
        	JButton viewCourseBook = new JButton("View Course Book");
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(viewCourseBook);
            
            viewCourseBook.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Implement action to change status of a book
                	ViewCourseBook viewCourseBook = new ViewCourseBook();
                	
                	viewCourseBook.setVisible(true);
                }
            });
        }
        
      //Buy Item page
        	JButton sellableItem = new JButton("Buy Items");
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(sellableItem);
            
            sellableItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Implement action to change status of a book
                	BuyItem buyItem = new BuyItem();
                	
                	sellableItem.setVisible(true);
                }
            });
      
        
        //Show the main library front page initially
        cardLayout.show(mainPanel, "LibraryFront");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(900, 600));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public void refreshRentedBooksPanel(Client client) {
        rentedBooksPanel.removeAll();
        rentedBooksPanel.add(new JLabel("Currently Rented Books:"));
        Map<String, LocalDateTime> rentedBooks = client.displayRentedBooks();
        for (Map.Entry<String, LocalDateTime> entry : rentedBooks.entrySet()) {
            rentedBooksPanel.add(new JLabel("Book: " + entry.getKey() + ", Due Date: " + entry.getValue().toString()));
        }
        rentedBooksPanel.revalidate();
        rentedBooksPanel.repaint();
    }
    
    public void refreshNotificationsPanel(Client client) {
        notificationsPanel.removeAll();
        notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));
        notificationsPanel.add(new JLabel("Notifications:"));
        
        List<String> notifications = client.notifyDueDate();
        for (String notification : notifications) {
            notificationsPanel.add(new JLabel(notification));
        }

        notificationsPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 150));
        notificationsPanel.revalidate();
        notificationsPanel.repaint();
    }
    
    public static String findVirtualTextbook(String targetEmail) {
        String virtualTextbook = null;
        String line;
        String csvFile = "StudentData.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            // Read the header line (assuming it contains column names)
            String header = br.readLine();

            // Iterate through each line in the CSV file
            while ((line = br.readLine()) != null) {
                // Split the line into columns based on comma separator
                String[] columns = line.split(",");

                // Check if the email matches the target email
                if (columns.length >= 1 && columns[0].equals(targetEmail)) {
                    // If a match is found, retrieve the virtual textbook
                    if (columns.length >= 3) {
                        virtualTextbook = columns[2];
                    }
                    // Break out of the loop since we found the matching email
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return virtualTextbook;
    }

    
    private void displayRequestPopup() {
        // Method to display request popup
        JDialog requestDialog = new JDialog(this, "Request New Book", true);
        requestDialog.setLayout(new GridLayout(4, 2));
        String requestPriority;
        

        JComboBox<String> bookTypeCombo = new JComboBox<>(new String[]{"Textbooks for Teaching", "Self-Improvement"});
        JTextField bookNameField = new JTextField();
        JButton submitRequest = new JButton("Submit Request");
        
        requestDialog.add(new JLabel("Book Name:"));
        requestDialog.add(bookNameField);
        requestDialog.add(new JLabel("Book Type:"));
        requestDialog.add(bookTypeCombo);
        requestDialog.add(new JLabel()); // Placeholder
        requestDialog.add(submitRequest);

        submitRequest.addActionListener(e -> {
            // TODO: Logic to submit the request
            // For now, just close the dialog
            String bookName = bookNameField.getText();
            String bookType = (String)bookTypeCombo.getSelectedItem();
            String priority = "Low priority";
            
            try {
            	if(bookType.equals("Textbooks for Teaching")) {
            		priority = "High priority";
            		SystemDatabase.getInstance().addBookRequest(bookName, bookType, priority);
            	}
            	else {
            		SystemDatabase.getInstance().addBookRequest(bookName, bookType, priority);
            	}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            
            JOptionPane.showMessageDialog(requestDialog, priority + " request submitted: " + bookName + ", " + bookType);
            
            
            requestDialog.dispose();
        });

        requestDialog.pack();
        requestDialog.setLocationRelativeTo(this);
        requestDialog.setVisible(true);
    }
    
    private void setupUserSpecificButtons(Client client, Box buttonBox) {
    	// TODO: Implement user specific features
        if ("FacultyMember".equals(client.getType())) {
            JButton trackTextbooks = new JButton("Track TextBooks");
            trackTextbooks.addActionListener(new ActionListener() {
            	@Override
            	public void actionPerformed(ActionEvent e) {
            		ArrayList<String> facultyTextbooks = new ArrayList<String>();
            		
            		try {
            			facultyTextbooks = SystemDatabase.getInstance().getTextbooks(client.getEmail());
            		}
            		catch (CsvValidationException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		textBooksPage textbooksPage = new textBooksPage(client.getEmail(), facultyTextbooks);
            		textbooksPage.setVisible(true);
            	}
            });
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(trackTextbooks);
            
            JButton addCourse = new JButton("Track Courses");
            addCourse.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Create and display the CoursesPage
                    ArrayList<String> facultyCourses = new ArrayList<String>();
					try {
						facultyCourses = SystemDatabase.getInstance().getCourses(client.getEmail());
					} catch (CsvValidationException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // You need to have a list of courses for the faculty member
                    
                    CoursesPage coursesPage = new CoursesPage(facultyCourses, client.getEmail());
                    coursesPage.setVisible(true);
                }
            });
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(addCourse);
            
        } else if ("Student".equals(client.getType())) {
        	JButton trackTextbooks = new JButton("Track TextBooks");
            trackTextbooks.addActionListener(new ActionListener() {
            	@Override
            	public void actionPerformed(ActionEvent e) {
            		ArrayList<String> facultyTextbooks = new ArrayList<String>();
            		
            		try {
            			facultyTextbooks = SystemDatabase.getInstance().getTextbooks(client.getEmail());
            		}
            		catch (CsvValidationException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            		textBooksPage textbooksPage = new textBooksPage(client.getEmail(), facultyTextbooks);
            		textbooksPage.setVisible(true);
            	}
            }
            
            		);
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(trackTextbooks);
        }
        
        
        

    }
}



package appUI;

import javax.swing.*;


import com.opencsv.exceptions.CsvValidationException;

import java.awt.*;
import java.util.Map;
import java.util.List;
import Models.Client;
import Models.Newsletter;
import Models.SystemDatabase;
import Models.SystemPayment;

public class SubscriptionPage extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPanel userSubscriptionsPanel;
    private JPanel availableNewslettersPanel;
    private Client client;

    public SubscriptionPage(CardLayout cardLayout, JPanel mainPanel, Client client) throws CsvValidationException {
        this.client = client;
        setLayout(new BorderLayout());

        JButton backFromSubscriptions = new JButton("Back");
        backFromSubscriptions.addActionListener(e -> cardLayout.show(mainPanel, "LibraryFront"));
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(backFromSubscriptions, BorderLayout.WEST);

        JLabel subscriptionLabel = new JLabel("Subscription Page", JLabel.CENTER);
        topPanel.add(subscriptionLabel, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        userSubscriptionsPanel = new JPanel();
        userSubscriptionsPanel.setLayout(new BoxLayout(userSubscriptionsPanel, BoxLayout.Y_AXIS));
        JScrollPane userScrollPane = new JScrollPane(userSubscriptionsPanel);

        availableNewslettersPanel = new JPanel();
        availableNewslettersPanel.setLayout(new BoxLayout(availableNewslettersPanel, BoxLayout.Y_AXIS));
        JScrollPane availableScrollPane = new JScrollPane(availableNewslettersPanel);

        splitPane.setLeftComponent(userScrollPane);
        splitPane.setRightComponent(availableScrollPane);
        splitPane.setDividerLocation(400);
        
        add(splitPane, BorderLayout.CENTER);

        updateSubscriptionList(); // This will update the panel to show user subscriptions and available newsletters
    }

    private void updateSubscriptionList() throws CsvValidationException {
        userSubscriptionsPanel.removeAll();
        availableNewslettersPanel.removeAll();

        //TODO: This might have to be changed depending on how newsletters are stored and retrieved.
        // Fetch user's subscriptions and all available newsletters
        List<Newsletter> userSubscriptions = SystemDatabase.getInstance().viewAvailableNewsletters(client.getUserID());
        List<Newsletter> availableNewsletters = SystemDatabase.getInstance().getNewsletterList();
        
        System.out.println(userSubscriptions.size());
        System.out.println(availableNewsletters.size());

        for (Newsletter newsletter : userSubscriptions) {
            JPanel subPanel = new JPanel(new FlowLayout());
            subPanel.add(new JLabel(newsletter.getName() + " - $" + newsletter.getMonthlyCost(newsletter.getName()) + "/month"));
            JButton openButton = new JButton("Open");
            JButton cancelButton = new JButton("Unsubscribe");
            openButton.addActionListener(e -> openWebPage(newsletter.getUrl()));
            cancelButton.addActionListener(e -> {
                try {
					client.unsubscribe(newsletter);
				} catch (CsvValidationException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
                try {
					updateSubscriptionList();
				} catch (CsvValidationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
            });
            subPanel.add(openButton);
            subPanel.add(cancelButton);
            userSubscriptionsPanel.add(subPanel);
        }

        boolean skipIndex = true;
        for (Newsletter newsletter : availableNewsletters) {
        	if (skipIndex) {
        		skipIndex = false;
        		continue;
        	}
        	
            JPanel subPanel = new JPanel(new FlowLayout());
            subPanel.add(new JLabel(newsletter.getName() + " - $" + newsletter.getMonthlyCost(newsletter.getName()) + "/month"));
            
            if (!userSubscriptions.contains(newsletter)) {
                JButton subscribeButton = new JButton("Subscribe");
                subscribeButton.addActionListener(e -> {
					try {
						initiateSubscription(newsletter);
					} catch (CsvValidationException | NumberFormatException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				});
                subPanel.add(subscribeButton);
            }
            availableNewslettersPanel.add(subPanel);
        }

        userSubscriptionsPanel.revalidate();
        userSubscriptionsPanel.repaint();
        availableNewslettersPanel.revalidate();
        availableNewslettersPanel.repaint();
    }

    private void initiateSubscription(Newsletter newsletter) throws CsvValidationException, NumberFormatException {
        double paymentAmount = newsletter.getMonthlyCost(newsletter.getName()); //Get the monthly cost of the newsletter
        
        //Setting up the payment panel
        JPanel paymentPanel = new JPanel(new GridLayout(4, 2));
        JComboBox<String> paymentTypes = new JComboBox<>(new String[]{"Credit", "Debit", "Mobile Wallet"});
        JTextField paymentIdField = new JTextField(); //For entering a payment pin or ID
        JLabel costLabel = new JLabel("Cost: $" + paymentAmount);
        JButton payButton = new JButton("Pay");

        paymentPanel.add(new JLabel("Select payment type:"));
        paymentPanel.add(paymentTypes);
        paymentPanel.add(new JLabel("Enter your PIN/ID:"));
        paymentPanel.add(paymentIdField);
        paymentPanel.add(new JLabel()); //Spacer
        paymentPanel.add(costLabel);
        paymentPanel.add(new JLabel()); //Spacer
        paymentPanel.add(payButton);

        //Creating the payment dialog
        JDialog paymentDialog = new JDialog();
        paymentDialog.setTitle("Subscription Payment");
        paymentDialog.setContentPane(paymentPanel);
        paymentDialog.setSize(350, 200); 
        paymentDialog.setModal(true);
        paymentDialog.setLocationRelativeTo(this);

        payButton.addActionListener(payEvent -> {
            String selectedPaymentType = (String) paymentTypes.getSelectedItem();
            String paymentId = paymentIdField.getText().trim();

            if (selectedPaymentType == null || selectedPaymentType.isEmpty() || paymentId.isEmpty()) {
                JOptionPane.showMessageDialog(paymentDialog, "Please fill in all fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            } else {
                String paymentMessage = SystemPayment.getInstance().payment(selectedPaymentType, paymentAmount, paymentId);
                JOptionPane.showMessageDialog(paymentDialog, paymentMessage, "Payment Status", JOptionPane.INFORMATION_MESSAGE);
                paymentDialog.dispose();


                
                client.subscribe(newsletter);   
        
                
                try {
					updateSubscriptionList();
				} catch (CsvValidationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        paymentDialog.setVisible(true);
    }

    private void openWebPage(String url) {
        try {
            Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
            if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(new java.net.URI(url));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

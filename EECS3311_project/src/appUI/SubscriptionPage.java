package appUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SubscriptionPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private final ArrayList<String> subscriptions = new ArrayList<>();
    private JPanel subscriptionPanel;

    public SubscriptionPage(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new BorderLayout());

        JButton backFromSubscriptions = new JButton("Back");
        backFromSubscriptions.addActionListener(e -> cardLayout.show(mainPanel, "LibraryFront"));
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(backFromSubscriptions, BorderLayout.WEST);

        JLabel subscriptionLabel = new JLabel("Subscription Page", JLabel.CENTER);
        topPanel.add(subscriptionLabel, BorderLayout.CENTER);
        add(topPanel, BorderLayout.NORTH);

        subscriptionPanel = new JPanel();
        subscriptionPanel.setLayout(new BoxLayout(subscriptionPanel, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(subscriptionPanel);
        add(scrollPane, BorderLayout.CENTER);

        JPanel addSubscriptionPanel = new JPanel(new FlowLayout());
        JTextField subscriptionField = new JTextField(20);
        JButton addButton = new JButton("Add Subscription");
        addSubscriptionPanel.add(subscriptionField);
        addSubscriptionPanel.add(addButton);
        add(addSubscriptionPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            String newSubscription = subscriptionField.getText();
            if (!newSubscription.isEmpty()) {
                subscriptions.add(newSubscription);
                updateSubscriptionList();
                subscriptionField.setText("");
            }
        });
    }

    private void updateSubscriptionList() {
        subscriptionPanel.removeAll();
        for (String subscription : subscriptions) {
            JPanel subPanel = new JPanel(new FlowLayout());
            subPanel.add(new JLabel(subscription));
            JButton openButton = new JButton("Open");
            JButton cancelButton = new JButton("Cancel");
            subPanel.add(openButton);
            subPanel.add(cancelButton);
            subscriptionPanel.add(subPanel);

            cancelButton.addActionListener(e -> {
                subscriptions.remove(subscription);
                updateSubscriptionList();
            });
            // Add any action for the openButton as needed
        }
        subscriptionPanel.revalidate();
        subscriptionPanel.repaint();
    }
}

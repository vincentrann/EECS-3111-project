package appUI;

import javax.swing.*;

import Models.SystemDatabase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BuyItem extends JFrame {
	private SystemDatabase database = SystemDatabase.getInstance();

    public BuyItem() {
        super("Buy Item");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Text label
        JLabel nameLabel = new JLabel("Enter name of item to buy:");
        panel.add(nameLabel, BorderLayout.NORTH);

        // Text field to collect user input
        JTextField nameField = new JTextField();
        panel.add(nameField, BorderLayout.CENTER);

        // Search button
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemName = nameField.getText();
                
                double cost = getPrice(itemName);
                if (cost != -1) {
                    JOptionPane.showMessageDialog(null, itemName + " costs $" + cost,
                            "Item Cost", JOptionPane.INFORMATION_MESSAGE);
                    
                    // Create a JOptionPane with buttons
                    Object[] options = {"Buy", "Cancel"};
                    int result = JOptionPane.showOptionDialog(null, "Would you like to buy this book?",
                            "Buy Item", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);

                    if (result == JOptionPane.YES_OPTION) {
                        // Implement buy action here
                    	JOptionPane.showMessageDialog(null, "Thank you for your purchase! Your item is on the way.",
                                "Purchase Success", JOptionPane.INFORMATION_MESSAGE);
                    } else if (result == JOptionPane.NO_OPTION) {
                        // Cancel action
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Item not found!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        });
        
        
        panel.add(searchButton, BorderLayout.SOUTH);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
  
    }
    
    public double getPrice(String name) {
        try (BufferedReader br = new BufferedReader(new FileReader("SellableItems.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");
                if (columns.length >= 2 && columns[0].equals(name)) {
                    // Assuming the price is in the second column
                    return Double.parseDouble(columns[1]);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        // Return a default value or handle appropriately if the item is not found
        return -1; // Or any other default value that indicates the item is not found
    }
}

package appUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class BuyItem extends JFrame {


    public BuyItem() {
        super("Buy Item");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Text label
        JLabel nameLabel = new JLabel("Enter name of item to buy:");
        panel.add(nameLabel, BorderLayout.NORTH);

        // Text field to collect user input
        JTextField nameField = new JTextField();
        nameField.setPreferredSize(new Dimension(300, 30)); // Set preferred size for text field
        panel.add(nameField, BorderLayout.CENTER);

        // Search buttons
        JButton searchPButton = new JButton("Search Physical Items");
        JButton searchVButton = new JButton("Search Virtual Items");
        
        searchPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemName = nameField.getText();

                double[] cost = getPhysicalPrices(itemName);
                if (cost != null) {
                    // Create a JOptionPane with buttons for buying the item
                    Object[] options = {"Buy", "Cancel"};
                    int result = JOptionPane.showOptionDialog(null, "Would you like to buy this item?\nFull price: $" + String.format("%.2f", cost[1]) + "  Our discounted price: $" + String.format("%.2f", cost[0]),
                            "Buy Item", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);


                    if (result == JOptionPane.YES_OPTION) {
                        // Prompt the user for credit card information
                        JTextField creditCardField = new JTextField();
                        JTextField cvvField = new JTextField();
                        JTextField dateField = new JTextField();

                        JPanel creditCardPanel = new JPanel(new GridLayout(0, 1));
                        creditCardPanel.add(new JLabel("Enter your credit card number (16 digits):"));
                        creditCardPanel.add(creditCardField);
                        creditCardPanel.add(new JLabel("Enter CVV (3 digits):"));
                        creditCardPanel.add(cvvField);
                        creditCardPanel.add(new JLabel("Enter expiration date (MM/YY):"));
                        creditCardPanel.add(dateField);

                        int inputResult = JOptionPane.showConfirmDialog(null, creditCardPanel,
                                "Enter Credit Card Information", JOptionPane.OK_CANCEL_OPTION);
                        if (inputResult == JOptionPane.OK_OPTION) {
                            String creditCardNumber = creditCardField.getText().replaceAll("\\s", "");
                            String cvv = cvvField.getText();
                            String date = dateField.getText();

                            // Check if the credit card number is not empty and contains only digits
                            if (creditCardNumber.length() != 16 || !creditCardNumber.matches("\\d+")) {
                                JOptionPane.showMessageDialog(null, "Invalid credit card number!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            // Check if the CVV is not 3 digits
                            if (cvv.length() != 3 || !cvv.matches("\\d+")) {
                                JOptionPane.showMessageDialog(null, "Invalid CVV!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
                            YearMonth expirationDate = YearMonth.parse(date, formatter);
                            YearMonth currentYearMonth = YearMonth.now();

                            int lastTwoDigits = expirationDate.getYear() % 100;
                            if (lastTwoDigits >= 25 || (lastTwoDigits == 24 && expirationDate.getMonthValue() >= 3)) {
                                if (expirationDate.isBefore(currentYearMonth)) {
                                    JOptionPane.showMessageDialog(null, "Invalid expiration date!", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid expiration date!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            // Implement buy action here
                            JOptionPane.showMessageDialog(null, "Thank you for your purchase! Your item is on the way.",
                                    "Purchase Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });
        
        searchVButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String itemName = nameField.getText();

                double[] cost = getVirtualPrices(itemName);
                if (cost != null) {
                    // Create a JOptionPane with buttons for buying the item
                    Object[] options = {"Buy", "Cancel"};
                    int result = JOptionPane.showOptionDialog(null, "Would you like to buy this item?\nFull price: $" + String.format("%.2f", cost[1]) + "  Our discounted price: $" + String.format("%.2f", cost[0]),
                            "Buy Item", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                            options, options[0]);


                    if (result == JOptionPane.YES_OPTION) {
                        // Prompt the user for credit card information
                        JTextField creditCardField = new JTextField();
                        JTextField cvvField = new JTextField();
                        JTextField dateField = new JTextField();

                        JPanel creditCardPanel = new JPanel(new GridLayout(0, 1));
                        creditCardPanel.add(new JLabel("Enter your credit card number (16 digits):"));
                        creditCardPanel.add(creditCardField);
                        creditCardPanel.add(new JLabel("Enter CVV (3 digits):"));
                        creditCardPanel.add(cvvField);
                        creditCardPanel.add(new JLabel("Enter expiration date (MM/YY):"));
                        creditCardPanel.add(dateField);

                        int inputResult = JOptionPane.showConfirmDialog(null, creditCardPanel,
                                "Enter Credit Card Information", JOptionPane.OK_CANCEL_OPTION);
                        if (inputResult == JOptionPane.OK_OPTION) {
                            String creditCardNumber = creditCardField.getText().replaceAll("\\s", "");
                            String cvv = cvvField.getText();
                            String date = dateField.getText();

                            // Check if the credit card number is not empty and contains only digits
                            if (creditCardNumber.length() != 16 || !creditCardNumber.matches("\\d+")) {
                                JOptionPane.showMessageDialog(null, "Invalid credit card number!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            // Check if the CVV is not 3 digits
                            if (cvv.length() != 3 || !cvv.matches("\\d+")) {
                                JOptionPane.showMessageDialog(null, "Invalid CVV!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/yy");
                            YearMonth expirationDate = YearMonth.parse(date, formatter);
                            YearMonth currentYearMonth = YearMonth.now();

                            int lastTwoDigits = expirationDate.getYear() % 100;
                            if (lastTwoDigits >= 25 || (lastTwoDigits == 24 && expirationDate.getMonthValue() >= 3)) {
                                if (expirationDate.isBefore(currentYearMonth)) {
                                    JOptionPane.showMessageDialog(null, "Invalid expiration date!", "Error", JOptionPane.ERROR_MESSAGE);
                                    return;
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid expiration date!", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                            // Implement buy action here
                            JOptionPane.showMessageDialog(null, "Thank you for your purchase! Your item is on the way.",
                                    "Purchase Success", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        });
        
        panel.setLayout(new FlowLayout());

        panel.add(searchPButton);
        panel.add(searchVButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public double[] getPhysicalPrices(String name) {
    	final String csvFile = "src\\data\\PhysicalItems.csv";
        double[] prices = new double[2]; // Array to store discounted price and full price

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;

            // Read the file line by line
            while ((nextLine = reader.readNext()) != null) {
                // Check if the line contains the specified name
                if (nextLine.length > 0 && nextLine[0].equals(name)) {
                	if(nextLine[5].equals("TRUE")) {
                		// Parse the discounted price (2nd column) and full price (3rd column)
                        try {
                            prices[0] = Double.parseDouble(nextLine[6]); // Discounted price
                            prices[1] = Double.parseDouble(nextLine[7]); // Full price
                            return prices; // Return the array of prices
                        } catch (NumberFormatException e) {
                            System.err.println("Error parsing prices for item: " + name);
                            return null; // Return null if there was an error parsing prices
                        }
                	}
                	else {
                		JOptionPane.showMessageDialog(null, "Sorry, this item is not for sale.", "Item Not Available", JOptionPane.INFORMATION_MESSAGE);
                		return null;
                	}
                	
               
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null, "Item not found.", "Item Not Available", JOptionPane.INFORMATION_MESSAGE);

        
        // Return null if the item is not found or if there was an I/O error
        return null;
    }
    
    public double[] getVirtualPrices(String name) {
    	final String csvFile = "src\\data\\VirtualItems.csv";
        double[] prices = new double[2]; // Array to store discounted price and full price

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            String[] nextLine;

            // Read the file line by line
            while ((nextLine = reader.readNext()) != null) {
                // Check if the line contains the specified name
                if (nextLine.length > 0 && nextLine[0].equals(name)) {
                	if(nextLine[4].equals("TRUE")) {
                		// Parse the discounted price (2nd column) and full price (3rd column)
                        try {
                            prices[0] = Double.parseDouble(nextLine[5]); // Discounted price
                            prices[1] = Double.parseDouble(nextLine[6]); // Full price
                            return prices; // Return the array of prices
                        } catch (NumberFormatException e) {
                            System.err.println("Error parsing prices for item: " + name);
                            return null; // Return null if there was an error parsing prices
                        }
                	}
                	else {
                		JOptionPane.showMessageDialog(null, "Sorry, this item is not for sale.", "Item Not Available", JOptionPane.INFORMATION_MESSAGE);
                		return null;
                	}
                	
               
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(null, "Item not found.", "Item Not Available", JOptionPane.INFORMATION_MESSAGE);

        // Return null if the item is not found or if there was an I/O error
        return null;
    }
    
    private boolean isExpirationDateValid(YearMonth expirationDate) {
        return expirationDate.toString().matches("(0[1-9]|1[0-2])/[2-9]\\d");
    }

}

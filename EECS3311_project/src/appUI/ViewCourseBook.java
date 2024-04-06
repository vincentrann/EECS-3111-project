package appUI;

import javax.swing.*;

import com.opencsv.exceptions.CsvValidationException;
import com.opencsv.CSVReader;
import com.opencsv.*;
import Models.Client;
import Models.Item;
import Models.SystemDatabase;
import Models.VirtualItem;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class ViewCourseBook extends JPanel {
	private static final long serialVersionUID = 1L;
	private SystemDatabase database = SystemDatabase.getInstance();


     ViewCourseBook(String email) {        
        display(email);
    }
    
	private String studentCSV = "src\\data\\StudentData.csv";
	private String virtualCSV = "src\\data\\VirtualItems.csv";


    
    public void display(String targetEmail) {
        // Find the name of the book using the email
        String bookName = database.getVirtualItemTextbook(targetEmail);

        // If the book name is found, get its text
        if (bookName != null) {
            // Check access and get expiration date
            String expiry = database.getVirtualTextbookExpiry(targetEmail);
            boolean accessValid = checkAccess(targetEmail);
            if (expiry != null && accessValid) {
                // Create a JFrame to hold the text area
                JFrame frame = new JFrame("Virtual Book");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Create a JPanel with a vertical layout to hold the title and descriptor
                JPanel panel = new JPanel();
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

                // Create a JLabel for the book title
                JLabel titleLabel = new JLabel("Book Name: " + bookName);
                titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                titleLabel.setBorder(new EmptyBorder(10, 0, 10, 0)); // Add padding

                // Create a JLabel for the access expiration date
                JLabel descriptorLabel = new JLabel("Access until: " + expiry);
                descriptorLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                descriptorLabel.setBorder(new EmptyBorder(10, 0, 10, 0)); // Add padding

                // Add the title and descriptor to the panel
                panel.add(titleLabel);
                panel.add(descriptorLabel);

                // Create a JTextArea to display the text
                JTextArea textArea = new JTextArea(20, 60);
                textArea.setEditable(false); // Make the text area read-only

                // Set book text
                String bookText = database.getVirtualItemText(bookName);
                if (bookText != null) {
                    textArea.append(bookText); // Set the text to display
                } else {
                    JOptionPane.showMessageDialog(null, "Text not found for book: " + bookName, "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Add the text area to a JScrollPane to enable scrolling
                JScrollPane scrollPane = new JScrollPane(textArea);

                // Add the panel and text area to the frame
                frame.add(panel, BorderLayout.NORTH);
                frame.add(scrollPane, BorderLayout.CENTER);

                // Pack and display the frame
                frame.pack();
                frame.setLocationRelativeTo(null); // Center the frame on the screen
                frame.setVisible(true);
            } else if (!accessValid) {
                JOptionPane.showMessageDialog(null, "Course has expired.", "Course Expired", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Expiration date not found for email: " + targetEmail, "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Book not found for email: " + targetEmail, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public boolean checkAccess(String email) {
        // Retrieve the expiration date associated with the given email
        String expiry = database.getVirtualTextbookExpiry(email);
        boolean hasAccess = true;
        
        if (expiry != null) {
            // Parse the expiration date
            LocalDate expirationDate = LocalDate.parse(expiry, DateTimeFormatter.ofPattern("MM/dd/yy"));

            // Compare the expiration date with the current date
            if (expirationDate.isBefore(LocalDate.now())) {
                // Display a popup message if the course has expired
                
                hasAccess = false;
            } else {
                // Do nothing if the course has not expired
            }
        } else {
            // Handle the case where the expiration date is not found
            JOptionPane.showMessageDialog(null, "Expiration date not found for email: " + email, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return hasAccess;
    }
    
    
}

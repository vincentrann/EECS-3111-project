package appUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.opencsv.exceptions.CsvValidationException;

import Models.Item;
import Models.SystemDatabase;

public class ChangeBook extends JFrame {
	private SystemDatabase database = SystemDatabase.getInstance();
	
	
	//adds physical book
    public ChangeBook() {
        super("ChangeBookStatus");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        Boolean availability = null;

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("\tName of book:");
        JTextField nameField = new JTextField();
        
        JLabel statusLabel = new JLabel("\tNew Status (true or false):");
        JTextField statusField = new JTextField();
        
        JButton changePButton = new JButton("Change Physical Book Status");
        JButton changeVButton = new JButton("Change Virtual Book Status");
        
        JButton cancelButton = new JButton("Cancel");
        
        changePButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String status = statusField.getText();
                
                if(name.length() > 0) {


                		status = status.trim().toUpperCase(); // Convert input to lowercase and trim
                        if (status.equals("TRUE")) {
                            database.updatePhysicalItemAvailability(name, true);
                            JOptionPane.showMessageDialog(panel, "Status changed to:" + status);
                        } else if (status.equals("FALSE")) {
                            database.updatePhysicalItemAvailability(name, false);
                            JOptionPane.showMessageDialog(panel, "Status changed to:" + status);
                        }
                        else {
                            JOptionPane.showMessageDialog(panel, "Invalid input. Please enter true or false", "Invalid ", JOptionPane.ERROR_MESSAGE);
                        }
                }
                	else {
                        JOptionPane.showMessageDialog(panel, "Invalid input. Please enter a name", "Invalid ", JOptionPane.ERROR_MESSAGE);
                    }
                dispose();
            }
        });
        
        changeVButton.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String status = statusField.getText();
                
                if(name.length() > 0) {
                		
                		status = status.trim().toUpperCase(); // Convert input to lowercase and trim
                        if (status.equals("TRUE")) {
                            database.updateVirtualItemAvailability(name, true);
                            JOptionPane.showMessageDialog(panel, "Status changed to:" + status);
                        } else if (status.equals("FALSE")) {
                            database.updateVirtualItemAvailability(name, false);
                            JOptionPane.showMessageDialog(panel, "Status changed to:" + status);
                        }
                        else {
                            JOptionPane.showMessageDialog(panel, "Invalid input. Please enter true or false", "Invalid ", JOptionPane.ERROR_MESSAGE);
                        }
                }
                	else {
                        JOptionPane.showMessageDialog(panel, "Invalid input. Please enter a name", "Invalid ", JOptionPane.ERROR_MESSAGE);
                    }
                dispose();
            }
        });
        
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(statusLabel);
        panel.add(statusField);
        panel.add(changeVButton);
        panel.add(changePButton);
        panel.add(cancelButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
	
    }
}

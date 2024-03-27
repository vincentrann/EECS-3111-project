package appUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Models.SystemDatabase;

public class ManagementTeamPage extends JFrame {
	private static final long serialVersionUID = 1L;

	public ManagementTeamPage() {
        super("Management Team Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(6, 1, 10, 10));
        JLabel label = new JLabel("Welcome to Management Team Page!");
        JButton changeStatusButton = new JButton("Change Status of a Book");
        JButton addPBookButton = new JButton("Add a New Physical Book");
        JButton addVBookButton = new JButton("Add a New Virtual Book");
        JButton verifyButton = new JButton("Verify new users");
        
        
    	final String unverifiedEmailsCSV = "src\\data\\UnverifiedEmails.csv";

      //verify new users
        verifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to change status of a book
            	SystemDatabase.getInstance().removeAllUnverifiedEmails(unverifiedEmailsCSV);
            }
        });
        //change status of item
        changeStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to change status of a book
            	ChangeBook changeBookWindow = new ChangeBook();
            	
            	changeBookWindow.setVisible(true);
            }
        });
        
        //add physical item
        addPBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to add a new book
                AddBook addBookWindow = new AddBook();
                
                addBookWindow.setVisible(true);
            }
        });
        
        //add virtual item
        addVBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to add a new book
                AddVirtualBook addVBookWindow = new AddVirtualBook();
                
                addVBookWindow.setVisible(true);
            }
        });

        // Add components to the panel
        panel.add(label);
        panel.add(changeStatusButton);
        panel.add(addPBookButton);
        panel.add(addVBookButton);
        panel.add(verifyButton);


        setContentPane(panel);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true);
    }
}

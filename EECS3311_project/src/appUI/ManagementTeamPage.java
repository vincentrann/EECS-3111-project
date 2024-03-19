package appUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ManagementTeamPage extends JFrame {
	public ManagementTeamPage() {
        super("Management Team Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        JLabel label = new JLabel("Welcome to Management Team Page!");
        JButton changeStatusButton = new JButton("Change Status of a Book");
        JButton addBookButton = new JButton("Add a New Book");

        changeStatusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to change status of a book
                JOptionPane.showMessageDialog(panel, "Change Status of a Book functionality will be implemented here.");
            }
        });

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement action to add a new book
                AddBook addBookWindow = new AddBook();
                
                addBookWindow.setVisible(true);
            }
        });

        // Add components to the panel
        panel.add(label);
        panel.add(changeStatusButton);
        panel.add(addBookButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null); // Center the frame on screen
        setVisible(true);
    }
}

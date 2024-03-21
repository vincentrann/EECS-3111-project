                 package appUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.opencsv.exceptions.CsvValidationException;

import Models.SystemDatabase;

public class AddVirtualBook extends JFrame{
	private SystemDatabase database = SystemDatabase.getInstance();
	
	
	//adds physical book
    public AddVirtualBook() {
        super("Add Virtual Book");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel editionLabel = new JLabel("Edition:");
        JTextField editionField = new JTextField();

        JLabel textLabel = new JLabel("Text:");
        JTextField textField = new JTextField();
        
        

        JButton addButton = new JButton("Add Virtual Book");
        JButton cancelButton = new JButton("Cancel");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String edition = editionField.getText();
                String text = textField.getText();
                
                if(name.length() > 0 && text.length() > 0) {

                	try {
						database.addVirtualItem(name, edition, text);
					} catch (CsvValidationException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
	                }
	                JOptionPane.showMessageDialog(panel, "Virtual book added successfully.");
                }
                else {
                	JOptionPane.showMessageDialog(panel, "enter all fields");
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
        panel.add(editionLabel);
        panel.add(editionField);
        panel.add(textLabel);
        panel.add(textField);
        panel.add(addButton);
        panel.add(cancelButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}


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

public class AddBook extends JFrame{
	private SystemDatabase database = SystemDatabase.getInstance();

    public AddBook() {
        super("Add Book");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel aisleLabel = new JLabel("Aisle:");
        JTextField aisleField = new JTextField();

        JLabel typeLabel = new JLabel("Type:");
        JComboBox<String> typeComboBox = new JComboBox<>(new String[]{"PhysicalItem", "VirtualItem"});

        JButton addButton = new JButton("Add Book");
        JButton cancelButton = new JButton("Cancel");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String aisle = aisleField.getText();
                String type = (String) typeComboBox.getSelectedItem();
                
                if(name.length() > 0 && aisle.length() > 0) {

	                if (type.equals("PhysicalItem")) {
	                    try {
							database.addPhysicalItem(name, aisle);
						} catch (CsvValidationException | IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
	                } else {
	                    database.addVirtualItem(name, aisle);
	                }
	                JOptionPane.showMessageDialog(panel, "Book added successfully.");
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
        panel.add(aisleLabel);
        panel.add(aisleField);
        panel.add(typeLabel);
        panel.add(typeComboBox);
        panel.add(addButton);
        panel.add(cancelButton);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

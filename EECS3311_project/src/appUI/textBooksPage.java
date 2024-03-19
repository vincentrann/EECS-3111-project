package appUI;

import javax.swing.*;

import Models.SystemDatabase;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class textBooksPage extends JFrame {
    private String email;
    private ArrayList<String> textbooks;

    public textBooksPage(String email, ArrayList<String> textbooks) {
        this.email = email;
        this.textbooks = textbooks;

        setTitle("Textbooks Page");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 300);

        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Text area to display textbooks
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        for (String textbook : textbooks) {
            textArea.append(textbook + "\n");
        }
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add button
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newBook = JOptionPane.showInputDialog(textBooksPage.this, "Enter textbook name:");
                if (newBook != null && !newBook.isEmpty()) {
                    textbooks.add(newBook);
                    SystemDatabase.getInstance().addTextbook(newBook, email);
                    textArea.append(newBook + "\n");
                }
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(addButton);
        mainPanel.add(buttonPanel, BorderLayout.NORTH);

        getContentPane().add(mainPanel);
        setVisible(true);
    }
}
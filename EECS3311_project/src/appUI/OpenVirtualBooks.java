package appUI;

import javax.swing.*;
import Models.Client;
import Models.Item;
import Models.SystemDatabase;
import Models.VirtualItem;

import java.awt.*;

public class OpenVirtualBooks extends JPanel {
    private static final long serialVersionUID = 1L;
    private JPanel searchResultsPanel;
    private MainLibraryFront mainLibraryFront; //reference to MainLibraryFront
    private SystemDatabase database; //reference to database
    private Client client; //reference to client

    public OpenVirtualBooks(CardLayout cardLayout, JPanel mainPanel, Client client, SystemDatabase database, MainLibraryFront mainLibraryFront) {
        this.mainLibraryFront = mainLibraryFront; //Initialize library reference
        this.database = database; //Initialize database reference
        this.client = client;
        setLayout(new BorderLayout());

        //Back Button, Header, and Search Bar
        JPanel headerPanel = new JPanel(new BorderLayout());
        JButton backFromSearch = new JButton("Back");
        headerPanel.add(backFromSearch, BorderLayout.WEST);

        JLabel searchLabel = new JLabel("Open Virtual Books", SwingConstants.CENTER);
        headerPanel.add(searchLabel, BorderLayout.CENTER);

        JPanel searchInputPanel = new JPanel(new FlowLayout());
        JTextField searchText = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchInputPanel.add(searchText);
        searchInputPanel.add(searchButton);

        //Adding headerPanel and searchInputPanel to a combined top panel
        JPanel combinedTopPanel = new JPanel(new BorderLayout());
        combinedTopPanel.add(headerPanel, BorderLayout.NORTH);
        combinedTopPanel.add(searchInputPanel, BorderLayout.SOUTH);
        add(combinedTopPanel, BorderLayout.NORTH);

        //Results panel
        searchResultsPanel = new JPanel();
        searchResultsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        searchResultsPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(searchResultsPanel, BorderLayout.CENTER);

        searchButton.addActionListener(e -> {
            String searchQuery = searchText.getText();
            if (!searchQuery.isEmpty()) {
                performSearch(searchQuery);
            }
        });

        //Back button to go to main page
        backFromSearch.addActionListener(e -> {
            cardLayout.show(mainPanel, "LibraryFront");
            searchText.setText("");
            searchResultsPanel.removeAll();
            searchResultsPanel.revalidate();
            searchResultsPanel.repaint();
        });
    }

    public void performSearch(String name) {
        searchResultsPanel.removeAll();
        //TODO: retrieve the item from the database, getVirtualItem not complete
        Item item = database.getVirtualItem(name); 
        if (item != null) {
            // Display virtual item details
            JLabel itemLabel = new JLabel(item.getName());
            searchResultsPanel.add(itemLabel);
            
            JButton openButton = new JButton("Open");
            searchResultsPanel.add(openButton);

            openButton.addActionListener(e -> {
                // TODO: Method needs to be added to display the contents of the textbook
                JTextArea contentArea = new JTextArea(((VirtualItem) item).getContent());
                contentArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(contentArea);
                scrollPane.setPreferredSize(new Dimension(350, 200));
                JOptionPane.showMessageDialog(this, scrollPane, item.getName(), JOptionPane.INFORMATION_MESSAGE);
            });
        } else {
            searchResultsPanel.add(new JLabel("No virtual item found with name: " + name));
        }

        searchResultsPanel.revalidate();
        searchResultsPanel.repaint();
    }
}


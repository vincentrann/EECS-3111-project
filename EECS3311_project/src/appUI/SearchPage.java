package appUI;

import javax.swing.*;
import java.awt.*;

public class SearchPage extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel searchResultsPanel;

    public SearchPage(CardLayout cardLayout, JPanel mainPanel) {
        setLayout(new BorderLayout());

        //Back Button, Header, and Search Bar
        JPanel headerPanel = new JPanel(new BorderLayout());
        JButton backFromSearch = new JButton("Back");
        headerPanel.add(backFromSearch, BorderLayout.WEST);

        JLabel searchLabel = new JLabel("Search Books", SwingConstants.CENTER);
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
                performSearch(searchQuery); // This method will handle the search and update the UI
            }
        });
        
        //back button to go to main page
        backFromSearch.addActionListener(e -> {
            cardLayout.show(mainPanel, "LibraryFront");
            searchText.setText(""); 
            searchResultsPanel.removeAll(); 
            searchResultsPanel.revalidate();
            searchResultsPanel.repaint(); 
        });
    }

    private void performSearch(String query) {
        // Dummy backend function call
        // Replace with actual backend search logic

        // For now, we'll just clear the previous results
        searchResultsPanel.removeAll();

        // Here, add backend search results handling 

        //Placeholder update, replace with actual book data
        searchResultsPanel.add(new JLabel("Placeholder for book info"));
        JButton rentButton = new JButton("Rent");
        JButton requestButton = new JButton("Request");
        searchResultsPanel.add(rentButton);
        searchResultsPanel.add(requestButton);

        searchResultsPanel.revalidate();
        searchResultsPanel.repaint();
    }
}
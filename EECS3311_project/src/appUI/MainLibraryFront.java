package appUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime; 
import java.util.Map; 
import java.util.List;

public class MainLibraryFront extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel mainPanel;
    private CardLayout cardLayout;

    //Assuming this is obtained from the login process
    private String userType = "FacultyMember"; //Placeholder, change as needed
    
    //private List<String> notifications; //Placeholder for dynamic notification data
    
    public MainLibraryFront() {
    	//Set window title and layout
        super("YorkU Library Front");
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        JButton searchBooks = new JButton("Search Books");
        JButton viewSubscriptions = new JButton("View Subscriptions");

        
        //Main Page with buttons
        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        buttonBox.add(searchBooks);
        buttonBox.add(Box.createVerticalStrut(10));
        buttonBox.add(viewSubscriptions);
        buttonBox.setAlignmentY(Component.CENTER_ALIGNMENT);

        //Encapsulate buttonBox in a container panel to center horizontally
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
        buttonPanel.add(Box.createHorizontalGlue());
        buttonPanel.add(buttonBox);
        buttonPanel.add(Box.createHorizontalGlue());

        //Panel for displaying rented books
        JPanel rentedBooksPanel = new JPanel();
        rentedBooksPanel.setLayout(new BoxLayout(rentedBooksPanel, BoxLayout.Y_AXIS));
        rentedBooksPanel.add(new JLabel("Currently Rented Books:"));
        
        // Assume client is an instance of Client containing the rented books information.
        //Map<String, LocalDateTime> rentedBooks = client.displayRentedBooks();

        // Clear existing book listings before adding new ones to avoid duplication
        //rentedBooksPanel.removeAll();

        //for (Map.Entry<String, LocalDateTime> entry : rentedBooks.entrySet()) {
        //    rentedBooksPanel.add(new JLabel("Book: " + entry.getKey() + " - Due: " + entry.getValue().toString()));
       // }

        rentedBooksPanel.revalidate();  // Refresh panel to display new data
        rentedBooksPanel.repaint();
        
        rentedBooksPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
		
        
        //Notifications Panel for displaying overdue/expiring books
        JPanel notificationsPanel = new JPanel();
        notificationsPanel.setLayout(new BoxLayout(notificationsPanel, BoxLayout.Y_AXIS));
        notificationsPanel.add(new JLabel("Notifications:"));
        /*
        //Populate with dynamic notification data
        for (String notification : notifications) {
            notificationsPanel.add(new JLabel(notification));
        }
        */
        //Temporary Example
        notificationsPanel.add(new JLabel("Book 4 - Overdue!"));
        notificationsPanel.add(new JLabel("Book 5 - Due in 1 day!"));
        notificationsPanel.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 150));

        
        
        //Main Container Panel
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.X_AXIS));
        containerPanel.add(notificationsPanel, BorderLayout.WEST);
        containerPanel.add(buttonPanel);
        containerPanel.add(rentedBooksPanel);

        //Additional functionalities based on user type
        if (userType.equals("FacultyMember")) {
            JButton trackCourses = new JButton("Track Courses/Books");
            trackCourses.addActionListener(e -> JOptionPane.showMessageDialog(this, "Tracking Courses and Books."));
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(trackCourses);
        } else if (userType.equals("Student")) {
            JButton accessTextbooks = new JButton("Access Textbooks");
            accessTextbooks.addActionListener(e -> JOptionPane.showMessageDialog(this, "Accessing Textbooks."));
            buttonBox.add(Box.createVerticalStrut(10));
            buttonBox.add(accessTextbooks);
        }    
        
        mainPanel.add(containerPanel, "LibraryFront");
        mainPanel.add(new SearchPage(cardLayout, mainPanel), "SearchBooks");
        mainPanel.add(new SubscriptionPage(cardLayout, mainPanel), "ViewSubscriptions");
        
        //Add action listeners for buttons
        searchBooks.addActionListener(e -> cardLayout.show(mainPanel, "SearchBooks"));
        viewSubscriptions.addActionListener(e -> cardLayout.show(mainPanel, "ViewSubscriptions"));

        //Show the main library front page initially
        cardLayout.show(mainPanel, "LibraryFront");
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(900, 600));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        new MainLibraryFront();
    }
}


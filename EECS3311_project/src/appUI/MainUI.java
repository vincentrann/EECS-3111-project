package appUI;



import java.awt.BorderLayout;


import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;


import javax.swing.*;

import com.opencsv.exceptions.CsvValidationException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import java.util.UUID;
import BuilderPattern.*;
import java.util.regex.*;


import Models.*;
import appUI.MainLibraryFront;


public class MainUI extends JFrame {
	
	SystemDatabase database = SystemDatabase.getInstance();
	final String unverifiedEmailsCSV = "src\\data\\UnverifiedEmails.csv";


	private static final long serialVersionUID = 1L;
	private static MainUI instance;

	public static MainUI getInstance() {
		if (instance == null)
			instance = new MainUI();

		return instance;
	}
	
	private MainUI() {
		// Set window title
		super("YorkU Library Management app");
		
		
		//content pane
		CardLayout cardLayout = new CardLayout();
		JPanel cardJPanel = new JPanel(cardLayout);
		cardJPanel.setLayout(cardLayout);
	
		// register/login page
		JButton register = new JButton("register");
		JButton loginButton = new JButton("login");
		JButton managementTeamButton = new JButton("Management Team");

		
		JPanel firstPage = new JPanel();
		
		firstPage.setLayout(new BoxLayout(firstPage, BoxLayout.Y_AXIS));
		register.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		managementTeamButton.setAlignmentX(Component.CENTER_ALIGNMENT);

		
		firstPage.add(Box.createVerticalGlue());
		firstPage.add(register);
		firstPage.add(Box.createVerticalStrut(10));
		firstPage.add(loginButton);
		firstPage.add(Box.createVerticalStrut(10));
		firstPage.add(managementTeamButton);
		firstPage.add(Box.createVerticalGlue());
		
		//register page
		JPanel registerPage = new JPanel();
		registerPage.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		registerPage.setLayout(new GridLayout(15, 1));
		
		Vector<String> regNames = new Vector<String>();
		regNames.add("Student");
		regNames.add("Faculty Member");
		regNames.add("Non-Faculty staff");
		regNames.add("Visitors");
		
		JLabel regLabel = new JLabel("register");
		JLabel remail = new JLabel("email");
		JLabel rpassword = new JLabel("password");
		JTextField remailField = new JTextField(11);
		JTextField rpassField = new JTextField(11);
		JButton regButton = new JButton("register");
		JComboBox<String> regTypeList = new JComboBox<String>(regNames);
		JButton regBackButton = new JButton("back");
		
		registerPage.add(regLabel);
		registerPage.add(remail);
		registerPage.add(remailField);
		registerPage.add(rpassword);	
		registerPage.add(rpassField);
		registerPage.add(regTypeList);
		registerPage.add(regButton);
		registerPage.add(regBackButton);
		
		
		//login page
		JPanel loginPage = new JPanel();
		loginPage.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		loginPage.setLayout(new GridLayout(15, 1));
		
		JLabel logLabel = new JLabel("login");
		JLabel logemail = new JLabel("email");
		JTextField logemailField = new JTextField(11);
		JLabel logpass = new JLabel("password");
		JTextField logpassField = new JTextField(11);
		JButton logButton = new JButton("login");
		JButton logBackButton = new JButton("back");
		
		loginPage.add(logLabel);
		loginPage.add(logemail);
		loginPage.add(logemailField);
		loginPage.add(logpass);
		loginPage.add(logpassField);
		loginPage.add(logButton);
		loginPage.add(logBackButton);

	
		// add panels
		cardJPanel.add(registerPage, "register"); 
		cardJPanel.add(loginPage, "login"); 
		cardJPanel.add(firstPage, "first"); 
		cardLayout.show(cardJPanel, "first"); 
		setContentPane(cardJPanel);

		//register page actions
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardJPanel, "register");	
			}
		});
		regBackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardJPanel, "first");
				
			}
		});
		regButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ClientBuilder builder;
				ClientDirector director;
				
				String email= remailField.getText();
				String password= rpassField.getText();
				String id = UUID.randomUUID().toString();
				String type = String.valueOf(regTypeList.getSelectedItem());
				System.out.println(type);
				
				if(email.length() == 0 || password.length() == 0) {
					System.out.println("please complete all fields");
				}
				
				if(!verifyPasswordStrength(password)) {
					return;
				}
				else if(database.clientExists(email, type.replaceAll("\\s", ""))) {
					System.out.println("user already exists, try new email");
				}
				
				else {
					if(!type.equals("Visitors")) {
						database.addUnverifiedEmail(email);
					}
					
					if (type.equals("Student")) {
						builder = new StudentBuilder();
					}
					else if (type.equals("Visitors")) {
						builder = new VisitorBuilder();
					}
					else if (type.equals("Faculty Member")) {
						builder = new FacultyMemberBuilder();
					}
					else {
						builder = new NonFacultyMemberBuilder();
					}
					
					director = new ClientDirector(builder);
					
					director.construct(email, password, id);
					
					Client client = director.getProduct();
					database.addClient(client);
					
					try {
						new MainLibraryFront(client, database);
					} catch (CsvValidationException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
			}
		});
		
		//login page actions
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardJPanel, "login");
				
			}
		});
		logBackButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardJPanel, "first");
				
			}
		});	
		logButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String email = logemailField.getText();
				String password = logpassField.getText();
				
				if (database.clientLogin(email, password)) {
					Client client = database.getClient(email);
					try {
						new MainLibraryFront(client, database);
					} catch (CsvValidationException e1) {
						e1.printStackTrace();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
				else {
					System.out.println("email or password is wrong try again");
				}
			}
		});

		managementTeamButton.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
			    JFrame loginFrame = new JFrame("Management Team Login");
			    loginFrame.setLayout(new GridLayout(3, 2));

			    JLabel usernameLabel = new JLabel("Username:");
			    JTextField usernameField = new JTextField();

			    JLabel passwordLabel = new JLabel("Password:");
			    JPasswordField passwordField = new JPasswordField();

			    JButton submitButton = new JButton("Submit");
			    JButton backButton = new JButton("Back");

			    loginFrame.add(usernameLabel);
			    loginFrame.add(usernameField);
			    loginFrame.add(passwordLabel);
			    loginFrame.add(passwordField);
			    loginFrame.add(submitButton);
			    loginFrame.add(backButton);

			    submitButton.addActionListener(new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
			            String username = usernameField.getText();
			            String password = new String(passwordField.getPassword());
			            // Check if username and password are correct
			            if (username.equals("admin") && password.equals("admin")) {
			                // If correct, navigate to ManagementTeamPage
			                ManagementTeamPage managementTeamPage = new ManagementTeamPage();
			                loginFrame.dispose();
			            } else {
			                JOptionPane.showMessageDialog(loginFrame, "Invalid username or password. Please try again.");
			            }
			        }
			    });
			    backButton.addActionListener(new ActionListener() {
			        @Override
			        public void actionPerformed(ActionEvent e) {
			            loginFrame.dispose(); // Close the login window
			        }
			    });

			    loginFrame.pack();
			    loginFrame.setVisible(true);
			    loginFrame.setLocationRelativeTo(null);
		    }
		});
	}
	
	public static boolean verifyPasswordStrength(String password) {
        // Define a regular expression pattern to match the password requirements
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        boolean valid = false;
        
        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object with the provided password
        Matcher matcher = regex.matcher(password);

        // Check if the password matches the pattern
        if (matcher.matches()) {
            valid = true;
        } else {
            JOptionPane.showMessageDialog(null, "The password is improper. Please use a strong password.", "Password Error", JOptionPane.ERROR_MESSAGE);
        }
        return valid;
    }
	
	
	public static void main(String[] args) {

		JFrame frame = MainUI.getInstance();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(900, 600));
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	
	
}

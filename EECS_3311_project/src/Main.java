
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// test
public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private static Main instance;

	public static Main getInstance() {
		if (instance == null)
			instance = new Main();

		return instance;
	}
	
	private Main() {
		// Set window title
		super("YorkU Library Management app");
		
		//content pane
		CardLayout cardLayout = new CardLayout();
		JPanel cardJPanel = new JPanel(cardLayout);
		cardJPanel.setLayout(cardLayout);
	
		// register/login page
		JButton register = new JButton("register");
		JButton loginButton = new JButton("login");
		
		JPanel firstPage = new JPanel();
		
		firstPage.setLayout(new BoxLayout(firstPage, BoxLayout.Y_AXIS));
		register.setAlignmentX(Component.CENTER_ALIGNMENT);
		loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		firstPage.add(Box.createVerticalGlue());
		firstPage.add(register);
		firstPage.add(Box.createVerticalStrut(10));
		firstPage.add(loginButton);
		firstPage.add(Box.createVerticalGlue());
		
		//register page
		JPanel registerPage = new JPanel();
		registerPage.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		registerPage.setLayout(new GridLayout(15, 1));
		
		JLabel regLabel = new JLabel("register");
		JLabel email = new JLabel("email");
		JLabel password = new JLabel("password");
		JTextField emailField = new JTextField(11);
		JTextField passField = new JTextField(11);
		regLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		email.setAlignmentX(Component.CENTER_ALIGNMENT);
		password.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		registerPage.add(regLabel);
		registerPage.add(email);
		registerPage.add(emailField);
		registerPage.add(password);	
		registerPage.add(passField);
		
		//login page
		JPanel loginPage = new JPanel();
	
		// add panels
		cardJPanel.add(registerPage, "register"); 
		cardJPanel.add(loginPage, "login"); 
		cardJPanel.add(firstPage, "first"); 
		cardLayout.show(cardJPanel, "first"); 
		setContentPane(cardJPanel);
		
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(cardJPanel, "register");
			}
		});
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {

		JFrame frame = Main.getInstance();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(900, 600));
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
}

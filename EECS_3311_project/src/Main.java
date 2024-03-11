
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

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

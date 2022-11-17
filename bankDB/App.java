package bankDB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public class App {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1260, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Add Customer");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setBackground(UIManager.getColor("controlShadow"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username;
				username =textField.getText();
				
				String password;
				
				password=passwordField.getText();
				
				System.out.println(username+" "+password);
			}
		});
		btnNewButton.setToolTipText("Add Customer");
		btnNewButton.setBounds(63, 219, 206, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnShowCustomerDetails = new JButton("Show Customer Details");
		btnShowCustomerDetails.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnShowCustomerDetails.setBackground(UIManager.getColor("controlShadow"));
		btnShowCustomerDetails.setForeground(Color.BLACK);
		btnShowCustomerDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShowCustomerDetails.setToolTipText("Add Customer");
		btnShowCustomerDetails.setBounds(63, 313, 206, 49);
		frame.getContentPane().add(btnShowCustomerDetails);
		
		JButton btnNewButton_1_1 = new JButton("Deposit");
		btnNewButton_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setBackground(UIManager.getColor("controlShadow"));
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1.setToolTipText("Add Customer");
		btnNewButton_1_1.setBounds(63, 410, 206, 49);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Withdraw");
		btnNewButton_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1_1_1.setBackground(UIManager.getColor("controlShadow"));
		btnNewButton_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1.setToolTipText("Add Customer");
		btnNewButton_1_1_1.setBounds(63, 494, 206, 49);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Money Transfer");
		btnNewButton_1_1_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1_1_1_1.setBackground(UIManager.getColor("controlShadow"));
		btnNewButton_1_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1_1_1_1.setToolTipText("Add Customer");
		btnNewButton_1_1_1_1.setBounds(63, 584, 206, 49);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(10, 153, 1211, 22);
		frame.getContentPane().add(horizontalGlue);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(321, 185, 1, 1);
		frame.getContentPane().add(verticalGlue);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setBounds(329, 185, 12, 492);
		frame.getContentPane().add(verticalGlue_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(1040, 273, 181, 30);
		frame.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(1040, 219, 181, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextArea txtrUsername = new JTextArea();
		txtrUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrUsername.setText("Username");
		txtrUsername.setBounds(934, 219, 79, 22);
		frame.getContentPane().add(txtrUsername);
		
		JTextArea txtrPassword = new JTextArea();
		txtrPassword.setText("Password");
		txtrPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtrPassword.setBounds(934, 275, 79, 22);
		frame.getContentPane().add(txtrPassword);
		
		JLabel lblNewLabel = new JLabel("Bank Of Shubham");
		lblNewLabel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
		lblNewLabel.setBounds(10, 10, 1207, 133);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setBackground(new Color(173, 216, 230));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 43));
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

package swingDemo.ignite;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FirstWindow {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Window"); //object of frame to be displayed in desktop		
		frame.setSize(450,400);
		//frame.setTitle("First Window");
		frame.setLocationRelativeTo(null);
		
		//objects of components
		JButton btnLogin = new JButton("Login");	
		JLabel lblUser = new JLabel("User Name : ");
		lblUser.setBackground(Color.BLACK);
		JLabel lblPass = new JLabel("Password ");
		JTextField txtUser = new JTextField();
		JPasswordField txtPass = new JPasswordField();
	
		
		//configured the position and alignment
		btnLogin.setBounds(130,170,160,30); //x,y,w,h
		lblUser.setBounds(50,50,160,30); //x,y,w,h
		txtUser.setBounds(220,50,160,30);
		lblPass.setBounds(50,110,160,30);
		txtPass.setBounds(220,110,160,30);
		
		//adding components to framea
		frame.add(lblUser);
		frame.add(btnLogin);
		frame.add(txtUser);

		frame.add(lblPass);

		frame.add(txtPass);
		
		//set layout and make visible
		frame.setLayout(null); //to be  discussed later
		frame.setVisible(true);	
		
	}

}

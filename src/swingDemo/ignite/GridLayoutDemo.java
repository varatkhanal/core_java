package swingDemo.ignite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class GridLayoutDemo {
	public GridLayoutDemo(){
		JFrame frame = new JFrame(); //object of frame to be displayed in desktop		
		
		frame.setSize(450,400);
		frame.setTitle("First Window");
		frame.setLocationRelativeTo(null);
		
		GridLayout gridLayout = new GridLayout(3,2,30,30);
		
		
		//frame.setLayout(gridLayout); //to be  discussed later
		
		//objects of components
		JButton btnLogin = new JButton("Login");	
		JButton btnRegister = new JButton("Register");
		JLabel lblUser = new JLabel("User Name : ");
		lblUser.setBackground(Color.BLACK);
		JLabel lblPass = new JLabel("Password ");
		JTextField txtUser = new JTextField();
		JPasswordField txtPass = new JPasswordField();
	
		
		//configured the position and alignment
		btnLogin.setSize(160,30); //x,y,w,h
		lblUser.setSize(160,30); //x,y,w,h
		txtUser.setSize(160,30);
		lblPass.setSize(160,30);
		txtPass.setSize(160,30);
		btnRegister.setSize(160,30);
		
		//adding components to framea
		
		
		JPanel panel = new JPanel(gridLayout);
		EmptyBorder eb = new EmptyBorder(30,30,30,30);
		panel.setBorder(eb);
		
		//adding components to frame
		panel.add(lblUser);	
		panel.add(txtUser);
		panel.add(lblPass);
		panel.add(txtPass);
		panel.add(btnLogin);
		panel.add(btnRegister);
		
		frame.add(panel); // adding intermediatory container
		
		//set layout and make visible
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutDemo();
		
	}
}

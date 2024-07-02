package swingDemo.ignite;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class GridLayoutDemo implements ActionListener{
	
	
	JTextField txtUser;
	JPasswordField txtPass;
	
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
		txtUser = new JTextField();
		txtPass = new JPasswordField();
	
		
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
		
		//register listener to event source
		btnRegister.addActionListener(this);
		btnLogin.addActionListener(this);
	
		//set layout and make visible
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutDemo();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if() {
			String uName = txtUser.getText().toString();
			String pass = txtPass.getPassword().toString();
			
			//create object
			User user = new User(uName,pass);
			
			//write in a file
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E://teaching//java//ignite_cred.txt"));
			oos.writeObject(oos);
			oos.close();
			
			
		}else if(login button is clicked){
			//read credentials from file and validate
		}
		
	
	
	}
}

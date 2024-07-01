package swingDemo.intel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class FirstWindow implements ActionListener{	
	
	
	JTextField txtUser;
	JPasswordField txtPass;
	
	public FirstWindow() {
		//object of top container
		JFrame frame =  new JFrame();
		frame.setTitle("First Window in intel"); // setting title 
		frame.setSize(420,300); //width and height				
		//objects of components
		JLabel lblUser = new JLabel("User Name");		
		JLabel lblPass= new JLabel("Password");		
		JButton btnLogin = new JButton("Login");	
		JButton btnRegister = new JButton("Register");
		
		txtUser = new JTextField(); // it takes single line input
		txtPass = new JPasswordField(); //it mask the characters 	
		//cofigure the components to be displayed
		lblUser.setBounds(40,40,160,30);
		txtUser.setBounds(200,40,180,30);
		lblPass.setBounds(40,110,160,30);
		txtPass.setBounds(200,110,180,30);
		btnLogin.setBounds(40,180,170,30);
		btnRegister.setBounds(200,180,170,30);
		
		//event listener register
		btnLogin.addActionListener(this);
		btnRegister.addActionListener(this);
		
		//adding components to a frame/parent window/toplevel container
		frame.add(lblUser);
		frame.add(lblPass);
		frame.add(btnLogin);
		frame.add(btnRegister);
		frame.add(txtUser);
		frame.add(txtPass);	
		
		//frame.pack();
		frame.setLayout(null); // don't use any layout manager we are setting it manually
		frame.setLocationRelativeTo(null);	
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {		
		FirstWindow fw = new FirstWindow();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand() == "Register") {
			String username = txtUser.getText().toString().trim().toLowerCase();
			String pass= txtPass.getPassword().toString().trim().toLowerCase();
			
			System.out.println(username);
			System.out.println(pass);
			
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter("E://teaching//java//intel_cred.txt"));
				writer.write(username+"\t"+pass);
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			txtUser.setText("");
			txtPass.setText("");
			JOptionPane.showMessageDialog(null,username+" "+pass,"this is title",JOptionPane.WARNING_MESSAGE);
		}else {
			String username = txtUser.getText().toString().trim().toLowerCase();
			String pass= txtPass.getPassword().toString().trim().toLowerCase();

			
			try {
				BufferedReader writer = new BufferedReader(new FileReader("E://teaching//java//intel_cred.txt"));
				String line= writer.readLine();
				String[] cred=line.split("\t");
				if(username.equals(cred[0]) && pass.equals(cred[1])) {
					JOptionPane.showMessageDialog(null,"validated successfully","Authenticated",JOptionPane.WARNING_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null,"validation not successful","Authenticated",JOptionPane.WARNING_MESSAGE);
				}
				
				
				writer.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		
		}
		
	}
}














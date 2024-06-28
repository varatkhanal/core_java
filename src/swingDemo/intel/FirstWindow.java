package swingDemo.intel;

import javax.swing.*;

public class FirstWindow {	
	public FirstWindow() {
		//object of top container
		JFrame frame =  new JFrame();
		frame.setTitle("First Window in intel"); // setting title 
		frame.setSize(400,400); //width and height				
		//objects of components
		JLabel lblUser = new JLabel("User Name");		
		JLabel lblPass= new JLabel("Password");		
		JButton btnDisplay = new JButton(" Display ");		
		JTextField txtUser = new JTextField(); // it takes single line input
		JPasswordField txtPass = new JPasswordField(); //it mask the characters 	
		//cofigure the components to be displayed
		lblUser.setBounds(40,40,160,30);
		txtUser.setBounds(200,40,180,30);
		lblPass.setBounds(40,110,160,30);
		txtPass.setBounds(200,110,180,30);
		btnDisplay.setBounds(100,180,200,30);
		//adding components to a frame/parent window/toplevel container
		frame.add(lblUser);
		frame.add(lblPass);
		frame.add(btnDisplay);
		frame.add(txtUser);
		frame.add(txtPass);			
		frame.setLayout(null); // don't use any layout manager we are setting it manually
		frame.setLocationRelativeTo(null);	
		frame.setVisible(true);
	}
	public static void main(String[] args) {		
		FirstWindow fw = new FirstWindow();
	}
}

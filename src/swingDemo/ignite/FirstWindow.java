package swingDemo.ignite;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class FirstWindow {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("First Window"); //object of frame to be displayed in desktop		
		frame.setSize(450,400);
		//frame.setTitle("First Window");
		frame.setLocationRelativeTo(null);
		
		JButton btnDisplay = new JButton("display");
		btnDisplay.setBounds(130,170,200,30); //x,y,w,h
		
		JLabel lblUser = new JLabel("User Name : ");
		lblUser.setBackground(Color.BLACK);
		lblUser.setBounds(50,50,200,30); //x,y,w,h
		
		frame.add(lblUser);
		frame.add(btnDisplay);
		frame.setLayout(null); //to be  discussed later
		frame.setVisible(true);	
		
	}

}

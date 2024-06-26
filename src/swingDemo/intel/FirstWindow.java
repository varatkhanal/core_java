package swingDemo.intel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstWindow {
	
	public FirstWindow() {
		JFrame frame =  new JFrame();
		frame.setTitle("First Window in intel");
		frame.setSize(400,400); //width and height
		
		
		JLabel lblUser = new JLabel("User Name");		
		JLabel lblPass= new JLabel("Password");
		
		
		
		frame.add(lblUser);
		frame.add(lblPass);
		
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		
		FirstWindow fw = new FirstWindow();
		

	}

}

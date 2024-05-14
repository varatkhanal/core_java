package swingDemo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.awt.event.ActionEvent;

public class SwingDemo implements ActionListener{//B. implement ActionListener
	JTextField textUser;
	JPasswordField textPass;
	
	HashMap<String, String> credentials=new HashMap<>();
	
	LinkedList<String> cred=null;
	
	public SwingDemo(){
		cred = new LinkedList<>();
		//1. creating container
		JFrame f = new JFrame(); // creating container or frame 
		f.setTitle("first window of Hypervisor"); // configure frame
		f.setSize(400,400);	
	
		//2. creating components
		JLabel labelUser = new JLabel("User Name : ");// creating label componenet
		labelUser.setBounds(30,40,150,40); //setting x-axis, y-axis, width, height
		
		JLabel labelPass = new JLabel("Password : ");// creating label componenet
		labelPass.setBounds(30,100,50,40); //setting x-axis, y-axis, width, height
		
		textUser = new JTextField(); //creating textfield components
		textUser.setBounds(180,40,170,40); //setting x-axis, y-axis, width, height
		
		textPass = new JPasswordField(); //creating textfield components
		textPass.setBounds(180,100,170,40); //setting x-axis, y-axis, width, height
		
		JButton btnRegister = new JButton();  // creating an object of component
		btnRegister.setText("Register"); //configuring a component
		btnRegister.setBounds(20,150,170,40);//x,y,l,h
		
		btnRegister.addActionListener(this);  // register action listener
		
		
		JButton btn = new JButton();  // creating an object of component
		btn.setText("submit"); //configuring a component
		btn.setBounds(200,150,170,40);//x,y,l,h
		
		btn.addActionListener(this); //register register listener 
		  
		//3. adding components to container
		f.getContentPane().add(btn); // adding component to frame or container 
		f.getContentPane().add(textUser); // adding component to frame or container 
		f.getContentPane().add(labelUser); // adding component to frame or container 
		f.getContentPane().add(labelPass);
		f.getContentPane().add(textPass);
		f.getContentPane().add(btnRegister);
	
		//4. making container visible	
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	//3. implement actionPerformed method
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand()=="Register") {
			String uname = textUser.getText().toString();
			String pass = textPass.getText().toString();
			// write credintials to file 
			//credentials.put(uname,pass);			
			cred.add(uname);
			cred.add(pass);
			
			JOptionPane.showMessageDialog(null,"register button is clicked","random",JOptionPane.INFORMATION_MESSAGE);
		}else if(e.getActionCommand()=="submit"){
			String u = textUser.getText().toString();
			String p = textPass.getText().toString();
		
			if(u.equals(cred.get(0)) && p.equals(cred.get(1))) {
				//read credentials from file and validate				
				//if validation is successful open dashboard
				
				DashBoard db = new DashBoard();
				
				//JOptionPane.showMessageDialog(null,"username and password are valid",u,JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null,"username and password didn't match",u,JOptionPane.INFORMATION_MESSAGE);
			}			
		}
	}
	
	
	public static void main(String[] args) {
		
		//finally calling constructor by making an object of Swing demo \
		SwingDemo sd = new SwingDemo();
	}

}

package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
//import java.awt.event.
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.JButton;

public class JFrameDemo implements ActionListener{//step 1: implementing action listener
	
	JTextField textUser;
	JTextField textpassword;
	JFrameDemo(){
		JFrame jframe = new JFrame("first application");
		jframe.setSize(400,300);
		
		
		JLabel lblUser = new JLabel("User name : ");
		JLabel lblPassword = new JLabel("Password : ");
		
		textUser = new JTextField(); 
		textpassword = new JTextField(); 
		
		JButton login = new JButton();
		JButton register = new JButton();
		
		
		lblUser.setBounds(10,10,180,30);		
		lblPassword.setBounds(10,50,200,30);	
		
		textUser.setBounds(220,10,180,30);
		textpassword.setBounds(220,50,200,30);
		
		login.setText("Login");
		login.setBounds(10, 100, 180, 30);
			
		register.setText("Register");
		register.setBounds(220, 100, 180, 30);
		
		register.addActionListener(this);// step 2 : registering action listener		
		login.addActionListener(this);

		jframe.getContentPane().setBackground(Color.CYAN);
		jframe.add(lblUser);
		jframe.add(textUser);
		jframe.add(lblPassword);
		jframe.add(textpassword);
		jframe.add(login);
		jframe.add(register);
		
		jframe.setLayout(null);//setting none of the layout manager
		jframe.setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrameDemo jf= new JFrameDemo();
	}

	public void actionPerformed(ActionEvent e) {// step 3 : implement method
		// TODO Auto-generated method stub
		String userName= textUser.getText().toString();
		String userPassword= textpassword.getText().toString();
		
		if(e.getActionCommand()=="Login") {
			
			String str=null;
			
			try {
				BufferedReader bw = new BufferedReader(new FileReader("E://login.txt"));
				str=bw.readLine();
				
				String[] cred= str.split(" ");
				if(cred[0].equals(userName) && cred[1].equals(userPassword)) {
					JOptionPane.showMessageDialog(null, "login successful", "info",JOptionPane.INFORMATION_MESSAGE);	
				
				}else {
					JOptionPane.showMessageDialog(null, "login unsuccessful", "info",JOptionPane.WARNING_MESSAGE);	
				}
					bw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}else {
			//JOptionPane.showMessageDialog(null, "register button has been clicked", "info",JOptionPane.INFORMATION_MESSAGE);
			try {
				BufferedWriter bw = new BufferedWriter(new FileWriter("E://login.txt"));
				bw.write(userName+" "+userPassword);
				bw.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}

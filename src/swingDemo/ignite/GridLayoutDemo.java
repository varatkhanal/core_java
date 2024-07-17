package swingDemo.ignite;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GridLayoutDemo implements ActionListener{
	
	
	JTextField txtUser;
	JPasswordField txtPass;
	JFrame frame;
	
	public GridLayoutDemo(){
		frame = new JFrame(); //object of frame to be displayed in desktop		
		
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

		if(e.getActionCommand() == "Register") {
			String uName = txtUser.getText().toString();
			String pass = txtPass.getPassword().toString();
			
			//create object
			User user = new User(uName,pass);
			
			//write in a file

			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E://teaching//java//ignite_cred.ser"));
				oos.writeObject(user);
				oos.close();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
			
		}else if(e.getActionCommand()=="Login"){
			
			try {
				//read credentials from file
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E://teaching//java//ignite_cred.ser"));				
				User user = (User)ois.readObject();
				ois.close();
				
				//read credentials  from UI
				String uName = txtUser.getText().toString();
				String pass = txtPass.getPassword().toString();
				
				//perform validation 
				if(uName.equals(user.getUserName()) || pass.equals(user.getPassword())) {
					DashBoard db = new DashBoard();
					frame.dispose();
					//JOptionPane.showMessageDialog(null,user.getUserName()+" is validated");
				}else {
					JOptionPane.showMessageDialog(null," Username or password is wrong");
				}
			
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			} catch (FileNotFoundException e2) {
				e2.printStackTrace();
			}
			catch (IOException e3) {
				e3.printStackTrace();
			}
			
		}

	}
}

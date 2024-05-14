package swing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginUI{
	JTextField userNameField;
	JTextField passwordField;
	public LoginUI() {
		JFrame jf = new JFrame(" login module ");
		JPanel jp = new JPanel();
		
		GridLayout gl = new GridLayout(4,2,10,10);
		
		FlowLayout fl = new FlowLayout();
		
		jf.setLayout(fl);
		
		jp.setLayout(gl);
		
		 
		//creating components	
		JLabel jl = new JLabel("User Name : ");
		JLabel jl3 = new JLabel("Password : ");
		userNameField = new JTextField(10);
		passwordField = new JPasswordField(10);
		
		
		JComboBox combo = new JComboBox();
		combo.addItem("BBA");
		combo.addItem("BBABI");
		combo.addItem("BBATT");
		combo.addItem("BCIS");
		
		JButton signBtn=new JButton("sign in");
		JButton registerBtn=new JButton("Register");
		
		//not using setBounds()
//		jl.setBounds(10, 10, 190, 30);
//		userNameField.setBounds(200, 10, 150, 30);
//		jl3.setBounds(10, 40, 190, 30);	
//		passwordField.setBounds(200, 40, 150, 30);
//		signBtn.setBounds(10,90,170,30);
//		registerBtn.setBounds(200,90,170,30);
		
		//however setting size is important
		jl.setSize(190, 30); //user name 
		jl.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		userNameField.setSize(150, 30);
		jl3.setSize(190, 30);//password
		passwordField.setSize(150, 30);
		signBtn.setSize(170,30);
		registerBtn.setSize(170,30);
		
		
		
		//while adding components to container order is important
		jp.add(jl); //label username [0,0] (row,column) position
		jp.add(userNameField); //textfield username [0,1] (row,column) position
		jp.add(jl3);//label password [1,0] (row,column) position
		jp.add(passwordField);  //textfield password [1,1] (row,column) position
		jp.add(signBtn);  //label password [2,0] (row,column) position
		jp.add(registerBtn); //label password [2,2] (row,column) position
		//jp.add(combo);
		
	
		
		signBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userName;
				String password;
			
				userName= userNameField.getText().toString();
				password= passwordField.getText().toString();
				
				//read registerd username and password
				String uName;
				String pass;
				
				String line = null;
				try {
					BufferedReader reader = new BufferedReader(new FileReader("E://teaching//login.txt"));
					line =reader.readLine();
					boolean b=false;
					while(line!=null) {
						String credintials[] = line.split("\t");
						uName=credintials[0];
						pass=credintials[1];
						if(userName.equals(uName) && password.equals(pass)) {
							b=true;
							break;					
						}					
						line =reader.readLine();
					}
					if(b) {
						DashBoard db = new DashBoard();
						jf.dispose();
						JOptionPane.showMessageDialog(null,"username and password matched","Status",JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null,"username and password didn't match","Status",JOptionPane.INFORMATION_MESSAGE);
					}
							
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
				
			}
			
		});
		registerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userName;
				String password;
					try {
						Writer writer = new FileWriter("E://teaching//login.txt",false);
						userName= userNameField.getText().toString();
						password= passwordField.getText().toString();
						//write username and password to a file
						writer.write(userName+"\t"+password+"\n");
						writer.flush();
						writer.close();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}	 
			}
		});
		
		//jf.pack();
		jf.setContentPane(jp);
		jf.setSize(400,160); //setting size of the from to be displayed
		jf.setVisible(true); //enabling the jframe to be displayed
		
	}
	public static void main(String[] args) {
		LoginUI sbd = new LoginUI();
		
	}

}
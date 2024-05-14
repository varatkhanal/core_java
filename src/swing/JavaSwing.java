package swing;

import javax.swing.*;  
import java.awt.Color; 
import java.awt.event.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.GridLayout;
import java.awt.BorderLayout;
//import java

public class JavaSwing implements ActionListener{

	JTextField textUser;
	JTextField textPass;
	
	JavaSwing(){
		JFrame frame = new JFrame("Hello this is Java Swing");
        		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
			
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		
		JMenuItem item_one= new JMenuItem("open");
		JMenuItem item_two= new JMenuItem("edit");
		JMenuItem item_three= new JMenuItem("copy");
		
		//item_three.add(men);
		menu.add(item_one);
		menu.add(item_two);
		menu.add(item_three);
	
		menubar.add(menu);

		GridLayout gl = new GridLayout(3,2,10,10);

		JPanel jp = new JPanel(gl);
	//jp.setLayout(gl);

        	JLabel labelUser = new JLabel("username");
		JLabel labelPass = new JLabel("password");
		textUser = new JTextField();
		 textPass= new JTextField();
		JButton btnsubmit = new JButton("register");
		
		JButton btnLogin = new JButton("login");

		labelPass.setSize(150,30);
		labelUser.setSize(150,30);
		textPass.setSize(150,30);
		textUser.setSize(150,30);
		btnsubmit.setSize(150,30);
		btnLogin.setSize(150,30);

		//labelPass.setSize(150,30);
		// labelUser.setBounds(10,10,150,30);
		// labelPass.setBounds(10,50,150,30);
		
		// textUser.setBounds(200,10,150,30);
		// textPass.setBounds(200,50,150,30);
		
		// btnsubmit.setBounds(20,90,140,30);
		// btnLogin.setBounds(180,90,140,30);

		btnsubmit.addActionListener(this); //  2 step registering
		btnLogin.addActionListener(this);

        jp.add(labelUser);
		jp.add(textUser);
		jp.add(labelPass);
		jp.add(textPass);
		jp.add(btnsubmit);
		jp.add(btnLogin,BorderLayout.EAST);


		//frame.getContentPane().add(jp);
		frame.setContentPane(jp);
		frame.setJMenuBar(menubar);
		frame.getContentPane().setBackground(Color.CYAN);
	
        		//Display the window.
        		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		
			String userName= textUser.getText().toString();
			String userPass = textPass.getText().toString();
			if(e.getActionCommand()=="register"){
				try{
					
					//----------Writing to a file--------- 
					BufferedWriter bf = new BufferedWriter(new FileWriter("stud.txt"));
					bf.write(userName+" "+userPass);
					bf.close();
					
					//----------Writing to a database--------
					//Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");  
					PreparedStatement stmt=con.prepareStatement("insert into user(username,password) values(?,?)");  
					//stmt.setInt(1,101);
					stmt.setString(1,userName); 
					stmt.setString(2,userPass);					  
					int i=stmt.executeUpdate();  
					System.out.println(i+" th inserted record");
				}catch(IOException eof){
	
					eof.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else{
				try{
					//Reading records from the  file
					BufferedReader bf = new BufferedReader(new FileReader("stud.txt"));
					String str=bf.readLine();
					String[] user= str.split(" ");
	
					if(userName.equals(user[0]) && userPass.equals(user[1])){
							JOptionPane.showMessageDialog(null,"validation succeded","Details",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
						System.out.println("not validated");
					}
					bf.close();
					
					//Reading records from the data base table
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new","root","");
					PreparedStatement stmt=con.prepareStatement("select * from user");  
					ResultSet rs=stmt.executeQuery();  
					while(rs.next()){  
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
						
						if(userName.equals(rs.getString(2)) && userPass.equals(rs.getString(3))){
							JOptionPane.showMessageDialog(null,"validation succeded using Database","Details",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
							System.out.println("not validated");
						}
					}    
					 
				}catch(IOException eof){
	
					eof.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
	}
    public static void main(String[] args) {
		JavaSwing js= new JavaSwing();	
    }
}

//event handling 

//Listereners => interfaces 

//implement listeners/interfaces 
//register for the listener 
//provide the implementation for the method actionPerformed









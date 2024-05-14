package swing;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



public class DashBoard implements ActionListener{
	
	JButton btnAdd;
	JButton btnDisplay;
	
	JTextField txtFName;
	JTextField txtLName;
	JTextField txtProgram;
	JTextField txtGender;
	JTextField txtBook;
	
	JRadioButton radioMale;
	JRadioButton radioFemale;
	
	JComboBox comboProgram;
	JComboBox comboSection;
	public DashBoard(){
		JFrame jf = new JFrame("Library Management System");
		JPanel pp = new JPanel();
		
		JPanel p1 = new JPanel();
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEFT,10,10);
		GridLayout gl = new GridLayout(7,2,10,10);
		
		pp.setLayout(gl);			
		p1.setLayout(fl);		//top,left,bottom,right
		pp.setBorder(new EmptyBorder(10, 10, 10, 15));
				
		//creating components	
		JLabel lblFName = new JLabel("First Name:");
		JLabel lblLName = new JLabel("Last Name");
		JLabel lblProgram = new JLabel("Program:");
		JLabel lblGender = new JLabel("Gender");
		JLabel lblBook = new JLabel("Book Taken:");
		JLabel lblSection = new JLabel("Section");
			
		 txtFName = new JTextField(10);
		 txtLName = new JTextField(10);
		 txtBook = new JTextField(10);
		
		radioMale = new JRadioButton("Male");
		radioFemale = new JRadioButton("Female");
		
		p1.add(radioMale);
		p1.add(radioFemale);
		
		ButtonGroup rg =new ButtonGroup();
		rg.add(radioMale);
		rg.add(radioFemale);
		
		//String programs[] = {"BBA","BBA-TT","BCIS","BBA-BI"};
		String section[] = {"Maxthon","Mozilla","Deism","Divine","Enum","Efika","Fusion","Fourier","Grit","Garnet"};
		
		comboProgram = new JComboBox();
		comboProgram.addItem("BBA");
		comboProgram.addItem("BBA-TT");
		comboProgram.addItem("BCIS");
		comboProgram.addItem("BBA-BI");
		
		comboSection = new JComboBox(section);	
		comboSection.addItem("Jasper");
		comboSection.addItem("Jasmin");
		comboSection.addItem("Icon");
		comboSection.addItem("Image");
		comboSection.addItem("Ideal");
		comboSection.addItem("helm");
		
		Checkbox cb = new Checkbox();
		
		cb.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		
		
		comboProgram.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==ItemEvent.SELECTED) {
					if(e.getItem()=="BCIS") {
						comboSection.removeAllItems();
						comboSection.addItem("Grit/Garnet");
						comboSection.addItem("Fusion");
						comboSection.addItem("Fourier");
						comboSection.addItem("Enum/Efika");
						comboSection.addItem("Devine/Deism");
						comboSection.addItem("Maxthon");	
					}else if(e.getItem()=="BBA-BI") {
						comboSection.removeAllItems();
						comboSection.addItem("Trend");
						comboSection.addItem("Transit");
						comboSection.addItem("Forex");
						comboSection.addItem("Fiscal");
					}else if(e.getItem()=="BBA") {
						comboSection.removeAllItems();
						comboSection.addItem("Jasper");
						comboSection.addItem("Jasmin");
						comboSection.addItem("Icon");
						comboSection.addItem("Image");
						comboSection.addItem("Ideal");
						comboSection.addItem("helm");
					}
					
				}
				
			}
		});
		
		btnAdd=new JButton("Add");
		btnDisplay=new JButton("Display");
		
		lblFName.setSize(100, 30);
		txtFName.setSize(160, 30);
		lblLName.setSize(100, 30);	
		txtLName.setSize(160, 30);
		lblGender.setSize(100, 30);
		p1.setSize(160, 30);
		lblProgram.setSize(100, 30);	
		comboProgram.setSize(160, 30);
		lblSection.setSize(100, 30);	
		comboSection.setSize(160, 30);
		lblBook.setSize(100, 30);
		txtBook.setSize(160, 30);
		
		btnAdd.setSize(100,30);
		btnDisplay.setSize(100,30);
		
		/*
		 * p1.add(jl); p1.add(celField); p1.add(jl3); p1.add(fahField);
		 */	
		/* p2.add(b1); */
		
		pp.add(lblFName);
		pp.add(txtFName);
		pp.add(lblLName);
		pp.add(txtLName);
		pp.add(lblGender);
		pp.add(p1);
		pp.add(lblProgram);
		pp.add(comboProgram);
		pp.add(lblSection);
		pp.add(comboSection);
		pp.add(lblBook);
		pp.add(txtBook);
		pp.add(btnAdd);
		pp.add(btnDisplay);
				
		btnAdd.addActionListener(this);//registering action listener
		btnDisplay.addActionListener(this);//registering action listener
		
		//jf.pack();
		jf.setContentPane(pp); // finally adding jpanel(child container) to parent container
		jf.setSize(400,340); //setting size of the from to be displayed
		//jf.setLayout(lm);
		jf.setVisible(true); //enabling the jframe to be displayed
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		if(e.getSource()==btnAdd) {
			String fName= txtFName.getText().toString();
			String lName= txtLName.getText().toString();
			
			String gender=null;
			if(radioMale.isSelected()) {
				gender="male";
			}else {
				gender="female";
			}
			String program= (String) comboProgram.getSelectedItem();
			String section= (String) comboSection.getSelectedItem();
			String book = txtBook.getText().toString();
			
			User user = new User();
			user.setFirstName(fName);
			user.setSecondName(lName);
			user.setGender(gender);
			user.setSection(section);
			user.setProgram(program);
			user.setBookTaken(book);
			
			FileOperation.writeFile(user);
			try {
				Writer writer = new FileWriter("E://teaching//StudentInfo.txt",true);
				//write username and password to a file
				writer.write(fName+"\t"+lName+"\t"+gender+"\t"+program+"\t"+section+"\t"+book+"\n");
				writer.flush();
				writer.close();				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}		
			
		}else if(e.getActionCommand()=="Display") {
			String fname;
			String lname,gender,program,section;			
			String line = null;
			try {
				BufferedReader reader = new BufferedReader(new FileReader("E://teaching//StudentInfo.txt"));
				line =reader.readLine();
				//while(line!=null) {
				String credintials[] = line.split("\t");
				fname=credintials[0];
				lname=credintials[1];
				gender=credintials[2];
				program=credintials[3];
				section=credintials[4];				
			    JOptionPane.showMessageDialog(null,fname+"\t"+lname+"\t"+gender+"\t"+program+"\t"+section,"Status",JOptionPane.INFORMATION_MESSAGE);										
			    DisplayTable dt = new DisplayTable();
			    
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		DashBoard bd = new DashBoard();
		
	}
	

}


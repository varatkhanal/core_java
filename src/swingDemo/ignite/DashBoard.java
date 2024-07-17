package swingDemo.ignite;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class DashBoard implements ActionListener{
	JTextField txtFirst, txtLast, txtBook;
	JComboBox comboProgram, comboSection;
	JRadioButton radioMale, radioFemale;
	
	public DashBoard() {
		//frame
		JFrame frame = new JFrame("Library Management System");
		frame.setSize(450, 400);
		
		//panel
		JPanel parentPanel = new JPanel();
		
		JPanel genderPanel = new JPanel();
		
		//object of emptyborder => to create margins and paddings 
		EmptyBorder eb = new EmptyBorder(15,15,15,15);//top, left, bottom,right 		
		parentPanel.setBorder(eb);
		
		//create object of font 
		Font font = new Font(Font.SERIF,Font.BOLD,20);
				
		//object of color
		Color color = new Color(200,100,0);		
		
		//layout manager
		GridLayout gb = new GridLayout(7,2,10,10);
		
		//setlayout to panel
		parentPanel.setLayout(gb);
		parentPanel.setFont(font);
		//parentPanel.setBackground(color);
		//parentPanel.setForeground(new Color(255,255,255));
		
		//create components
		JLabel lblFirst = new JLabel("First Name");
		
		JLabel lblLast = new JLabel("Last Name");
		JLabel lblGender = new JLabel("Gender");
		JLabel lblProgram = new JLabel("Program");
		JLabel lblSection = new JLabel("Section");
		JLabel lblBook = new JLabel("Book");
		
		 txtFirst = new JTextField();
		 txtLast = new JTextField();
		//JTextField txtGender = new JTextField();
		
		 radioMale = new JRadioButton("Male");
		 radioFemale = new JRadioButton("Female");
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(radioMale);
		rg.add(radioFemale);
				
		//String[] programs = {"MBA","MBAEvening","BCSIT","BCIS","BBA","BBATT","BBA Finance"};
		
		 comboProgram = new JComboBox();
		comboProgram.addItem("MBA");
		comboProgram.addItem("MBA Evening");
		comboProgram.addItem("BCSIT");
		comboProgram.addItem("BBA");
		comboProgram.addItem("BBA Finance");
		comboProgram.addItem("BBATT");
				
		String[] sections = {"Enum","Efika","Fusion","Fourier","Grit","Garnet","Hypervisor","Ignite","Intel","Trend","Transit","Forex","Fiscal","Jasper","Jasmin","Minivet","Kastamandap"};
		
		comboSection = new JComboBox(sections);
		//comboSection.addItem("");
		
		txtBook = new JTextField();
				
		JButton btnAdd = new JButton("Add");
		JButton btnDisplay = new JButton("Display");
		
		//set size to components
		lblFirst.setSize(180,30); //width, height
		
		lblLast.setSize(180,30); //width, height
		lblGender.setSize(180,30); //width, height
		lblProgram.setSize(180,30); //width, height
		lblSection.setSize(180,30); //width, height
		lblBook.setSize(180,30); //width, height
		
		txtFirst.setSize(180,30); //width, height
		txtLast.setSize(180,30); //width, height
		//txtGender.setSize(180,30); //width, height
		comboProgram.setSize(180,30); //width, height
		comboSection.setSize(180,30); //width, height
		txtBook.setSize(180,30); //width, height
		
		
		btnAdd.setSize(180,30);
		btnDisplay.setSize(180,30);
		
		lblFirst.setFont(font);
		lblLast.setFont(font);
		lblGender.setFont(font);
		lblProgram.setFont(font);
		lblSection.setFont(font);
		lblBook.setFont(font);
		
		comboProgram.setFont(font);
		comboSection.setFont(font);
		
		//add radio button to gender panel
		genderPanel.add(radioMale);
		genderPanel.add(radioFemale);
		
		//add components to panel
		parentPanel.add(lblFirst);
		parentPanel.add(txtFirst);
		parentPanel.add(lblLast);
		parentPanel.add(txtLast);
		parentPanel.add(lblGender);
		parentPanel.add(genderPanel);
		//parentPanel.add(radioFemale);
		parentPanel.add(lblProgram);
		parentPanel.add(comboProgram);
		
		parentPanel.add(lblSection);
		parentPanel.add(comboSection);
		parentPanel.add(lblBook);
		parentPanel.add(txtBook);
		
		parentPanel.add(btnAdd);
		parentPanel.add(btnDisplay);
		
		//add panel to frame		
		frame.setContentPane(parentPanel);
		
		//register listener 
		btnAdd.addActionListener(this);
		btnDisplay.addActionListener(this);
			
		//display window/frame in desktop
		frame.setVisible(true);		
	}
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand()=="Add") {
			
			String firstName, lastName, book;
				
			firstName= txtFirst.getText().toString();
			lastName= txtLast.getText().toString();
			book = txtBook.getText().toString();
			
			String program = (String)comboProgram.getSelectedItem();
			String section = (String)comboSection.getSelectedItem();
			
			String gender = null;
			
			if(radioMale.isSelected()) {
				gender ="male";
			}else {
				gender = "female";
			}
			
			//write to a file	
			
			BookIssue bi = new BookIssue(firstName,lastName,gender,program,section,book);
			
			try {
				ObjectOutputStream objectOutput = new ObjectOutputStream(new FileOutputStream("E://teaching//java//intel_dash.ser"));
			    objectOutput.writeObject(bi);
			    objectOutput.close();			
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			txtFirst.setText("");
			txtLast.setText("");
			txtBook.setText("");
			radioMale.setSelected(false);
			radioMale.setSelected(false);
			comboProgram.setSelectedIndex(0);
			comboSection.setSelectedIndex(0);
			
			//JOptionPane.showMessageDialog(null,firstName+" "+lastName+" "+gender+" "+program+" "+section+" "+book);						
		}else {
			
			BookIssue bi = new BookIssue();
			
			try {
				ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("E://teaching//java//intel_dash.ser"));
			    bi = (BookIssue)objectInput.readObject();
			    objectInput.close();			    
			    JOptionPane.showMessageDialog(null,bi.toString());			
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}catch(ClassNotFoundException f) {
				f.printStackTrace();
			}
			
		}
	
	}
	public static void main(String[] args) {
		new DashBoard();
	}
	

}

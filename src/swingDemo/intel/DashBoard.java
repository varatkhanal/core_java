package swingDemo.intel;

import javax.swing.JFrame;
import javax.swing.*;

import java.awt.*;

public class DashBoard {
	
	public DashBoard() {
		JFrame frame = new JFrame("Library  Management System");
		frame.setSize(500,500);
		
		//parent panel
		JPanel parentPanel = new JPanel();
		
		JLabel lblFirst = new JLabel("First Name");
		JLabel lblLast = new JLabel("Last Name");
		JLabel lblGender = new JLabel("Gender");
		JLabel lblProgram = new JLabel("Program");
		JLabel lblSection = new JLabel("Section");
		JLabel lblBook = new JLabel("Book");
		
		JTextField txtFirst = new JTextField();
		JTextField txtLast = new JTextField();
		JTextField txtGender = new JTextField();
		JTextField txtProgram = new JTextField();
		JTextField txtSection = new JTextField();
		JTextField txtBook = new JTextField();
		
		
		lblFirst.setSize(180,30); //width, height
		lblLast.setSize(180,30); //width, height
		lblGender.setSize(180,30); //width, height
		lblProgram.setSize(180,30); //width, height
		lblSection.setSize(180,30); //width, height
		lblBook.setSize(180,30); //width, height
		
		txtFirst.setSize(180,30); //width, height
		txtLast.setSize(180,30); //width, height
		txtGender.setSize(180,30); //width, height
		txtProgram.setSize(180,30); //width, height
		txtSection.setSize(180,30); //width, height
		txtBook.setSize(180,30); //width, height
		
		
		JButton btnAdd = new JButton("Add");
		JButton btnDisplay = new JButton("Display");
		
		btnAdd.setSize(180,30);
		btnDisplay.setSize(180,30);
		
		GridLayout gb = new GridLayout(7,2,10,10);//row, column, vgap,hgap
		parentPanel.setLayout(gb);
		
		
		//add componensts to panel
		parentPanel.add(lblFirst);
		parentPanel.add(txtFirst);
		
		parentPanel.add(lblLast);
		parentPanel.add(txtLast);
		
		parentPanel.add(lblGender);
		parentPanel.add(txtGender);
		parentPanel.add(lblProgram);
		parentPanel.add(txtProgram);
		parentPanel.add(lblSection);
		parentPanel.add(txtSection);
		parentPanel.add(lblBook);
		parentPanel.add(txtBook);
		parentPanel.add(btnAdd);
		parentPanel.add(btnDisplay);
		
		//add panel to frame
		
		frame.setContentPane(parentPanel);
				
		//set layout and make it visible
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}

package swingDemo;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DashBoard implements ActionListener{
	JTextField textFirst, textLast, textBook;
	JRadioButton rbMale,rbFemale,rbOthers;
	JComboBox comboProgram,comboSection;
	JButton btnAdd ;
	
	JButton btnDisplay;
	public DashBoard() {
		JFrame frame = new JFrame("Dash board");
		
		//create panel
		JPanel panel = new JPanel();
		
		//create grid layout
		GridLayout gidLayout = new GridLayout(7,2);
		
		//setting layout to panel
		panel.setLayout(gidLayout);
		
		//creating components
		
		JLabel labelFirst = new JLabel("First name");
		JLabel labelLast = new JLabel("Last name");
		JLabel labelGender = new JLabel("Gender");
		JLabel labelProgram = new JLabel("Program");
		JLabel labelSection = new JLabel("Section");
		JLabel labelBook = new JLabel("Book Taken");
		
		labelFirst.setSize(200,40);
		labelLast.setSize(200,40);
		labelGender.setSize(200,40);
		labelProgram.setSize(200,40);
		labelSection.setSize(200,40);
		labelBook.setSize(200,40);
		
		textFirst = new JTextField();
		textLast = new JTextField();
		//JTextField textGender = new JTextField();	
		
		JPanel genderPanel =new JPanel();
		genderPanel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		
		rbMale = new JRadioButton("male");
		rbFemale = new JRadioButton("female");
		rbOthers = new JRadioButton("others");
		
		ButtonGroup rg = new ButtonGroup();
		rg.add(rbMale);
		rg.add(rbFemale);
		rg.add(rbOthers);
		
		genderPanel.add(rbMale);
		genderPanel.add(rbFemale);
		genderPanel.add(rbOthers);
			
		String[] programs = {"BBA","BCIS","BCSIT","BBATT","BBABI"};		
		comboProgram = new JComboBox(programs);
		
//		comboProgram.addItemListener(new ItemEvent(source, id, item, stateChange) {
//			
//		});
		
		String[] sections = {"Hypervisor","Grit/Garnet","Fusion","Fourier","Enum","Efika","Divine","Deism","Maxthon","Mozilla"};		
		comboSection = new JComboBox(sections);
		
		textBook = new JTextField();
		
		textFirst.setSize(200,40);
		textLast.setSize(200,40);
		//textGender.setSize(200,40);
		comboProgram.setSize(200,40);
		comboSection.setSize(200,40);
		textBook.setSize(200,40);
		
		
		btnAdd = new JButton("Add");
		btnDisplay = new JButton("Display");
		
		btnDisplay.addActionListener(this);
		btnAdd.addActionListener(this);
		
		//adding components to panel
		panel.add(labelFirst);
		panel.add(textFirst);
		panel.add(labelLast);	
		panel.add(textLast);
		panel.add(labelGender);
		panel.add(genderPanel);
		panel.add(labelProgram);
		panel.add(comboProgram);
		panel.add(labelSection);
		panel.add(comboSection);
		panel.add(labelBook);
		panel.add(textBook);
		panel.add(btnAdd);
		panel.add(btnDisplay);
		
		frame.add(panel);
		
		frame.setSize(500,400);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAdd) {
			
			String fname, lname, book, gender, section, program;
			
			fname=textFirst.getText().toString();
			lname=textLast.getText().toString();
			
			if(rbMale.isSelected()) {
				gender="Male";
			}else if(rbFemale.isSelected()) {
				gender="Female";
			}else {
				gender="Others";
			}
			
			program=comboProgram.getSelectedItem().toString();
			section=comboSection.getSelectedItem().toString();
				
			book=textBook.getText().toString();
			
			//writing records to a file
			try {
				FileWriter fw =new FileWriter("E://teaching//HypervisorInfo.txt",true);
				fw.write(fname+" "+lname+" "+gender+" "+program+" "+section+" "+book);
				fw.close();
			}catch(IOException ee) {
				ee.printStackTrace();
				
			}
			
		}else {
			//reading records from file
			try {
				FileReader fr =new FileReader("E://teaching//HypervisorInfo.txt");
				BufferedReader br = new BufferedReader(fr);
				String str=br.readLine();
				JOptionPane.showMessageDialog(null,str,"info",JOptionPane.INFORMATION_MESSAGE);
				fr.close();
				br.close();
			}catch(IOException ee) {
				ee.printStackTrace();
				
			}
			
			//
		}
		
	}
	
	public static void main(String[] args) {
		
		new DashBoard();
		
	}
}

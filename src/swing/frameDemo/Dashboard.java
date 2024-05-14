package swing.frameDemo;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Dashboard implements ActionListener{
	//initiallizing jframe
	JFrame jf1;
	//initiallizing jtextfield
	JTextField fnTxt;
	JTextField lnTxt;
	JComboBox genTxt;
	JTextField addyTxt;
	JTextField contTxt;
	JTextField rollTxt;
	JComboBox progTxt;
	
	JTextField javaTxt;
	JTextField mathTxt;
	JTextField engTxt;
	JTextField macroTxt;
	
	public Dashboard(){
		jf1= new JFrame("Record");
		
		
		//creating panels and adding layouts
		JPanel jp1;
		jp1= new JPanel(new GridBagLayout());
		GridBagConstraints gbc= new GridBagConstraints();
		
		
		//creating jlabel and jtextfield
		JLabel fn= new JLabel("First Name");
		JLabel ln= new JLabel("Last Name");
		JLabel gen= new JLabel("Gender");
		JLabel addy= new JLabel("Address");
		JLabel cont= new JLabel("Contact");
		JLabel roll= new JLabel("Roll no");
		JLabel prog= new JLabel("Program");
		
		JLabel marks= new JLabel("Marks of:");
		JLabel java= new JLabel("Java");
		JLabel math= new JLabel("Math");
		JLabel eng= new JLabel("English");
		JLabel macro= new JLabel("Macro Economics");
		
		fnTxt= new JTextField();
		lnTxt= new JTextField();
		
		String[] g={"Male","Female","Other"};
		genTxt= new JComboBox(g);
		
		addyTxt= new JTextField();
		contTxt= new JTextField();
		rollTxt= new JTextField();
		
		String[] p={"BCIS","BBA","BBA-BI","BBA-TT"};
		progTxt= new JComboBox(p);
		
		javaTxt= new JTextField();
		mathTxt= new JTextField();
		engTxt= new JTextField();
		macroTxt= new JTextField();
		
		//creating buttons 
		JButton add= new JButton("Add");
		JButton display= new JButton("Display");
		
		//adding into the panels
		
		//first name
		gbc.fill= GridBagConstraints.HORIZONTAL;
		//This field is used when the component's display area is
		//largerthan the component's requested size.
		//It determines whether toresize the component, and if so, how. 
		
		gbc.ipadx=20; //This field specifies the internal padding of the component, 
					//how muchspace to add to the minimum width of the component.
					//The width ofthe component is at least its minimum width plus ipadx pixels. 
		gbc.ipady=20;//This field specifies the internal padding, that is, how muchspace to
						//add to the minimum height of the component.
					//The height ofthe component is at least its minimum height plus ipady pixels. 
		
		
		
		gbc.gridx=0;
		gbc.gridy=0;
		
		
		jp1.add(fn,gbc);
		
		gbc.fill= GridBagConstraints.BOTH;
		gbc.ipadx=10;
		gbc.ipady=10;
		gbc.gridx=1;
		gbc.gridy=0;
		
		
		jp1.add(fnTxt,gbc);
		
		//lastname
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=1;
		
		
		jp1.add(ln,gbc);
		gbc.gridx=1;
		gbc.gridy=1;
		jp1.add(lnTxt,gbc);
		
		//gender
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=2;
		jp1.add(gen,gbc);
		gbc.gridx=1;
		gbc.gridy=2;
		jp1.add(genTxt,gbc);
		
		//address
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=3;
		jp1.add(addy,gbc);
		gbc.gridx=1;
		gbc.gridy=3;
		jp1.add(addyTxt,gbc);
		
		//contacts
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=4;
		jp1.add(cont,gbc);
		gbc.gridx=1;
		gbc.gridy=4;
		jp1.add(contTxt,gbc);
		
		//rollno
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=5;
		jp1.add(roll,gbc);
		gbc.gridx=1;
		gbc.gridy=5;
		jp1.add(rollTxt,gbc);
		
		//program
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=100;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=6;
		jp1.add(prog,gbc);
		gbc.gridx=1;
		gbc.gridy=6;
		jp1.add(progTxt,gbc);
		
		//marks
		gbc.gridx=0;
		gbc.gridy=7;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridwidth=2;
		jp1.add(marks,gbc);
		
		//java
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=8;
		jp1.add(java,gbc);
		gbc.gridx=1;
		gbc.gridy=8;
		jp1.add(javaTxt,gbc);
		
		//math
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=9;
		jp1.add(math,gbc);
		gbc.gridx=1;
		gbc.gridy=9;
		jp1.add(mathTxt,gbc);
		
		//english
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=10;
		jp1.add(eng,gbc);
		gbc.gridx=1;
		gbc.gridy=10;
		jp1.add(engTxt,gbc);
		
		//macro
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.ipadx=20;
		gbc.ipady=20;
		gbc.gridx=0;
		gbc.gridy=11;
		jp1.add(macro,gbc);
		gbc.gridx=1;
		gbc.gridy=11;
		jp1.add(macroTxt,gbc);
		
		//add and display
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=12;
		jp1.add(add,gbc);
		
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridx=0;
		gbc.gridy=13;
		jp1.add(display,gbc);
		
		//add-action listener
		add.addActionListener(this);
		
		//Display- action listener
		display.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent a){
				//Display display=new Display();
			}
		});
		jf1.add(jp1);	
		jf1.pack();
		jf1.setVisible(true);
		}
		
			public void actionPerformed(ActionEvent ae){
				
				//importing all the given values by the user
				String firstName=fnTxt.getText().toString();
				String lastName=lnTxt.getText().toString();
				
				String gndr=genTxt.getSelectedItem().toString();
				String gender=gndr;
				
				String address=addyTxt.getText().toString();
				String contact=contTxt.getText().toString();
				String rollNo=rollTxt.getText().toString();
				
				String pgm=progTxt.getSelectedItem().toString();
				String program=pgm;
			
				String javaMarks=javaTxt.getText().toString();
				String mathMarks=mathTxt.getText().toString();
				String englishMarks=engTxt.getText().toString();
				String macroMarks=macroTxt.getText().toString();
				
//				User user=new User();
//				FileOperation fo=new FileOperation();
				
				//setting the obtained value
//				user.setFirstName(firstName);
//				user.setSecondName(lastName);
//				user.setGender(gender);
//				user.setAddress(address);
//				user.setContact(contact);
//				user.setRollNo(rollNo);
//				user.setProgram(program);
//				user.setJava(javaMarks);
//				user.setMaths(mathMarks);
//				user.setEnglish(englishMarks);
//				user.setMacro(macroMarks);
				
				//writing to file using write file method
				//fo.writeFile(user);
				
				JOptionPane.showMessageDialog(null,"Information Added Successfully","Alert",JOptionPane.INFORMATION_MESSAGE);
				}
			
		
		public static void main(String[] args){
			Dashboard db = new Dashboard();
		}
	
}
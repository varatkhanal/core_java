package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetBoundsDemo implements ActionListener{

	  JTextField fahField;
	  
	  JTextField celField;
	
	public SetBoundsDemo() {
		JFrame jf = new JFrame("Temp Converter");
		
		//creating components	
		JLabel lblCel = new JLabel("Tempeture in Celsious:");
		JLabel lblFah = new JLabel("Tempeture in Fahrenheit");
		celField = new JTextField(10);
		fahField = new JTextField(10);
		
		//UIDefaults ud = new UIDefaults();
		
		JButton b1=new JButton("convert");
		// b2=new JButton("vert");
		
		lblCel.setBounds(10, 10, 190, 30);
		celField.setBounds(200, 10, 150, 30);
		lblFah.setBounds(10, 40, 190, 30);	
		fahField.setBounds(200, 40, 150, 30);
		b1.setBounds(40,90,170,30);
		
		fahField.setEditable(false); // cannot input in this text
		
		jf.add(lblCel);
		jf.add(celField);
		jf.add(lblFah);
		jf.add(fahField);  
		jf.add(b1);

		b1.addActionListener(this); // registering action listener
		
		//jf.pack();
		//jf.setContentPane(); // finally adding jpanel(child container) to parent container
		jf.setSize(400,160); //setting size of the from to be displayed
		jf.setLayout(null);
		jf.setVisible(true); //enabling the jframe to be displayed
		
	}
	public static void main(String[] args) {
		SetBoundsDemo sbd = new SetBoundsDemo();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		int cel = Integer.parseInt(celField.getText().toString());	
		float fah = (float)(9.0/5.0*cel)+32;	
		fahField.setText(Float.toString(fah));
	}
	

}

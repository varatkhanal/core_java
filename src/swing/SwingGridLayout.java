package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingGridLayout {
	SwingGridLayout(){
		JFrame f = new JFrame();//creating Jframe top level container 
		FlowLayout flow=new FlowLayout(FlowLayout.LEADING,10,10);
		f.setLayout(flow);
		
		//creating child container-1
		JPanel p = new JPanel();
		GridLayout bl = new GridLayout(2,2); // deciding layout to be used to arrange component
		p.setLayout(bl); //setting layout in the container
		JLabel jl = new JLabel("Tempeture in Celsious:");
		jl.setSize(180,40);
		JLabel jl3 = new JLabel("Tempeture in Fahrenheit");
		jl3.setSize(180,40);
		JTextField celField = new JTextField();
		celField.setSize(180,40);
		JTextField fahField = new JTextField();
		fahField.setSize(180,40);
		fahField.setEditable(false);
		//adding components to child container
		p.add(jl);
		p.add(celField);
		p.add(jl3);
		p.add(fahField);
		//p.add(b1);		
		
		//creating child container-2
		JPanel pp = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.TRAILING,10,10);
		pp.setLayout(fl);
		pp.setSize(300, 40);
		//creating components	
		JButton b1=new JButton("convert");
		b1.setSize(180,40);
		pp.add(b1);
			
		//f.pack();
		f.add(p); // finally adding jpanel(child container) to parent container
		f.add(pp);
		
		
		f.setSize(300,150); //setting size of the from to be displayed
		f.setVisible(true); //enabling the jframe to be displayed
	}
	public static void main(String []args){
		SwingGridLayout sbl = new SwingGridLayout();
	}
}	

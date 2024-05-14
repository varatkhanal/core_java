package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingFlowLayout {
	SwingFlowLayout(){
		JFrame f = new JFrame();
		//JPanel p = new JPanel();
		FlowLayout fl =new FlowLayout(FlowLayout.LEFT,10,10);
		
		f.setLayout(fl); //setting layout in the container

		
		//creating buttons
		JLabel jl = new JLabel("Counter:");
		JTextField countField = new JTextField(10);
		JButton b1=new JButton("count");
		
		f.add(jl);
		f.add(countField);
		f.add(b1);
		
		
		//f.setContentPane(p); // finally adding jpanel(child container) to parent container
		f.setSize(300,100);
		f.setVisible(true);
	}
	public static void main(String []args){
		SwingFlowLayout sbl = new SwingFlowLayout();
	}
}


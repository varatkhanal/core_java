package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingBorderLayout {
	SwingBorderLayout(){
		JFrame f = new JFrame();//creating Jframe top level container 
		//JPanel p = new JPanel();//creating child container 
		BorderLayout bl = new BorderLayout(); // deciding layout to be used to arrange component
		f.setLayout(bl); //setting layout in the container
		
		//creating buttons
		JButton b1=new JButton("this is north");
		JButton b2=new JButton("this is SOUTH");
		JButton b3=new JButton("EAST");
		JButton b4=new JButton("WEST");
		JButton b5=new JButton("CENTER");
		
		JLabel jl = new JLabel("hello");
		jl.setBackground(Color.GREEN);
		
		b5.setBackground(Color.MAGENTA);
		
		//adding button(component) in the container specifying where to arrange each button
		f.add(b1,BorderLayout.NORTH);
		f.add(b4,BorderLayout.WEST);
		f.add(b2,BorderLayout.SOUTH);
		f.add(jl,BorderLayout.EAST);
		f.add(b5,BorderLayout.CENTER);
		
		//f.setContentPane(p); // finally adding jpanel(child container) to parent container
		f.setSize(300,300); //setting size of the from to be displayed
		f.setVisible(true); //enabling the jframe to be displayed
	}
	public static void main(String []args){
		SwingBorderLayout sbl = new SwingBorderLayout();
	}
}


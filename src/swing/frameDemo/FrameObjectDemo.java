   package swing.frameDemo;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameObjectDemo{
	public FrameObjectDemo() {			
		JFrame f = new JFrame();//creating Jframe top level container
		f.setTitle("first frame");//setting title for the frame
		
		JButton jb = new JButton("Submit");// component
		
		f.getContentPane().add(jb);
		
		f.setLayout(null);
		f.setSize(250,250);//setting size of the frame to be displayed
		f.setVisible(true);//enabling the jframe to be display in desktop
	}
	public static void main(String[] args) {
			FrameObjectDemo fd = new FrameObjectDemo();
	}
}

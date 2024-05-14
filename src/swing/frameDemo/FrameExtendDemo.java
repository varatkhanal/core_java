package swing.frameDemo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameExtendDemo extends JFrame{

	public FrameExtendDemo() {
		
		
		JButton jb = new JButton("Submit");// component
		
		getContentPane().add(jb);
		setTitle("Second");	
		setSize(300,300);
		setVisible(true);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameExtendDemo fed = new FrameExtendDemo();

	}

}

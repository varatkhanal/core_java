package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class PanelDemo {
	public PanelDemo() {
		JFrame f = new JFrame();//creating Jframe top level container 
		f.setTitle("First");
		JPanel panel = new JPanel();//creating child container 
		
		f.setContentPane(panel);
		
		f.setSize(400,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		PanelDemo fd = new PanelDemo();
	}
}

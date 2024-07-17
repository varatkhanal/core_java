package swing;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingFlowLayout {
	SwingFlowLayout(){
		JFrame f = new JFrame();
		//JPanel p = new JPanel();
		FlowLayout fl =new FlowLayout(FlowLayout.LEFT,10,10);
		
		f.setLayout(fl); //setting layout in the container

		
		//creating buttons
		JLabel labelRupee = new JLabel("Amount in Rupees:");
		JTextField countField = new JTextField(10);
		String[] currencies = {"Dollar","Pound","Euro","Yen"};
		JComboBox comboCurrency = new JComboBox(currencies);
		JLabel labelResult = new JLabel("resut");
		
		countField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ae) {
				int rupees =(int)ae.getKeyChar();
				if("Dollar"==(String)comboCurrency.getSelectedItem()) {
					labelResult.setText(Float.toString((float)(rupees/134.0)));
				}
			}
		});
		
		f.add(labelRupee);
		f.add(countField);
		f.add(comboCurrency);
		f.add(labelResult);
			
		//f.setContentPane(p); // finally adding jpanel(child container) to parent container
		f.setSize(300,100);
		f.setVisible(true);
	}
	public static void main(String []args){
		SwingFlowLayout sbl = new SwingFlowLayout();
	}
}


package swing;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingGridLayout {
	SwingGridLayout(){
		JFrame f = new JFrame("Currency Converter");//creating Jframe top level container 
		FlowLayout flow=new FlowLayout(FlowLayout.CENTER,10,10);
		f.setLayout(flow);
		
		//creating child container-1
		JPanel p = new JPanel();
		GridLayout bl = new GridLayout(3,2,15,15); // deciding layout to be used to arrange component
		p.setLayout(bl); //setting layout in the container
		JLabel jl = new JLabel("Nepali Rupees:");
		jl.setSize(180,40);
		JLabel jl3 = new JLabel("Indin Rupees:");
		jl3.setSize(180,40);
		JLabel jl4 = new JLabel("Dollar:");
		jl3.setSize(180,40);
		JTextField celField = new JTextField();
		celField.setSize(180,40);
		JTextField fahField = new JTextField();
		fahField.setSize(180,40);
		fahField.setEditable(false);
		
		JTextField dollarField = new JTextField();
		dollarField.setSize(180,40);
		dollarField.setEditable(false);
		//adding components to child container
		p.add(jl);
		p.add(celField);
		p.add(jl3);
		p.add(fahField);
		p.add(jl4);
		p.add(dollarField);
		//p.add(b1);		
		
		//creating child container-2
		JPanel pp = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER,10,10);
		pp.setLayout(fl);
		//creating components	
		JButton b1=new JButton("Convert");
		b1.setSize(220,40);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ee) {
				float nep = Float.parseFloat(celField.getText().toString());
				double dollar = (double)nep/134.0;
				double indian = (double)nep/1.6;
				fahField.setText(Double.toString(indian));
				dollarField.setText(Double.toString(0.9045));
			}
		});
		//pp.add(p);
		pp.add(b1);
		
		JPanel extra = new JPanel(new FlowLayout());	
		extra.add(p); // finally adding jpanel(child container) to parent container
		extra.add(pp);
				
		f.add(p);
		f.add(pp);
		f.pack();
		f.setSize(300,150); //setting size of the from to be displayed
		f.setVisible(true); //enabling the jframe to be displayed
	}
	public static void main(String []args){
		SwingGridLayout sbl = new SwingGridLayout();
	}

}	

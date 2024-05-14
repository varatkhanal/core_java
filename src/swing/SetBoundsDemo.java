package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SetBoundsDemo implements ActionListener{
	  JTextField celField;
	  JTextField fahField;
	
	public SetBoundsDemo() {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		
		//creating components	
		JLabel jl = new JLabel("Tempeture in Celsious:");
		JLabel jl3 = new JLabel("Tempeture in Fahrenheit");
		celField = new JTextField(10);
		fahField = new JTextField(10);
		
		//UIDefaults ud = new UIDefaults();
		
		JButton b1=new JButton("con");
		// b2=new JButton("vert");
		
		jl.setBounds(10, 10, 190, 30);
		celField.setBounds(200, 10, 150, 30);
		jl3.setBounds(10, 40, 190, 30);	
		fahField.setBounds(200, 40, 150, 30);
		b1.setBounds(40,90,170,30);
		//b2.setBounds(120,90,100,30);
		
		fahField.setEditable(false);
		
		jp.add(jl);
		jp.add(celField);
		jp.add(jl3);
		jp.add(fahField);  
		jp.add(b1);
		//jp.add(b2);
		b1.addActionListener(this);
		//jf.pack();
		jf.setContentPane(jp); // finally adding jpanel(child container) to parent container
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
//		int cel =	Integer.parseInt(celField.getText());
//		
//		float fah= (float)(9.0/5.0)*cel+32;
//		fahField.setText(Float.toString(fah));
		int num =	Integer.parseInt(celField.getText());//3=3*2*1
		
//		String s=celField.getText().toString();
//		Integer i = new Integer(s);
		int n=1;       //3
		for(int i=1;i<=num;i++) 
		{
			n=n*i;//6
		}
		
		int[] ar= {4,5,6};
		System.out.println(ar.length);
		
		fahField.setText(Integer.toString(n));
		
		
	}

}

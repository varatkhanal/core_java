package swing;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SetBoundsDemo implements MouseListener{

	  JTextField fahField;
	  
	  JTextField celField;
	  JFrame jf;
	
	public SetBoundsDemo() {
		jf = new JFrame("Temp Converter");
		
		//creating components	
		JLabel lblCel = new JLabel("Tempeture in Celsious:");
		JLabel lblFah = new JLabel("Tempeture in Fahrenheit");
		celField = new JTextField(10);
		fahField = new JTextField(10);
		
		//UIDefaults ud = new UIDefaults();		
		//JButton b1=new JButton("convert");
		
		lblCel.setBounds(10, 10, 190, 30);
		celField.setBounds(200, 10, 150, 30);
		lblFah.setBounds(10, 40, 190, 30);	
		fahField.setBounds(200, 40, 150, 30);
		//b1.setBounds(40,90,170,30);
		
		fahField.setEditable(false); // cannot input in this text
		
		jf.add(lblCel);
		jf.add(celField);
		jf.add(lblFah);
		jf.add(fahField);  
		//jf.add(b1);

		
		
		
		celField.addMouseListener(this);
		
		//b1.addActionListener(this); // registering action listener
		
		//jf.pack();
		//jf.setContentPane(); // finally adding jpanel(child container) to parent container
		jf.setSize(400,160); //setting size of the from to be displayed
		jf.setLayout(null);
		jf.setVisible(true); //enabling the jframe to be displayed
		
	}
	public static void main(String[] args) {
		SetBoundsDemo sbd = new SetBoundsDemo();
		
	}
	/*
	 * @Override public void actionPerformed(ActionEvent e) { // TODO Auto-generated
	 * method stub int cel = Integer.parseInt(celField.getText().toString()); float
	 * fah = (float)(9.0/5.0*cel)+32; fahField.setText(Float.toString(fah)); }
	 */
//	@Override
//	public void keyTyped(KeyEvent e) {
//		if(e.getKeyChar()==KeyEvent.VK_ENTER) {
//			int d = Integer.parseInt(celField.getText().toString());
//			float fah = (float)(9.0/5.0*d)+32; fahField.setText(Float.toString(fah)); 
//			fahField.setText(Double.toString(fah));
//		}
//	}
//	@Override
//	public void keyPressed(KeyEvent e) {
//		// TODO Auto-generated method stub		
//		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
//			fahField.setText(" down is pressed");
//		}
//	}
//	@Override
//	public void keyReleased(KeyEvent e) {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int d = Integer.parseInt(celField.getText().toString());
		float fah = (float)(9.0/5.0*d)+32; fahField.setText(Float.toString(fah)); 
		fahField.setText(Double.toString(fah));
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		fahField.setText("mouse exited");
	}

	
	
}

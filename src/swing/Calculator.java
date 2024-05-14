package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator implements ActionListener{
    JTextField input = new JTextField();
    Calculator(){
        JFrame jf = new JFrame("JAVA CALCULATOR");
        JButton jb9 = new JButton("9");
        JButton jb8 = new JButton("8");
        JButton jb7 = new JButton("7");
        JButton jb6 = new JButton("6");
        JButton jb5 = new JButton("5");
        JButton jb4 = new JButton("4");
        JButton jb3 = new JButton("3");
        JButton jb2 = new JButton("2");
        JButton jb1 = new JButton("1");
        JButton jb0 = new JButton("0");
        JButton jbadd = new JButton("+");
        JButton jbsub = new JButton("-");
        JButton jbdiv = new JButton("/");
        JButton jbmul = new JButton("*");
        JButton jbequ = new JButton("=");
        Color b = new Color(192, 192, 192);
        Color n = new Color(255,255,255);
        Color o = new Color(203, 209, 143);
        Color q = new Color(255, 182, 193);

        jf.setSize(300,400);
        input.setBounds(10,10,260,80);
        jb7.setBounds(10,120,50,40);
        jb8.setBounds(80,120,50,40);
        jb9.setBounds(150,120,50,40);
        jbmul.setBounds(220,120,50,40);
        jb4.setBounds(10,180,50,40);
        jb5.setBounds(80,180,50,40);
        jb6.setBounds(150,180,50,40);
        jbadd.setBounds(220,180,50,40);
        jb1.setBounds(10,240,50,40);
        jb2.setBounds(80,240,50,40);
        jb3.setBounds(150,240,50,40);
        jbsub.setBounds(220,240,50,40);
        jb0.setBounds(10,300,50,40);
        jbdiv.setBounds(80,300,50,40);
        jbequ.setBounds(150,300,120,40);

        jf.add(input);
        jf.add(jb7);
        jf.add(jb8);
        jf.add(jb9);
        jf.add(jbmul);
        jf.add(jb4);
        jf.add(jb5);
        jf.add(jb6);
        jf.add(jbadd);
        jf.add(jb3);
        jf.add(jb2);
        jf.add(jb1);
        jf.add(jb0);
        jf.add(jbsub);
        jf.add(jbdiv);
        jf.add(jbequ);
        jb7.setBackground(n);
        jb8.setBackground(n);
        jb9.setBackground(n);
        jb6.setBackground(n);
        jb5.setBackground(n);
        jb4.setBackground(n);
        jb3.setBackground(n);
        jb2.setBackground(n);
        jb1.setBackground(n);
        jb0.setBackground(n);
        jb9.addActionListener(this);
        jb8.addActionListener(this);
        jb7.addActionListener(this);
        jb6.addActionListener(this);
        jb5.addActionListener(this);
        jb4.addActionListener(this);
        jb3.addActionListener(this);
        jb2.addActionListener(this);
        jb1.addActionListener(this);
        jb0.addActionListener(this);
        jbadd.addActionListener(this);
        jbmul.addActionListener(this);
        jbdiv.addActionListener(this);
        jbsub.addActionListener(this);
        jbequ.addActionListener(this);
        jbmul.setBackground(o);
        jbdiv.setBackground(o);
        jbsub.setBackground(o);
        jbadd.setBackground(o);
        jbequ.setBackground(q);
        jf.getContentPane().setBackground(b);
        jf.setLayout(null);
        jf.setVisible(true);
    }


    public static void main(String[] args){
        Calculator c = new Calculator();

    }

    public void actionPerformed(ActionEvent e) throws NullPointerException {

        String s = e.getActionCommand();
        String x = input.getText();
        x += s;
        String[] arr = s.split("-|\\/|\\+|\\*");
        double sum=0;
        String op="";
        int i=0;
        while(i<arr.length) {
        	
//        	if(i%2==1) {
//            	if(arr[i]=="-") {
//            		op= arr[i];
//            	}
//        		else if(arr[i]=="+") {
//        			op= arr[i];
//        		}
//            	else if(arr[i]=="*") {
//            		op= arr[i];
//            	}
//            	else if(arr[i]=="/") {
//            		op= arr[i];
//            	} 	
//            }
//        	else {
//        		int num = Integer.parseInt(arr[i]);
//        		sum Integer.parseInt(op)=num;
//        	}
        	System.out.println(arr[i]);
        	i++;
        }        
        input.setText(x);

    }
}

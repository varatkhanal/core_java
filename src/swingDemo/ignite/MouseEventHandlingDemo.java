package swingDemo.ignite;

import java.awt.*;
import java.awt.event.*;

public class MouseEventHandlingDemo implements MouseListener{

    private Frame f;
    private Label hl, ml, sl;
    private Panel p;
    private TextArea ta;

    public MouseEventHandlingDemo() {
        f = new Frame("Java MouseEvent Examples");
        f.setSize(400, 400);
        f.setLayout(new GridLayout(2, 1));

        sl = new Label("Result", Label.CENTER);
        sl.setSize(200,40);
        
        f.addMouseListener(this); 

        f.add(sl);
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
        	public void windowClosing(WindowEvent e) {
        		f.dispose();
        	}

        });
    }
    
    public void mouseClicked(MouseEvent e) {
        sl.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")"+f.getSize().getHeight()+f.getSize().getWidth());
    }
    public void mousePressed(MouseEvent e) {
    }
    public void mouseReleased(MouseEvent e) {
    }
    public void mouseEntered(MouseEvent e) {
    	sl.setText("Mouse Entered:");
    }
    public void mouseExited(MouseEvent e) {
    	sl.setText("Mouse exited");
    }

    public static void main(String[] args) {
        new MouseEventHandlingDemo();
    }
}



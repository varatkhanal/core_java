package swing;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Display{
		JFrame f;
		//preparing default table model and adding columns
		DefaultTableModel model=new	DefaultTableModel();

		//creating JTable and wrapping DefaultTableModel
		JTable table=new JTable(model);
		
			//creating ArrayList object
		ArrayList<User> list=new ArrayList<User>();
		
		FileOperation fo=new FileOperation();


	public Display(){
		f=new JFrame("Student Data");
		
		model.addColumn("First Name");
		model.addColumn("Last Name");
		model.addColumn("Gender");
		model.addColumn("Address");
		model.addColumn("Contact");
		model.addColumn("Roll no");
		model.addColumn("Program");
		model.addColumn("Java");
		model.addColumn("Math");
		model.addColumn("English");
		model.addColumn("Macro Economics");
		
		//calling readFile() method
		list=fo.readFile();
		//System.out.println(list);

		User user=new User();
		int size=list.size();

		for(int i=0;i<size;i++){
			user=list.get(i);
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.insertRow(0,new Object[]{
				user.getFirstName(),
				user.getSecondName(),
				user.getGender(),
				user.getAddress(),
				user.getContact(),
				user.getRollNo(),
				user.getProgram(),
				user.getJava(),
				user.getEnglish(),
				user.getMaths(),
				user.getMacro()
			});
		}
		table.setPreferredScrollableViewportSize(new Dimension(550, 350));
		table.setFillsViewportHeight(true);
		JScrollPane sp = new JScrollPane(table);
		f.add(sp);

		f.setVisible(true);
	}
	
}
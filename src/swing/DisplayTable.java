package swing;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DisplayTable {
	
	public DisplayTable() {
		
		DefaultTableModel dtm = new DefaultTableModel();

		JFrame frame = new JFrame("Display records");
		JTable table = new JTable(dtm);
		
		dtm.addColumn("First Name");
		dtm.addColumn("Last Name");
		dtm.addColumn("Gender");
		dtm.addColumn("Program");
		dtm.addColumn("Section");
		dtm.addColumn("Book Taken");
		
		ArrayList<User> userList=FileOperation.readFile();
		for(int i=0;i<userList.size();i++)
		{
			 dtm = (DefaultTableModel) table.getModel();
			//model.insertRow(0,new Object[]{
			dtm.insertRow(0,new Object[] {
					userList.get(i).getFirstName(),
					userList.get(i).getSecondName(),
					userList.get(i).getGender(),
					userList.get(i).getSection(),
					userList.get(i).getProgram(),
					userList.get(i).getBookTaken()
				});
			//dtm.
		}
		
	//	frame.add(table);
		table.setPreferredScrollableViewportSize(new Dimension(550, 350));
		table.setFillsViewportHeight(true);
		JScrollPane sp = new JScrollPane(table);
		frame.add(sp);
		frame.setSize(400,200);
		frame.setVisible(true);
	}

}

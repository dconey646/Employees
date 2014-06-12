package menusystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class viewall extends JFrame implements ActionListener
{
	JFrame myframe;
	
	JPanel mypanel;
	
	JButton cancelButton;
	
	JTable mytable;
	
	public viewall()
	{
		myframe = new JFrame("View All");
		mypanel = new JPanel();
		
		mytable = new JTable();
		
		cancelButton = new JButton("Cancel");
		
		myframe.add(mypanel);
		mypanel.add(mytable);
		
	}
	

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == cancelButton)
		{
			System.out.println("Cancel");
			mainmenu runMainMenu = new mainmenu();
			
			runMainMenu.setTitle("Welcome");
			runMainMenu.setSize(500,500);
			runMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runMainMenu.setVisible(true);
			runMainMenu.setLocationRelativeTo(null);
		}
	}
}

package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class mainmenu extends JFrame implements ActionListener
{
	JFrame myframe;
	JPanel mypanel;
	JButton viewAllButton;
	JButton addButton;
	JButton modifyButton;
	JButton deleteButton;
	
	public mainmenu()
	{
		myframe = new JFrame("Welcome");
		mypanel = new JPanel();
		
		viewAllButton = new JButton("View All");
		viewAllButton.addActionListener(this);
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		
		modifyButton = new JButton("Modify");
		modifyButton.addActionListener(this);
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(this);
		
		myframe.setLayout(new GridLayout(4, 0, 50, 50));
		mypanel.setLayout(new GridLayout(4, 0, 50, 50));
		
		myframe.add(mypanel);
		mypanel.add(viewAllButton);
		mypanel.add(addButton);
		mypanel.add(modifyButton);
		mypanel.add(deleteButton);
		this.add(mypanel);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == viewAllButton)
		{
			setVisible(false);
			
			viewall runViewAll = new viewall();
			
			runViewAll.setTitle("View All");
			runViewAll.setSize(500,500);
			runViewAll.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runViewAll.setVisible(true);
			runViewAll.setLocationRelativeTo(null);
		}
		
		if(event.getSource() == addButton)
		{
			setVisible(false);
			
			add runAdd = new add();
			
			runAdd.setTitle("Add");
			runAdd.setSize(500,500);
			runAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runAdd.setVisible(true);
			runAdd.setLocationRelativeTo(null);
		}
		
		if(event.getSource() == modifyButton)
		{
			setVisible(false);
			
			modify runModify = new modify();
			
			runModify.setTitle("Modify");
			runModify.setSize(500,500);
			runModify.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runModify.setVisible(true);
			runModify.setLocationRelativeTo(null);
		}
		
		if(event.getSource() == deleteButton)
		{
			setVisible(false);
			
			delete runDelete = new delete();
			
			this.launchWindow(runDelete, "Delete");
		}
	}
	
	private void launchWindow(JFrame window, String name) 
	{
		window.setTitle(name);
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
	}
}

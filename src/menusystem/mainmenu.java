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
	JButton addButton;
	JButton modifyButton;
	JButton deleteButton;
	
	public mainmenu()
	{
		myframe = new JFrame("Welcome");
		mypanel = new JPanel();
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		
		modifyButton = new JButton("Modify");
		modifyButton.addActionListener(this);
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(this);
		
		myframe.setLayout(new GridLayout(3, 0, 50, 50));
		mypanel.setLayout(new GridLayout(3, 0, 50, 50));
		
		myframe.add(mypanel);
		mypanel.add(addButton);
		mypanel.add(modifyButton);
		mypanel.add(deleteButton);
		this.add(mypanel);
	}
	
	public static void main(String[] args) 
	{
		mainmenu first = new mainmenu();
		
		first.setTitle("Welcome");
		first.setSize(500,500);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first.setVisible(true);
		first.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == addButton)
		{
			System.out.println("Add");
			setVisible(false);
			add runAdd = new add();
		}
		
		if(event.getSource() == modifyButton)
		{
			System.out.println("Modify");
			setVisible(false);
			modify runModify = new modify();
		}
		
		if(event.getSource() == deleteButton)
		{
			System.out.println("Delete");
			setVisible(false);
			delete runDelete = new delete();
		}
	}

}

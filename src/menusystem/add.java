package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class add extends JFrame implements ActionListener
{
	JFrame myframe;
	JPanel mypanel;
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel dobLabel;
	JLabel salaryLabel;
	
	public add()
	{
		System.out.println("Your in the add class");
		
		myframe = new JFrame("Add");
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		dobLabel = new JLabel("Date Of Birth:");
		salaryLabel = new JLabel("Salary:");
		
		myframe.setLayout(new GridLayout(4, 0, 50, 50));
		mypanel.setLayout(new GridLayout(4, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		
		myframe.add(mypanel);
		mypanel.add(fnameLabel);
		mypanel.add(snameLabel);
		mypanel.add(dobLabel);
		mypanel.add(salaryLabel);
		this.add(mypanel);
	}
	
	public static void main(String[] args) 
	{
		add first = new add();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		
		
	}
	
}

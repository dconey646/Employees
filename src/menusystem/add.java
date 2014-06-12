package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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
	
	JButton submitButton;
	JButton cancelButton;
	
	public add()
	{
		System.out.println("Your in the add class");
		
		myframe = new JFrame("Add");
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		dobLabel = new JLabel("Date Of Birth:");
		salaryLabel = new JLabel("Salary:");
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		myframe.setLayout(new GridLayout(5, 0, 50, 50));
		mypanel.setLayout(new GridLayout(5, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		
		myframe.add(mypanel);
		mypanel.add(fnameLabel);
		mypanel.add(snameLabel);
		mypanel.add(dobLabel);
		mypanel.add(salaryLabel);
		mypanel.add(submitButton);
		mypanel.add(cancelButton);
		this.add(mypanel);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Your in the main method!");
		
		add second = new add();
		
		second.setTitle("Add");
		second.setSize(500,500);
		second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		second.setVisible(true);
		second.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == submitButton)
		{
			
		}
		
		if(event.getSource() == cancelButton)
		{
			System.out.println("Cancel");
			mainmenu runMainMenu = new mainmenu();
		}
	}
	
}

package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import employee.DBaccess;

public class add extends JFrame implements ActionListener
{	
	// declaring frame
	JFrame myframe;
	
	// declaring panel
	JPanel mypanel;
	
	// declaring labels
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel salaryLabel;
	
	// declaring buttons
	JButton addButton;
	JButton cancelButton;
	
	// declaring text fields
	JTextField fnameText;
	JTextField snameText;
	JTextField salaryText;
	
	private String fname;	// declare fname string to hold first name
	private String sname;	// declare sname string to hold surname
	private int salary;		// declare salary int to hold the employee salary
	
	public add()
	{
		myframe = new JFrame("Add");	// naming the frame 'add'
		mypanel = new JPanel();			// creating an instance of JPanel
		
		fnameLabel = new JLabel("First Name:");	// making the label say first name
		snameLabel = new JLabel("Surname:");	// making the label say surname
		salaryLabel = new JLabel("Salary:");	// making the label say salary
		
		addButton = new JButton("Add");		// making a button called add
		addButton.addActionListener(this);	// listening for the button to be clicked
		
		cancelButton = new JButton("Cancel");	// making a button called cancel
		cancelButton.addActionListener(this);	// listening for the button to be clicked
		
		fnameText = new JTextField();
		fnameText.addActionListener(this);	// listening for text entered
		
		snameText = new JTextField();
		fnameText.addActionListener(this);	// listening for text entered
		
		salaryText = new JTextField();
		fnameText.addActionListener(this);	// listening for text entered
		
		myframe.setLayout(new GridLayout(5, 0, 50, 50));	// setting the grid layout
		mypanel.setLayout(new GridLayout(5, 0, 50, 50));	// setting the grid layout
		myframe.setLocationRelativeTo(null);				// setting the position of the frame
		
		myframe.add(mypanel);		// adding panel to frame
		mypanel.add(fnameLabel);	// adding fname label to panel
		mypanel.add(fnameText);		// adding fname text to panel
		mypanel.add(snameLabel);	// adding sname label to panel
		mypanel.add(snameText);		//	adding sname text to panel
		mypanel.add(salaryLabel);	//	adding salary label to panel
		mypanel.add(salaryText);	//	adding salary text to panel
		mypanel.add(addButton);		//	adding add button to panel
		mypanel.add(cancelButton);	// 	adding cancel button to panel
		this.add(mypanel);			//	adding panel
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == addButton)
		{
			setVisible(false);
			
			String text = fnameText.getText();
			setFname(text);
			
			text = snameText.getText();
			setSname(text);
			
			int num = Integer.parseInt(salaryText.getText());
			setSalary(num);
			
			DBaccess.addRecord(getFname(), getSname(), getSalary());
			
			mainmenu runMainMenu = new mainmenu();
			
			runMainMenu.setTitle("Welcome");
			runMainMenu.setSize(500,500);
			runMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runMainMenu.setVisible(true);
			runMainMenu.setLocationRelativeTo(null);
		}
		
		if(event.getSource() == cancelButton)
		{
			mainmenu runMainMenu = new mainmenu();
			
			runMainMenu.setTitle("Welcome");
			runMainMenu.setSize(500,500);
			runMainMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			runMainMenu.setVisible(true);
			runMainMenu.setLocationRelativeTo(null);
		}
		
	}

	public String getFname() 
	{
		return fname;
	}

	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getSname() 
	{
		return sname;
	}

	public void setSname(String sname) 
	{
		this.sname = sname;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}
	
}

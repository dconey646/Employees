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
	JFrame myframe;
	
	JPanel mypanel;
	
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel salaryLabel;
	
	JButton addButton;
	JButton cancelButton;
	
	JTextField fnameText;
	JTextField snameText;
	JTextField salaryText;
	
	private String fname;
	private String sname;
	private int salary;
	
	public add()
	{
		myframe = new JFrame("Add");
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		salaryLabel = new JLabel("Salary:");
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		fnameText = new JTextField();
		fnameText.addActionListener(this);
		snameText = new JTextField();
		fnameText.addActionListener(this);
		fnameText.addActionListener(this);
		salaryText = new JTextField();
		fnameText.addActionListener(this);
		
		myframe.setLayout(new GridLayout(5, 0, 50, 50));
		mypanel.setLayout(new GridLayout(5, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		
		myframe.add(mypanel);
		mypanel.add(fnameLabel);
		mypanel.add(fnameText);
		mypanel.add(snameLabel);
		mypanel.add(snameText);
		mypanel.add(salaryLabel);
		mypanel.add(salaryText);
		mypanel.add(addButton);
		mypanel.add(cancelButton);
		this.add(mypanel);
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

package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class add extends JFrame implements ActionListener
{	
	JFrame myframe;
	
	JPanel mypanel;
	
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel dobLabel;
	JLabel salaryLabel;
	
	JButton addButton;
	JButton cancelButton;
	
	JTextField fnameText;
	JTextField snameText;
	JTextField dobText;
	JTextField salaryText;
	
	private String fname;
	private String sname;
	private String dob;
	private String salary;
	
	public add()
	{
		myframe = new JFrame("Add");
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		dobLabel = new JLabel("Date Of Birth:");
		salaryLabel = new JLabel("Salary:");
		
		addButton = new JButton("Add");
		addButton.addActionListener(this);
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		fnameText = new JTextField();
		fnameText.addActionListener(this);
		snameText = new JTextField();
		fnameText.addActionListener(this);
		dobText = new JTextField();
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
		mypanel.add(dobLabel);
		mypanel.add(dobText);
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
			String text = fnameText.getText();
			setFname(text);
			
			System.out.println(getFname());
			
			text = snameText.getText();
			setSname(text);
			
			System.out.println(getSname());
			
			text = dobText.getText();
			setDob(text);
			
			System.out.println(getDob());
			
			text = salaryText.getText();
			setSalary(text);
			
			System.out.println(getSalary());
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

	public String getDob() 
	{
		return dob;
	}

	public void setDob(String dob) 
	{
		this.dob = dob;
	}

	public String getSalary() 
	{
		return salary;
	}

	public void setSalary(String salary) 
	{
		this.salary = salary;
	}
	
}

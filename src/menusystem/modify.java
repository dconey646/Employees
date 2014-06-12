package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class modify extends JFrame implements ActionListener
{

	JFrame myframe;
	
	JPanel mypanel;
	
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel dobLabel;
	JLabel salaryLabel;
	JLabel idLabel;
	
	JButton modifyButton;
	JButton cancelButton;
	
	JTextField fnameText;
	JTextField snameText;
	JTextField dobText;
	JTextField salaryText;
	JTextField idText;
	
	private String id;
	private String fname;
	private String sname;
	private String dob;
	private String salary;
	
	public modify()
	{
		myframe = new JFrame("Modify");
		
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		dobLabel = new JLabel("Date Of Birth:");
		salaryLabel = new JLabel("Salary:");
		idLabel = new JLabel("ID:");
		
		modifyButton = new JButton("Modify");
		modifyButton.addActionListener(this);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		fnameText = new JTextField();
		snameText = new JTextField();
		dobText = new JTextField();
		salaryText = new JTextField();
		idText = new JTextField();
		
		myframe.setLayout(new GridLayout(5, 0, 50, 50));
		mypanel.setLayout(new GridLayout(6, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		
		myframe.add(mypanel);
		mypanel.add(idLabel);
		mypanel.add(idText);
		mypanel.add(fnameLabel);
		mypanel.add(fnameText);
		mypanel.add(snameLabel);
		mypanel.add(snameText);
		mypanel.add(dobLabel);
		mypanel.add(dobText);
		mypanel.add(salaryLabel);
		mypanel.add(salaryText);
		mypanel.add(modifyButton);
		mypanel.add(cancelButton);
		this.add(mypanel);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == modifyButton)
		{
			String text = idText.getText();
			setId(text);
			
			System.out.println(getId());
			
			text = fnameText.getText();
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
	
	public String getId() 
	{
		return id;
	}

	public void setId(String id) 
	{
		this.id = id;
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

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
	JTextField salaryText;
	JTextField idText;
	
	private int id;
	private String fname;
	private String sname;
	private int salary;
	
	public modify()
	{
		myframe = new JFrame("Modify");
		
		mypanel = new JPanel();
		
		fnameLabel = new JLabel("First Name:");
		snameLabel = new JLabel("Surname:");
		salaryLabel = new JLabel("Salary:");
		idLabel = new JLabel("ID:");
		
		modifyButton = new JButton("Modify");
		modifyButton.addActionListener(this);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		fnameText = new JTextField();
		snameText = new JTextField();
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
			setVisible(false);
			
			int num = Integer.parseInt(idText.getText());
			setId(num);
			
			String text = fnameText.getText();
			setFname(text);
			
			text = snameText.getText();
			setSname(text);
			
			num = Integer.parseInt(salaryText.getText());
			setSalary(num);
			
			DBaccess.modifyRecord(getId(), getFname(), getSname(), getSalary());
			
			mainmenu runMainMenu = new mainmenu();
			
			this.launchWindow(runMainMenu, "Welcome");
		}
		
		if(event.getSource() == cancelButton)
		{
			mainmenu runMainMenu = new mainmenu();
			
			this.launchWindow(runMainMenu, "Welcome");
		}
	}
	
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
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

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
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

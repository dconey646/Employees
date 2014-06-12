package menusystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class delete extends JFrame implements ActionListener
{

	JFrame myframe;
	
	JPanel mypanel;
	
	JLabel fnameLabel;
	JLabel snameLabel;
	JLabel dobLabel;
	JLabel salaryLabel;
	JLabel idLabel;
	
	JButton deleteButton;
	JButton cancelButton;
	
	JTextField fnameText;
	JTextField snameText;
	JTextField dobText;
	JTextField salaryText;
	JTextField idText;
	
	private String id;
	
	public delete()
	{
		myframe = new JFrame("Delete");
		
		mypanel = new JPanel();
		
		idLabel = new JLabel("ID:");
		
		deleteButton = new JButton("Delete");
		deleteButton.addActionListener(this);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(this);
		
		idText = new JTextField();
		
		myframe.setLayout(new GridLayout(5, 0, 50, 50));
		mypanel.setLayout(new GridLayout(3, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		
		myframe.add(mypanel);
		mypanel.add(idLabel);
		mypanel.add(idText);
		mypanel.add(deleteButton);
		mypanel.add(cancelButton);
		this.add(mypanel);
	}
	
	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == deleteButton)
		{
			String text = idText.getText();
			setId(text);
			
			System.out.println(getId());
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

	
}

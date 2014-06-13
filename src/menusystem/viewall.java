package menusystem;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import employee.DBaccess;

public class viewall extends JFrame implements ActionListener
{
	JFrame myframe;

	JPanel mypanel;
	
	JButton cancelButton;
	
	JTextArea textArea;

	JScrollPane vertical;
	 
	public viewall()
	{
		myframe = new JFrame("View All");
		mypanel = new JPanel();
		
		setPreferredSize(new Dimension(200, 250));
        textArea = new JTextArea(15, 15);

        textArea = new JTextArea(DBaccess.viewAll());
        
        vertical = new JScrollPane(textArea);
        vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
        cancelButton = new JButton("Cancel");	// making a button called cancel
		cancelButton.addActionListener(this);	// listening for the button to be clicked
		
		myframe.setLayout(new GridLayout(3, 0, 50, 50));
		mypanel.setLayout(new GridLayout(3, 0, 50, 50));
		myframe.setLocationRelativeTo(null);
		mypanel.add(vertical);
		myframe.add(mypanel);
		mypanel.add(cancelButton);
		this.add(mypanel);
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getSource() == cancelButton)
		{
			System.out.println("Cancel");
			mainmenu runMainMenu = new mainmenu();
			
			this.launchWindow(runMainMenu, "Welcome");
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

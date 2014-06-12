package menusystem;

import javax.swing.JFrame;

public class program 
{
	public static void main(String[] args) 
	{
		mainmenu first = new mainmenu();
		
		first.setTitle("Welcome");
		first.setSize(500,500);
		first.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		first.setVisible(true);
		first.setLocationRelativeTo(null);
	}
}

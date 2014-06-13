package menusystem;

import javax.swing.JFrame;

public class program 
{
	public static void main(String[] args)
	{
		mainmenu runMainMenu = new mainmenu();
		
		launchWindow(runMainMenu, "Welcome");
	}
	
	private static void launchWindow(JFrame window, String name) 
	{
		window.setTitle(name);
		window.setSize(500,500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
	}
}

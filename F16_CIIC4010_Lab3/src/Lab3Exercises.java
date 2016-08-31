import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		// Changed title from "Hello, world!" to "Gabriel C. Ortiz Lopez"
		JFrame myFrame = new JFrame("Gabriel C. Ortiz");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Changes were made. Setting up for a 1366x768 resolution screen. 
		// Switched to Lab computer (1920x1080 resolution screen)
		myFrame.setLocation(810, 440);
		// Changes were made. Switched from (400, 100) to (200, 200)
		//Switched from (200, 200) to (300, 200)
		myFrame.setSize(230, 145);
		
		   MyPanelClass myPanel = new MyPanelClass();
           myFrame.getContentPane().add(myPanel);
		
		myFrame.setVisible(true);
	}
} 
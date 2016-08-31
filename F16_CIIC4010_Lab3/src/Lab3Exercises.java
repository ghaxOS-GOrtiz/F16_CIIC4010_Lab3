import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		// Changed title from "Hello, world!" to "Gabriel C. Ortiz Lopez"
		JFrame myFrame = new JFrame("Gabriel C. Ortiz Lopez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Changes were made. Setting up for a 1366x768 resolution screen.
		myFrame.setLocation(573, 284);
		// Changes were made. Switched from (400, 100) to (200, 200)
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
	}
} 
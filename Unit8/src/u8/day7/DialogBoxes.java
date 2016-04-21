package u8.day7;

import javax.swing.JOptionPane;

public class DialogBoxes {

	public static void main(String[] args) {
		Object[] values = { "Friend", "Foe" };
		String answer = (String) JOptionPane.showInputDialog(null, "Are you a friend or a foe?", "Input",
				JOptionPane.QUESTION_MESSAGE, null, values, values[0]);

		String name = (String) JOptionPane.showInputDialog("What is your name");

		if (name != null) {
			JOptionPane.showMessageDialog(null, "Hello " + name + " you are not a " + answer);
		}

		else {
			JOptionPane.showMessageDialog(null, "Hello nameless.");
		}
	}
}

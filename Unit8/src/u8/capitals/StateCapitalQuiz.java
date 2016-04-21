package u8.capitals;

import javax.swing.JOptionPane;

public class StateCapitalQuiz {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		String[] files = { "states_all.txt", "states_central.txt", "states_east.txt", "states_small_test.txt",
				"states_south.txt", "states_west.txt" };
		String fileChoice = (String) JOptionPane.showInputDialog(null, "Which quiz file would you like to use?",
				"Input", JOptionPane.QUESTION_MESSAGE, null, files, files[0]);
		StateCapitalList s1 = new StateCapitalList(fileChoice);
		int listLength = s1.statesRemaining();
		int guesses = 0;
		int correctGuesses = 0;
		while (s1.statesRemaining() > 0) {
			StateCapital sc = s1.getRandomState();
			String answer = (String) JOptionPane.showInputDialog(null, "What is the capital of " + sc.getState(),
					"Input", JOptionPane.QUESTION_MESSAGE);
			if (answer == null) {
				break;
			} else if (answer.equalsIgnoreCase(sc.getCapital())) {
				JOptionPane.showConfirmDialog(null, "Correct!", "Message", JOptionPane.DEFAULT_OPTION,
						JOptionPane.PLAIN_MESSAGE);
				s1.remove(sc);
				correctGuesses++;
			} else {
				JOptionPane.showConfirmDialog(null, "Incorrect. The capital is " + sc.getCapital(), "Message",
						JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
			}
			guesses++;
		}
		if (s1.statesRemaining() == 0) {
			JOptionPane.showConfirmDialog(null,
					"You named all " + correctGuesses + " capitals in " + guesses + " guesses", "Message",
					JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
		} else {
			JOptionPane.showConfirmDialog(null,
					"You named " + correctGuesses + " capital(s) out of " + listLength + " in " + guesses + " guess(es)",
					"Message", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE);
		}
	}

}

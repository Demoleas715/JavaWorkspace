package u6;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int playerScore = 0;
		int compScore = 0;

		// String answer = "";
		String comp = "";

		int answer = 0;

		JOptionPane.showMessageDialog(null, "Let's play rock paper scissors!");

		while (answer != 1) {
			String[] choices = { "rock", "paper", "scissors" };
			String choice = (String) JOptionPane.showInputDialog(null, "What are you going to show?", "Input",
					JOptionPane.QUESTION_MESSAGE, null, choices, choices[0]);
			int compChoice = rand.nextInt(3);
			switch (compChoice) {
			case 0:
				comp = "rock";
				break;
			case 1:
				comp = "paper";
				break;
			case 2:
				comp = "scissors";
				break;
			}

			if ((compChoice == 0 && choice.equals("paper")) || (compChoice == 1 && choice.equals("scissors"))
					|| (compChoice == 2 && choice.equals("rock"))) { // If
																		// player
																		// wins
				playerScore++;
				JOptionPane.showMessageDialog(null, "You win!\nYou chose " + choice + ", the computer choses " + comp
						+ "!\nCurrent score is: You: " + playerScore + "; Computer: " + compScore);

			} else if ((compChoice == 0 && choice.equals("scissors")) || (compChoice == 1 && choice.equals("rock"))
					|| (compChoice == 2 && choice.equals("paper"))) { // If
																		// computer
																		// wins
				compScore++;
				JOptionPane.showMessageDialog(null, "You lose!\nYou chose " + choice + ", the computer chose " + comp
						+ "!\nCurrent score is: You: " + playerScore + "; Computer: " + compScore);

			} else if ((compChoice == 0 && choice.equals("rock")) || (compChoice == 1 && choice.equals("paper"))
					|| (compChoice == 2 && choice.equals("scissors"))) { // If
																			// its
																			// a
																			// tie
				JOptionPane.showMessageDialog(null, "You tied!\nYou both chose " + choice + "!\nCurrent score is: You: "
						+ playerScore + "; Computer: " + compScore);

			}
			answer = JOptionPane.showConfirmDialog(null, "Would you like to continue playing?", "Select an Option",
					JOptionPane.YES_NO_OPTION);

		}
		JOptionPane.showMessageDialog(null, "It has been fun. Her is the final score.\nYou: " + playerScore + "; Computer: " + compScore);
	}

}
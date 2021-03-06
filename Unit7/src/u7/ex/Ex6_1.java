package u7.ex;

import java.util.Scanner;

public class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int num = input.nextInt();
		System.out.println("Enter " + num + " scores: ");
		int[] studentScores = new int[num];
		int highestScore = 0;
		for (int i = 0; i < num; i++) {
			int score = input.nextInt();
			studentScores[i] = score;
			if (score > highestScore) {
				highestScore = score;
			}
		}
		for (int i = 0; i < studentScores.length; i++) {
			String letter = "";
			if (studentScores[i] >= highestScore - 10) {
				letter = "A";
			} else if (studentScores[i] >= highestScore - 20) {
				letter = "B";
			} else if (studentScores[i] >= highestScore - 30) {
				letter = "C";
			} else if (studentScores[i] >= highestScore - 40) {
				letter = "D";
			} else {
				letter = "F";
			}
			System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is " + letter);
		}
	}

}

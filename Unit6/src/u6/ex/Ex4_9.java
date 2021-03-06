package u6.ex;  

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num = input.nextInt();
		double highScore = 0;
		double secondHighScore = 0;
		String studentHighScore = "";
		String studentSecondHighScore = "";
		ArrayList<Double> scores = new ArrayList<Double>();
		ArrayList<String> names = new ArrayList<String>();
		for (int a = 0; a<num; a++) {
			System.out.println("Enter the student's name");
			input.nextLine();
			String name = input.nextLine();
			names.add(name);
			System.out.println("Enter " + name + "'s score");
			double score = input.nextDouble();
			scores.add(score);
			if (score > highScore) {
				highScore = score;
				studentHighScore = name;
			}
		}
		for (int i = 0; i < scores.size(); i++) {
			if ((scores.get(i) < highScore) && (scores.get(i) > secondHighScore)) {
				secondHighScore = scores.get(i);
				studentSecondHighScore = names.get(i);
			}

		}
		System.out.println("\nStudent(s) with the highest score: " + studentHighScore + "\nScore: " + highScore);
		System.out.println(
				"\nStudent with the second highest score: " + studentSecondHighScore + "\nScore: " + secondHighScore);
	}
}
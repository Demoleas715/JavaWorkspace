package u7;

import java.util.Scanner;

public class ResponseRequired {
	public static String getAnswer(Scanner input, String question) {
		System.out.println(question);
		String answer = input.nextLine();
		while (answer.length() == 0) {
			System.out.println("An answer is required. Please re-enter.");
			answer = input.nextLine();
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String color = getAnswer (input, "What is your favorite color?");
		String pet = getAnswer (input, "What is your favorite pet?");
		
		System.out.println("So you would like a " + color + " " + pet + "?");
	}
}

package u6;

import java.util.Random;
import java.util.Scanner;

public class AdditionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int x = 0;
		int y = 0;
		int answer = 0;
		int count = 0;
		while (answer == x + y) {
			x = rand.nextInt(100);
			y = rand.nextInt(100);
			System.out.println("What is the sum of the following two numbers?");
			System.out.println(x + " + " + y + " = " + "?");
			answer = input.nextInt();
			if (answer == x + y) {
				System.out.println("Correct!");
				count++;
			}
		}
		System.out.println("Incorrect!");
		System.out.println("You answered " + count + " questions correctly!");
	}

}

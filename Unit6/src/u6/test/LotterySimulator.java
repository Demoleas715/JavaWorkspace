package u6.test;

import java.util.Random;
import java.util.Scanner;

public class LotterySimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		System.out.println("Welcome to the lottery, enter two numbers in the range [0, 10).");
		int firstGuess = input.nextInt();
		int secondGuess = input.nextInt();
		int firstNum = rand.nextInt(10);
		int secondNum = rand.nextInt(10);
		System.out.println("The numbers drawn are: " + firstNum + " and " + secondNum);
		if ((firstGuess == firstNum) && (secondGuess == secondNum)){
			System.out.println("Jackpot! You win $1000");
		}
		else if ((firstGuess == secondNum) && (secondGuess == firstNum)){
			System.out.println("Matched but in wrong order! You win $100");
		}
		else{
			System.out.println("You lose. Sorry, better luck next time.");
		}
	}

}

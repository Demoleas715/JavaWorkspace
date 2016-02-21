package u6;

import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int factorial = input.nextInt();
		for (int num = factorial - 1; num > 0; num--) {
			factorial = (factorial * num);
		}
		System.out.println(factorial);

	}

}

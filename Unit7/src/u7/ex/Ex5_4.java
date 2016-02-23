package u7.ex;

import java.util.Scanner;

public class Ex5_4 {

	public static void reverse(int number) {
		int newNum = 0;
		while (number > 0) {
			newNum*=10;
			newNum+= number % 10;
			number /= 10;
		}
		System.out.print(newNum);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to be reversed");
		int n = input.nextInt();
		reverse(n);
	}
}

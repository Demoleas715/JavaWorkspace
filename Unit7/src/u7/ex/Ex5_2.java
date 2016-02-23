package u7.ex;

import java.util.Scanner;

public class Ex5_2 {

	public static int sumDigits(long n) {
		int num = 0;
		while (n > 0) {
			num += n % 10;
			n /= 10;
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to find a sum of its digits");
		int n = input.nextInt();
		System.out.println(sumDigits(n));
	}

}

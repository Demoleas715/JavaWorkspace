package u6;

import java.util.Scanner;

public class StatsFun {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers are there?");
		int count = input.nextInt();

		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double sum = 0;

		for (int i = 0; i < count; i++) {
			double num = input.nextDouble();

			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
			sum += num;
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
		System.out.println("Mean: " + (sum/count));
	}
}

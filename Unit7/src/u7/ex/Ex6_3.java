package u7.ex;

import java.util.Scanner;

public class Ex6_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] nums = new int[100];
		int number = input.nextInt();
		while (number != 0) {
			nums[number] += 1;

			number = input.nextInt();
		}
		for (int i = 0; i < 100; i++) {
			if (nums[i] > 1) {
				System.out.println(i + " occurs " + nums[i] + " times");
			} else if (nums[i] == 1) {
				System.out.println(i + " occurs 1 time");
			}
		}
	}
}
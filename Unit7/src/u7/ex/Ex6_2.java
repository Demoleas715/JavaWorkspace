package u7.ex;

import java.util.Scanner;

public class Ex6_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = input.nextInt();
		}
		for (int i = nums.length - 1; i >= 0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
}

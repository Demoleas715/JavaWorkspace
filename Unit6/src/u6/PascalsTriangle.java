package u6;

import java.util.Scanner;

public class PascalsTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many lines?");
		int lines = input.nextInt();
		for (int i = 1; i <= lines; i++) {
			for (int j = lines; j > i; j--) {
				System.out.print("    ");
			}
			for (int j = i; j > 0; j--) {
				System.out.printf("%4d", j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
	}
}

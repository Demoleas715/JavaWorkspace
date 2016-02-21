package u6;

import java.util.Scanner;

public class ValidTriangles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths for the three sides of a trinalge.");
		double longestSide = 0;
		double firstSide = input.nextDouble();
		double secondSide = input.nextDouble();
		double thirdSide = input.nextDouble();
		if (firstSide > longestSide) {
			longestSide = firstSide;
		}
		if (secondSide > longestSide){
			longestSide = secondSide;
		}
		if (thirdSide > longestSide){
			longestSide = thirdSide;
		}
		if (firstSide + secondSide + thirdSide - longestSide > longestSide){
			System.out.println("Valid!");
		}
		else{
			System.out.println("Invalid!");
		}

	}
}

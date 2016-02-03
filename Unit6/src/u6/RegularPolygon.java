package u6;

import java.util.Scanner;

public class RegularPolygon {

	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is the name of you regular polygon?");
		
		String shapeName = input.nextLine();
		
		System.out.println("How many sides are there?");
		int numSides = input.nextInt();
		
		System.out.println("What is the side length?");
		double sideLength = input.nextDouble();
		
		double p = numSides * sideLength;
		
		System.out.println("Your " + shapeName + " has a perimeter of " + p + ".");
		
	}
}

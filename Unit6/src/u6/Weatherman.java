package u6;

import java.util.Random;

public class Weatherman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();

		int i = rand.nextInt(5);
		System.out.println("i = " + i);

		switch (i) {
		case 0:
			System.out.println("It will snow 2 feet tomorrow.");
			break;
			
		case 1:
			System.out.println("It will snow 1 foot tomorrow.");
			break;
		
		case 2:
			System.out.println("It will snow 6 inches.");
			break;
			
		default:
			System.out.println("No snow.");
			
		}
	}

}
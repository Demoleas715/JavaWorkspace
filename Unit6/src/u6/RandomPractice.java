package u6;

import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int x = rand.nextInt(10);
		while (x!=9){
			System.out.println("\nNum: " + x);
			
			if (x>5)
				System.out.println("Greater than 5");
			else if (x==5)
				System.out.println("Equals 5");
			else
				System.out.println("Less than 5");
			
			x = rand.nextInt(10);
		}
	}

}

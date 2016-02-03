package u6;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner (System.in);
			System.out.println("Enter an integer and I will tell you if it is prime.");
			int num = input.nextInt();
			double sqrt = Math.sqrt(num);
			
			boolean prime = true;
			for (int i=2; i<sqrt; i++){
				if (num % i == 0){
					prime = false;
					break;
				}
			}
			if (prime)
				System.out.println("It's prime!");
			else
				System.out.println("It's composite, not prime!");
	}

}
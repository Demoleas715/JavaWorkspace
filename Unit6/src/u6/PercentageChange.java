package u6;

import java.util.Scanner;

public class PercentageChange {

		public static void main(String[] args){
			Scanner input = new Scanner (System.in);
			
			System.out.println("What is the name of the item?");
			String name = input.nextLine();
			
			System.out.println("What was the price last year?");
			double origPrice = input.nextDouble();
			
			System.out.println("What was the price this year?");
			double newPrice = input.nextDouble();
			
			double pctChg = (newPrice - origPrice) / origPrice * 100;
			
			if (pctChg < 0){
				System.out.printf("The price of %s decreased by %.0f%%.\n", name, pctChg);
			}
			
			else if (pctChg > 0){
				System.out.printf("The price of %s increased by %.0f%%.\n", name, pctChg);
			}
			
			else{
					System.out.printf("The price of %s did not change.", name);
			}
		}
}

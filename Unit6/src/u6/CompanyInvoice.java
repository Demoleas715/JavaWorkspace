package u6;

import java.util.Scanner;

public class CompanyInvoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the first item? ");
		String firstItem = input.nextLine();
		
		System.out.println("What is the quantity purchased? ");
		int firstQuantity = input.nextInt();
		
		System.out.printf("How much is the price per %s? ", firstItem);
		double firstPrice = input.nextDouble();
		input.nextLine();
		
		System.out.println("What is the second item? ");
		String secondItem = input.nextLine();
		
		System.out.println("What is the quantity purchased? ");
		int secondQuantity = input.nextInt();
		
		System.out.printf("What is the price per %s? ", secondItem);
		double secondPrice = input.nextDouble();
		

		
		double firstTotal = (firstQuantity * firstPrice);
		double secondTotal = (secondQuantity * secondPrice);
		double grandTotal = (firstTotal * secondTotal);
		
		System.out.printf("%18s%18s%18s%18s\n", "Item Name", "Count", "Unit Cost", "Total");
		System.out.printf("%18s%18d%18.2f%18.2f\n", firstItem, firstQuantity, firstPrice, firstTotal);
		System.out.printf("%18s%18d%18.2f%18.2f\n", secondItem, secondQuantity, secondPrice, secondTotal);
		System.out.printf("%18s%54.2f", "Grand total", grandTotal);
	}

}

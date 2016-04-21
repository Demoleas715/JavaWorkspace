package u8.invoice;

import java.util.Scanner;

public class CompanyInvoice {

	public static ItemList readItems() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the name of the first item purchased.");
		String itemName = input.nextLine();
		int itemQuantity;
		double unitPrice;
		ItemList l = new ItemList();
		while (!itemName.equals("")) {
			System.out.println("How many of these were purchased?");
			itemQuantity = input.nextInt();
			System.out.println("How much does each cost?");
			unitPrice = input.nextDouble();
			input.nextLine();
			l.addItem(itemName, itemQuantity, unitPrice);
			System.out.println("Please enter the name of the next item or press enter to print invoice.");
			itemName = input.nextLine();
		}
		return l;
		
	}

	public static void printInvoice(ItemList l) {
		System.out.println("\n---------------------------\n\nInvoice:\n");
		System.out.printf("%9s%15s%15s%15s\n", "Item Name", "Quantity", "Unit Price", "Total");
		System.out.println(l);
	}

	public static void main(String[] args) {
		ItemList list = readItems();
		printInvoice(list);

	}
}

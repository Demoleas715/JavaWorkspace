package u8.invoice;

public class ItemList {

	private Item[] itemList = new Item[2];
	private int numItems = 0;

	public ItemList() {

	}

	public void expandArray() {
		Item[] newList = new Item[itemList.length * 2];
		for (int i = 0; i < itemList.length; i++) {
			newList[i] = itemList[i];
		}
		itemList = newList;
	}

	public void addItem(Item i) {
		if (numItems == itemList.length) {
			expandArray();
		}
		itemList[numItems] = i;
		numItems++;
	}

	public void addItem(String itemName, int itemQuantity, double unitPrice) {
		addItem(new Item(itemName, itemQuantity, unitPrice));
	}

	public int getTotalItems() {
		return numItems;
	}

	public Item getItem(int index) {
		return itemList[index];
	}
	
	public String toString() {
		double total = 0;
		for (int i = 0; i < numItems; i++) {
			Item item = itemList[i];
			System.out.printf("%9s%15d%15.2f%15.2f\n", item.getName(), item.getQuantity(), item.getUnitPrice(), item.getTotal());
			total += item.getTotal();
		}
		return String.format("\n%5sTotal Cost: %.2f", "", total);
	}
}

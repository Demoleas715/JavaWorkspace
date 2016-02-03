package u6;

public class ASCIITable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%6s %6s %6s\n", "Dec", "Hex", "Chr");
		for (int i = 33; i < 128; i++) {
			System.out.printf("%6d %6h %6c\n", i, i, i);
		}
	}

}

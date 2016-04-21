package u8.day1;

public class StockTester {

	public static void main(String[] args) {
		Stock s = new Stock("JAVA", "Sun Microsystems Inc.");
		s.setPreviousClosingPrice(4.5);
		s.setCurrentPrice(4.35);

		System.out.println(s.getChangePercent());
	}

}

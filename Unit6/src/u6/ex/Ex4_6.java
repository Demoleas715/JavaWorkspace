package u6.ex;

public class Ex4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%15s %15s %15s %15s\n", "Miles", "Kilometers", "Kilometers", "Miles");
		for (int m = 1, k = 20; m <= 10; m++, k += 5) {
			double kilos = m * 1.609;
			double miles = k / 1.609;
			System.out.printf("%15d %15.3f %15d %15.3f\n", m, kilos, k, miles);
			
		}
	}

}

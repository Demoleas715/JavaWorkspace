package u6.ex;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%10s %10s\n", "Pounds", "Kilograms");
		for (int pounds=1; pounds<=199; pounds+=2){
			double kilos = (pounds * 2.2);
			System.out.printf("%10d %10.1f\n", pounds, kilos);
		}
	}

}

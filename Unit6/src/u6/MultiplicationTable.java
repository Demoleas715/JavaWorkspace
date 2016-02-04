package u6;

public class MultiplicationTable {

	public static void main(String[] args){
		System.out.print("      ");
		for (int i = 1; i<=9; i++){
			System.out.printf("%5d", i);
		}
		System.out.println();
		System.out.println("      ----------------------------------------------");
		for (int i = 1; i<=9; i++){
			System.out.printf("%5d|", i);
			for (int j=1; j<=9; j++){
				System.out.printf("%5d", i*j);
			}
			System.out.println();
		}
	}
}

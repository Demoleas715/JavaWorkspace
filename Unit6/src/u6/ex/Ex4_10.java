package u6.ex;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 100; i <= 1000; i++) {
			if (i % 30 == 0) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}

			}
		}
	}

}
package u7.ex;

public class Ex5_1 {

	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		while (count <= 100) {
			System.out.print(getPentagonalNumber(count) + " ");
			if (count % 10 == 0) {
				System.out.println();
			}
			count++;
		}
	}

}
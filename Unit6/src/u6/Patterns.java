package u6;

public class Patterns {
	public static void main(String[] args) {
		System.out.println("Pattern 1");
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		System.out.println("Pattern 2");
		for (int i = 6; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		System.out.println("Pattern 3");
		for (int i = 1; i <= 6; i++) {
			String s = "";
			for (int j = i; j >= 1; j--) {
				s += "  " + j;
			}
			System.out.printf("%18s\n", s);
		}
		System.out.println("Pattern 4");
		for (int i = 6; i >= 1; i--) {
			String s = "";
			for (int j = 1; j <= i; j++) {
				s += "  " + j;
			}
			System.out.printf("%18s\n", s);

		}
	}
}
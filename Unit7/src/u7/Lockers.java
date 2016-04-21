package u7;

public class Lockers {

	public static void flipLockers(boolean[] lockers) {
		for (int i = 1; i < lockers.length; i++) {
			for (int j = i; j < lockers.length; j += i) {
				lockers[j] = !lockers[j];
			}
		}
		for (int j = 1; j < lockers.length; j++) {
			if (lockers[j] == true) {
				System.out.println(j);
			}
		}
	}

	public static void main(String[] args) {
		boolean[] a = new boolean[101];
		flipLockers(a);
	}
}

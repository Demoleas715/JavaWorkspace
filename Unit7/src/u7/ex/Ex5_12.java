package u7.ex;

public class Ex5_12 {

	public static void printChars(char ch1, char ch2, int numberPerLine) {
		int i = ch1;
		int count = 1;
		while (i >= ch1 && i <= ch2) {
			System.out.printf("%c", i);
			if (count % numberPerLine == 0) {
				System.out.println();
			}
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}
}

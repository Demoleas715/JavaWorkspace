package u6;

import java.util.Random;
import java.util.Scanner;

public class PasswordGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("How many characters should the password be?");
		int length = input.nextInt();

		String s = "";

		for (int i = 0; i < length; i++) {
			int n = rand.nextInt(62);
			if (n < 26) {
				s += (char) (n + 'A');
			} else if (n < 52) {
				s += (char) (n - 26 + 'a');
			} else {
				s += (char) (n - 52 + '0');
			}
		}
		System.out.println(s);
	}

}

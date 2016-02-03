package u6;

import java.util.Scanner;

public class TitleCase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a sentence");
		String s = input.nextLine();

		char c[] = s.toCharArray();

		boolean bNextCap = true;
		String out = "";

		for (int i = 0; i < c.length; i++) {
			char ch = c[i];

			if ((c[i] >= 'a') && (c[i] <= 'z') && bNextCap)
				ch = (char) (ch - 'a' + 'A');
			else if ((c[i] >= 'A') && (c[i] <= 'Z') && !bNextCap)
				ch = (char) (ch - 'A' + 'a');
			if (c[i] == ' ')
				bNextCap = true;
			else
				bNextCap = false;

			out += ch;
		}
		System.out.println(out);
	}
}

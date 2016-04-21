package u8.day7;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new FileReader("names.txt"));

		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] names = line.split("-");

			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
			System.out.println("-----------");
		}
	}
}

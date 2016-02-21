package u6.test;

import java.util.Random;

public class DieRollingSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int totalCount = 0;
		for (int count = 0; count <= 5; count++) {
			int randNum = rand.nextInt(6) + 1;
			if (randNum != 6) {
				count = 0;
			}
			totalCount++;
		}
		System.out.println("You rolled a 6 five times in a row after " + totalCount + " rolls.");

	}

}

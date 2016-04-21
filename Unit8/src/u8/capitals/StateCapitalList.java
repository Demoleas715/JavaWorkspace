package u8.capitals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class StateCapitalList {

	private StateCapital[] stateCapitalList = new StateCapital[2];
	private int numStates = 0;

	public StateCapitalList(String fileName) throws FileNotFoundException {
		Scanner in = new Scanner(new FileReader(fileName));
		while (in.hasNextLine()) {
			String line = in.nextLine();
			String[] stateAndCapital = line.split("	");
			StateCapital sc = new StateCapital(stateAndCapital[0], stateAndCapital[1]);
			if (numStates == stateCapitalList.length) {
				expandArray();
			}
			stateCapitalList[numStates] = sc;
			numStates++;
		}
	}

	public StateCapital getRandomState() {
		Random rand = new Random();
		int randNum = rand.nextInt(numStates);
		return stateCapitalList[randNum];
	}

	public int statesRemaining() {
		return numStates;
	}

	public void remove(StateCapital sc) {
		StateCapital[] newList = new StateCapital[numStates - 1];
		Boolean equal = false;
		for (int i = 0; i < numStates; i++) {
			if (equal) {
				newList[i - 1] = stateCapitalList[i];
			}
			if (!stateCapitalList[i].equals(sc) && !equal) {
				newList[i] = stateCapitalList[i];
			} else {
				equal = true;
			}
		}
		stateCapitalList = newList;
		numStates--;
	}

	public void expandArray() {
		StateCapital[] newList = new StateCapital[numStates * 2];
		for (int i = 0; i < numStates; i++) {
			newList[i] = stateCapitalList[i];
		}
		stateCapitalList = newList;
	}
}

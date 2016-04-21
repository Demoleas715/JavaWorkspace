package u7;

public class SieveOfEratosthenes {

	public static boolean[] createArray(int iSize) {
		boolean[] numbers = new boolean[iSize];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = true;
		}
		return numbers;
		// Returns an array of booleans of length iSize and initializes all
		// elements in the array to true
	}

	public static void printPrimes(boolean[] primes, int numsPerLine) {
		int count = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.print(i + " ");
				count++;
				if (count % 10 == 0) {
					System.out.println();
				}
			}
			
		}
		// Prints a list of prime numbers, as identified by the array "primes".
		// The method prints "numsPerLine" primes per line in the output.
	}

	public static void calculatePrimes(boolean[] primes) {
		for (int i = 0; i < primes.length; i++) {
			if (i == 1)
				primes[i] = false;
			for (int j = 2; j < Math.sqrt(primes.length); j++) {
				if (i == j) {
					j++;
				}
				else if (primes[i] == false) {
					j++;
				}
				else if (i % j == 0) {
					primes[i] = false;
				}
			}

		}
		// Implements the Sieve of Eratosthenes algorithm to determine a list of
		// primes. This method uses the length of the variable prime to
		// determine its range of calculation. This method assumes the array has
		// been initialized to all "trues".
	}

	public static void main(String[] args) {
		boolean[] array = createArray(100000);
		calculatePrimes(array);
		printPrimes(array, 10);
	}
}

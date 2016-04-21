package u7;

import java.util.Arrays;
import java.util.Random;

import org.omg.Messaging.SyncScopeHelper;

public class Sorting {

	public static int binarySearch(int[] a, int val) {
		int low = 0;
		int high = a.length - 1;
		while (high >= low) {
			int mid = (high + low / 2);
			if (a[mid] == val) {
				return mid;
			} else if (val > a[mid]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static int linearSearch(int[] a, int val) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == val) {
				return i;
			}
		}
		return -1;
	}

	public static int[] getNewArray(int size) {
		Random rand = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt();
		}
		return nums;
	}

	public static void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int smPos = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[smPos]) {
					smPos = j;
				}

			}
			int temp = nums[i];
			nums[i] = nums[smPos];
			nums[smPos] = temp;
			// System.out.println(Arrays.toString(nums));
		}
	}

	public static void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > num) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = num;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = getNewArray(100000000);
		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		double seconds = (end - start) / 1000.0;

		System.out.println(seconds);
		// System.out.println(Arrays.toString(a));long start =
		// System.currentTimeMillis();
		start = System.currentTimeMillis();
		int pos = linearSearch(a, 11111);
		System.out.println("Position " + pos);
		end = System.currentTimeMillis();
		seconds = (end - start) / 1000.0;
		System.out.println(seconds);
		
		start = System.currentTimeMillis();
		pos = binarySearch(a, 11111);
		System.out.println("Position " + pos);
		end = System.currentTimeMillis();
		seconds = (end - start) / 1000.0;
		System.out.println(seconds);

	}

}

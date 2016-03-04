package u7;

import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static int[] getNewArray(int size) {
		Random rand = new Random(1327);
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(1000);
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
			System.out.println(Arrays.toString(nums));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = getNewArray(10);
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

}

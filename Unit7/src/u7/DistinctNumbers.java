package u7;

import java.util.Scanner;

public class DistinctNumbers {
	
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		int[] nums = new int[10];
		int pos = 0;
		
		System.out.println("Enter 10 numbers.");
		
		for (int i = 0; i < 10; i++){
			int n = input.nextInt();
			
			boolean bFound = false;
			
			for (int j = 0; j < pos; j++){
				if (nums[j] == n){
					bFound = true;
					break;
				}
			}
			
			if (!bFound) {
				nums[pos++] = n;
			}
		}
		for (int i = 0; i < pos; i++){
			System.out.println(nums[i]);
		}
	}
}

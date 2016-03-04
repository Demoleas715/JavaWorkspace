package u7;

import java.util.Scanner;

public class Switch {
	
	public static void switchBiggest (String[] a){
		int biggest = 0;
		int smallest = 0;
		for (int i = 1; i < a.length; i++){
			if (a[i].length() > a[biggest].length()){
				biggest = i;
			}
			if (a[i].length() < a[smallest].length()){
				smallest = i;
			}
		}
		String temp = a[smallest];
		a[smallest] = a[biggest];
		a[biggest] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		String[] strings = new String[6];
		System.out.println("Please enter 6 strings");
		
		for (int i = 0; i<6; i++){
			strings[i] = input.nextLine();
		}
		switchBiggest(strings);
		for (int i = 0; i<strings.length; i--){
			System.out.print(strings[i]);
		}
	}

}

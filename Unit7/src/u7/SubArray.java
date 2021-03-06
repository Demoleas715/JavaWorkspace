package u7;

import java.util.Arrays;

public class SubArray {

	public static String[] subArray(String[] array, int start, int end) {
		String[] to = new String[end - start];

		int pos = 0;
		for (int i = start; i < end; i++) {
			to[pos++] = array[i];
		}
		return to;
	}

	public static String[] subArray(String[] array, int start) {
		return subArray(array, start, array.length);
	}

	public static void main(String[] args) {
		String[] strings = { "car", "boat", "plane", "skis", "motorcycle", "snowmobile" };

		String[] a1 = subArray(strings, 2, 4);
		String[] a2 = subArray(strings, 4);
		
		System.out.println("2 -> 4");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
	}
}

package u7;

public class ArrayCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[15];
		a[5] = 63;
		a[1] = 14;
		
		for (int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		
		String[] b = {"Happy", "Sad", "Angry", "Love"};
		
		System.out.println(b[1]);
	}

}

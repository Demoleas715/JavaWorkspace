package u7;

public class Recursion {

	public static int f(int x) {
		System.out.println("Entering for x=" + x);
		int ret;
		
		if (x == 1) {
			ret = 6;
		} 
		
		else {
			ret = 3 * f(x - 1) + 4;
		}
		
		System.out.println("Exiting for f(" + x + ") = " + ret);
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(f(a));
	}

}

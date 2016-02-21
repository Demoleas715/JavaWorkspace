package u7;

public class Scope {
	public static void main(String[] args){
		int x = 14;
		
		if (x > 5){
			int y = 2;
			
			System.out.println(x + y);
		}
		System.out.println(x);
		System.out.println();
	}
}

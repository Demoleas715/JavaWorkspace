package u7;

public class Strings {
	public static void main(String[] args){
		String s = "Hello world";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.substring(3));
		
		System.out.println(s.substring(0, 3));
		
		System.out.println(s.substring(s.length()-4, s.length()));
	}
}

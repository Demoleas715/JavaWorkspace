package u7;

public class Overloading {

	public static void sayHi() {
		System.out.println("Hi!");
	}

	public static void sayHi(String name) {
		System.out.println("Hi, " + name + "!");
	}

	public static void sayHi(int times) {
		for (int i = 0; i < times; i++) {
			sayHi();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayHi ("Sean Kim");
		sayHi(5);
		sayHi();
	}

}

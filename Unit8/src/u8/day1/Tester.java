package u8.day1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point a = new Point(2, 3);
		Point b = new Point(-10, 14);

		Rectangle r = new Rectangle(a, b);

		System.out.println(r);

		r.translate(3, 4);

		System.out.println(r);

		a.x = 15;
		a.y = 1;

		Rectangle r2 = new Rectangle(a, b);

		r.setPt1(new Point(3, 4));

		System.out.println("r: " + r);
		System.out.println("r2: " + r2);
	}

}

package u8.day12;

public class ShapeTest {
	public static void main(String[] args) {
		Point p1 = new Point(15, 2);
		Point p2 = new Point(-2, 4);
		Point p3 = new Point(5, -3);
		Point p4 = new Point(0, 6);

		Shape[] a = new Shape[3];
		a[0] = new Circle(p1, 5);
		a[1] = new Rectangle(p2, p3);
		a[2] = new Circle(p4, 8);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("Area: " + a[i].getArea());
			System.out.println("Perimeter " + a[i].getPerimeter());
			a[i].translate(2, 3);
			System.out.println(a[i]);
		}
	}
}

package u8.day12;

public class Circle extends Shape {
	private Point center;
	private double radius;

	public Circle(Point center, double radius) {
		super("Circle");
		this.center = center;
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public void translate(double deltaX, double deltaY) {
		center.translate(deltaX, deltaY);
	}

	@Override
	public String toString() {
		return name + " at " + center + " with radius " + radius;
	}
}

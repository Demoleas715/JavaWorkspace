package u8.day12;

public abstract class Shape {
	protected String name = "";

	public Shape(String name) {
		this.name = name;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract void translate(double deltaX, double deltaY);
}
package u8.day12;

public class Rectangle extends Shape{
	private Point pt1;
	private Point pt2;

	public Rectangle(Point pt1, Point pt2) {
		super("Rectangle");
		this.pt1 = pt1;
		this.pt2 = pt2;
	}

	public Double getWidth() {
		return Math.abs(pt1.getX() - pt2.getX());
	}

	public Double getHeight() {
		return Math.abs(pt1.getY() - pt2.getY());
	}

	public double getArea() {
		return getHeight() * getWidth();
	}

	public double getPerimeter() {
		return 2 * (getHeight() + getWidth());
	}

	public void translate(double dx, double dy) {
		pt1.translate(dx, dy);
		pt2.translate(dx, dy);
	}

	public void dilate(double factor) {
		pt1.dilate(factor);
		pt2.dilate(factor);
	}

	public String toString() {
		return "Rectangle: " + pt1 + "; " + pt2;
	}

	public Point getPt1() {
		return pt1;
	}

	public void setPt1(Point pt1) {
		this.pt1 = pt1;
	}

	public Point getPt2() {
		return pt2;
	}

	public void setPt2(Point pt2) {
		this.pt2 = pt2;
	}
}

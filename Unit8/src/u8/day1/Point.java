package u8.day1;

public class Point {
	public double x;
	public double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point(Point p) {
		x = p.x;
		y = p.y;
	}

	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}

	public void dilate(double factor) {
		x *= factor;
		y *= factor;
	}

	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}

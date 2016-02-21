package u7;

public class Cylinder {
	public static double volume(double r, double h) {
		return Math.PI * r * r * h;
	}

	public static double sa(double r, double h) {
		return 2 * Math.PI * r * r + 2 * Math.PI * r * h;
	}

	public static void main(String[] args) {
		double r = 15;
		double h = 5;
		
		double v = volume(r, h);
		double surfaceArea = sa(r, h);
		
		System.out.println("Volume = " + v);
		System.out.println("Surface Area = " + surfaceArea);
	}
}

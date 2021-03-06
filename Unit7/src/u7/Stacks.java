package u7;

public class Stacks {
	public static double f(double x) {
		return 4 * x + 3;
	}

	public static double g(double x, double y) {
		double c = f(x);
		double d = f(y);
		
		return f(x) + f(y);
	}

	public static double h(double x, double y) {
		double a = x + y;
		double b = x - y;

		return g(x, a) + g(y, b);
	}

	public static void main(String[] args) {
		double m = 4;
		double n = 6;

		double p = h(m, n);
	}

}

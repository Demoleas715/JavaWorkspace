package u7.ex;

public class Ex5_8 {

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) * (5 / 9.0);
	}

	public static void main(String[] args) {
		System.out.printf("%-15s %-15s %-15s %-15s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");
		double f = 120.0;
		for (double c = 40.0; c>30; c--){
			System.out.printf("%-15.1f %-15.1f %-15.1f %-15.2f\n", c, celsiusToFahrenheit(c), f, fahrenheitToCelsius(f));
			f -= 10;
		}
	}
}

package u6;

public class MITTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 46400;
		for (int i = 2015; i <= 2030; i++) {
			System.out.printf("%d: %,.2f\n", i, tuition);
			tuition *= 1.0379;
		}
	}

}

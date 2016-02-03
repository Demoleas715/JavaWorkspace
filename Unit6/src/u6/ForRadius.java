package u6;

public class ForRadius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int r = 0; r < 40; r+=5){
			System.out.printf("%8d %8.2f\n", r, r*r*3.14);
		}
	}

}

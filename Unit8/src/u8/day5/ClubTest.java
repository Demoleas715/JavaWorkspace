package u8.day5;

public class ClubTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Club c1 = new Club ("3-d Printing", "DeFalco", Club.AFTERNOON);
		Club c2 = new Club ("Soccer for Hope", "Tony", Club.MORNING);
		
		Student s1 = new Student("Cassandra", "Moe", "ATCS", 2019);
		Student s2 = new Student("Steve", "Garcia", "ATCS", 2019);
		Student s3 = new Student("Timothy", "Gallagher");
		
		c1.addStudent(s1);
		c1.addStudent("Evan", "Demoleas");
		c1.addStudent("Iris", "Kim");
		c1.addStudent("Dan", "Ptashny");
		System.out.println(c1);
		
		System.out.println(c1.findStudent("Iris", "Kim"));
		
		c1.deleteStudent(1);
		System.out.println(c1);
	}

}

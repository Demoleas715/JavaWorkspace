package u8.inheritance;

public class Teacher extends Person {

	private String department;

	public Teacher(String firstName, String lastName, String department) {
		super(firstName, lastName);
		this.department = department;
	}

	public String toString() {
		return "Teacher: " + firstName + " " + lastName + " - " + department;
	}

	@Override
	public String getGreeting() {
		return "Hi, I'm Teacher " + lastName + ".";
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}

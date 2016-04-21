package u8.day5;

public class Student {

	private String firstName;
	private String lastName;
	private String academy;
	private int gradYear;

	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student(String firstName, String lastName, String academy, int gradYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.academy = academy;
		this.gradYear = gradYear;
	}

	public boolean equals(Object o) {
		if (o instanceof Student) {
			Student s = (Student) o;
			if (s.lastName.equals(this.lastName) && s.firstName.equals(this.firstName)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAcademy() {
		return academy;
	}

	public void setAcademy(String academy) {
		this.academy = academy;
	}

	public int getGradYear() {
		return gradYear;
	}

	public void setGradYear(int gradYear) {
		this.gradYear = gradYear;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", academy=" + academy + ", gradYear="
				+ gradYear + "]";
	}
}

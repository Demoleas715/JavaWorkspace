package u8.day5;

public class Club {

	public static final int MORNING = 0;
	public static final int AFTERNOON = 1;

	public static final String[] TYPES = { "Morning", "Afternoon" };

	private String name;
	private String advisor;
	private int type;
	private Student[] studentList = new Student[2];
	private int numStudents = 0;

	public Club(String name, String advisor, int type) {
		this.name = name;
		this.advisor = advisor;
		this.type = type;
	}

	private void expandArray() {
		Student[] newList = new Student[studentList.length * 2];
		for (int i = 0; i < studentList.length; i++) {
			newList[i] = studentList[i];
		}
		studentList = newList;
	}

	public void addStudent(Student s) {
		if (numStudents == studentList.length) {
			expandArray();
		}
		studentList[numStudents] = s;
		numStudents++;
	}

	public void addStudent(String firstName, String lastName) {
		addStudent(new Student(firstName, lastName));
	}

	public int findStudent(Student s) {
		for (int i = 0; i < numStudents; i++) {
			if (studentList[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}

	public int findStudent(String firstName, String lastName) {
		return findStudent(new Student(firstName, lastName));
	}

	public void deleteStudent(int index) {
		for (int i = index; i < numStudents - 1; i++) {
			studentList[i] = studentList[i + 1];
		}
		numStudents--;
	}

	public String toString() {
		String s = name + "(" + TYPES[type] + ") - " + advisor;

		if (numStudents > 0) {
			Student st = studentList[0];
			s += "; Students = " + st.getFirstName() + " " + st.getLastName();

			for (int i = 1; i < numStudents; i++) {
				st = studentList[i];
				s += ", " + st.getFirstName() + " " + st.getLastName();
			}
		}
		return s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}

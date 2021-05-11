package odev2;

public class Student extends User {
	private String Grade;

	public Student(int id, String firstName, String lastName, String email, String grade) {
		super(id, firstName, lastName, email);
		Grade = grade;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

}

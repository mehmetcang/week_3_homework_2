package odev2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor(1, "engin", "demiro�", "aa", "abc");
		System.out.println(instructor.getEmail());
		
		Student student = new Student(2, "mehmet", "g�ltekin", "bb", "1");
		System.out.println(student.getEmail());
		
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		
		

	}

}

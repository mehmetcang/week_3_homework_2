package odev2;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println(user.getEmail() +"öğrenci eklendi");
	}

}

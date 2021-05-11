package odev2;

public class Instructor extends User{
	private String certificate;

	public Instructor(int id, String firstName, String lastName, String email, String certificate) {
		super(id, firstName, lastName, email);
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

}

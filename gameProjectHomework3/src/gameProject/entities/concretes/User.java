package gameProject.entities.concretes;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String nationalyId;
	private String yearOfBirth;
	public User() {
		super();
	}
	public User(int id, String firstName, String lastName, String eMail, String nationalyId, String yearOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.nationalyId = nationalyId;
		this.yearOfBirth = yearOfBirth;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getNationalyId() {
		return nationalyId;
	}
	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	

}

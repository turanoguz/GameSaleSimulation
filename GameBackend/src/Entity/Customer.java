package Entity;

public class Customer {
	private int �d;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private String dateOfBirth;
	public Customer(int id, String firstName, String lastName, String nationalityId, String dateOfBirth) {
		
		�d = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}
	
	
	public int getId() {
		return �d;
	}
	public void setId(int id) {
		�d = id;
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
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

}

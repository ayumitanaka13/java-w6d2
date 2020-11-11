
public class User {
	private int Id;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	
	//constructor
	
	public User(int Id, String firstName, String lastName, String email, String phoneNumber) {
		setId(Id);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setPhoneNumber(phoneNumber);
	}
	
	//getter
	
	/*
	 * @return patiendtId
	 */
	public int getId() {
		return Id;
	}
	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	
	
	//setter
	
	/*
	 * @param Id
	 */
	public void setId(int Id) {
		if (Id >= 1000 && 100000 >= Id) {
			this.Id = Id;
		} else {
			this.Id = 1000;
		}
	}
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
	}
	/*
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	/*
	 * @param email
	 */
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}
	/*
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	
	@Override
	public String toString() {
		return  "\nUser ID: " + Id + 
				"\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +  
				"\nEmail: " + email + 
				"\nPhone Number: " + phoneNumber;
	}
}

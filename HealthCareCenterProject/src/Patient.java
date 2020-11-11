import java.time.LocalDate;
import java.util.Objects;

public class Patient extends User {

	private LocalDate birthDate;
	private String gender;
	
	//constructor
	
	public Patient(int Id, String firstName, String lastName, String email, LocalDate birthDate, String phoneNumber, String gender) {
		super(Id, firstName, lastName, email, phoneNumber);
		setBirthDate(birthDate);
		setGender(gender);
	}
	
	//getter
	
	/*
	 * @return birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/*
	 * @return phoneNumber
	 */
	public String getGender() {
		return gender;
	}
	
	
	//setter

	/*
	 * @param birthDate
	 */
	public void setBirthDate(LocalDate birthDate) {
		if (Objects.nonNull(birthDate)) {
			this.birthDate = birthDate;
		} else {
			this.birthDate = LocalDate.now();
		}
	}

	/*
	 * @param gender
	 */
	public void setGender(String gender) {
		if (!gender.isEmpty() && !gender.equalsIgnoreCase(null)) {
			this.gender = gender;
		} else {
			this.gender = "Unknown";
		} 
	}
	
	@Override
	public String toString() {
		return  super.toString() + 
				"\nBirth Date: " + birthDate + 
				"\nGender: " + gender;
	}
}
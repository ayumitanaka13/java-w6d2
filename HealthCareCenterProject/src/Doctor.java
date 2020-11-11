import java.util.ArrayList;

public class Doctor extends User {


	private String specialty;
	private ArrayList<Appointment> appointments;
	
	//constructor 
	
	public Doctor(int Id, String firstName, String lastName, String phoneNumber, String email, String specialty) {
		super(Id, firstName, lastName, email, phoneNumber);
		setSpecialty(specialty);
		this.appointments = new ArrayList<Appointment>();
	}
	
	/*
	 * add appointments method
	 * @param appointment
	 */
	public void addAppointment(Appointment appointment) {
		this.appointments.add(appointment);
	}
	
	
	//getter
	
	/*
	 * @return specialty
	 */
	public String getSpecialty() {
		return specialty;
	}
	/*
	 * @return appointments
	 */
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	
	//setter

	
	/*
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		if (!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;
		} else {
			this.specialty = "Unknown";
		}
	}
	
	@Override
	public String toString() {
		return  super.toString()+ "\n" +
				"\nSpecialty: " + specialty + 
				"\nList of Appointments: " + appointments;
	}	
}
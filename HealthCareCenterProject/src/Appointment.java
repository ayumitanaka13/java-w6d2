import java.time.LocalDateTime;
import java.util.Objects;

public class Appointment implements Comparable<Appointment>{
	
	private Patient patient;
	private LocalDateTime appointmentDate;
	
	//constructor

	public Appointment(Patient patient, LocalDateTime appointmentDate) {
		setPatient(patient);
		setAppointmentDate(appointmentDate);
	}
	
	//getter
	
	/*
	 * @return patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/*
	 * @return appointmentDate
	 */
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	//setter
	
	/*
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		if(Objects.nonNull(patient)) {
			this.patient = patient;
		}
	}
	/*
	 * @param appointmentDate
	 */
	public void setAppointmentDate(LocalDateTime appointmentDate) {
			this.appointmentDate = appointmentDate;
	}
	

	@Override
	public int compareTo(Appointment o) {
		return this.getAppointmentDate().compareTo(o.getAppointmentDate());
	}

	@Override
	public String toString() {
		return 	"\n*** Patient Appointment Date ***" +
				"\nPatient Name : " + patient.getFirstName() + " " + patient.getLastName() +
				"\nAppointment date : " + appointmentDate;
	}
}
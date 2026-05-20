package interfacehospital;

public class Receptionist extends HospitalStaff {

	public Receptionist(String name, int employeeId) {
		super(name, employeeId);
	}
	public void bookAppointment() {
		System.out.println("Receptionist "+this.getName()+" booked appointment.");
	}
}

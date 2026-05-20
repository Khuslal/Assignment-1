package interfacehospital;

public class Test {
	public static void main(String[] args) {
		Doctor dr = new Doctor("Khush", 33);
		dr.writePrescription("Pentaprazol");
		
		Receptionist r = new Receptionist("Sandhya", 234);
		r.bookAppointment();
	}
}

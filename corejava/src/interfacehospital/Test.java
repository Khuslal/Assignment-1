package interfacehospital;

public class Test {
	public static void main(String[] args) {
		Doctor dr = new Doctor("Rajiv", 33);
		dr.writePrescription("Pentaprazol");
		
		Receptionist r = new Receptionist("Sandhya", 234);
		r.bookAppointment();
	}
}

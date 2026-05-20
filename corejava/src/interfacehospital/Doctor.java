package interfacehospital;

public class Doctor extends HospitalStaff implements Prescriber {

	public Doctor(String name, int employeeId) {
		super(name, employeeId);
		
	}

	@Override
	public void writePrescription(String medication) {
		System.out.println("Dr. "+this.getName()+" prescribed : "+medication);
		
	}

}

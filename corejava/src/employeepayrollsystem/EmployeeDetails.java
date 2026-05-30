package employeepayrollsystem;

public class EmployeeDetails implements EmployeeSalaryRecords{
	private int id;
	private String name;
	private String department;
	private double basicSalary;
	private double allowance;

	public int getId() {
		return id;
	}
	// setter for ID is removed as it does not require setter anymore

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	@Override
	public double totalSalary() {
		double totalSalary = getBasicSalary() + getAllowance();
		return totalSalary;
	}

}

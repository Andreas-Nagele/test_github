package abstractEmployee;

public class Manager extends Employee{

	public Manager (String name, double salary) {
		this.setName(name);
		this.setSalary(salary);
	}
	
	@Override
	public double calculateBonus() {
		return this.getSalary()*0.25;
	}

	
}

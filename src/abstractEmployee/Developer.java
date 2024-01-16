package abstractEmployee;

public class Developer extends Employee{

	public Developer(String name, double salary) {
		this.setName(name);
		this.setSalary(salary);
	}
	public double calculateBonus() {
		return this.getSalary()*0.1;
	}

}

package abstractEmployee;

public abstract class Employee {
	
	private String name;
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return this.name + "(" + this.salary + " €)";
	}

	public void increaseSalary(double amount) {
		this.salary += amount;
	}
	
	public abstract double calculateBonus();
}

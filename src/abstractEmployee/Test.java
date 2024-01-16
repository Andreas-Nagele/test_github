package abstractEmployee;

public class Test {

	public static void main(String[] args) {
		
		Manager m = new Manager("John Doe", 1200);
		System.out.println(m);
		System.out.println(m.calculateBonus());
		
		
		Developer d = new Developer("Max Mini", 2000);
		System.out.println(d);
		System.out.println(d.calculateBonus());

	}

}

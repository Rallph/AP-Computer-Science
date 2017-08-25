//
//This is the Employee class that will have the methods
//For the U1Test class

public class Employee {

	private double salary;
	private String name;

	public Employee() {

		salary = 55000;
		name = "Hacker, Harry";
	}

	public String getName() {

		return name;
	}

	public double getSalary() {

		return salary;
	}

	public void raiseSalary(double byPercent) {

		byPercent = byPercent / 100;

		salary = salary + (salary * byPercent);

	}

	public void bonus(int amount) {
		
		salary = salary + amount;
	}



}









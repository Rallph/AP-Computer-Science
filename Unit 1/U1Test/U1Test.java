//
// This is the driver class for the Employee class

public class U1Test {

	public static void main (String[] args) {

		Employee emp = new Employee();

		String name = emp.getName();
		double salary = emp.getSalary();
		System.out.println(name + "   " + salary);

		emp.raiseSalary(4);
		salary = emp.getSalary();
		System.out.println(salary);

		emp.bonus(200);
		salary = emp.getSalary();
		System.out.println(salary);

		emp.raiseSalary(5.5);
		salary = emp.getSalary();
		System.out.println(salary);

	}
}

/*

Output:

Hacker, Harry   55000.0
57200.0
57400.0
60557.0
Press any key to continue . . .

*/









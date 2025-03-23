import java.util.Calendar;

/**
 * Manages employee-related operations such as creating employees, calculating
 * salaries, and printing employee details.
 */
public class EmployeeManager {
	private static final int BONUS = 200; // Bonus amount for employees whose birthday is in the current month
	private Employee[] employees;

	/**
	 * Constructor initializes the employee array.
	 */
	public EmployeeManager() {
		createEmployees();
	}

	/**
	 * Creates and initializes the employee array with different types of employees.
	 */
	public void createEmployees() {
		employees = new Employee[] {
				new HourlyEmployee("Or", "SabanGrade100", "999", 55, 150, new DayOfBirth(30, 7, 1999)),
				new SalariedEmployee("Hen", "Ulmar", "111", 10000, new DayOfBirth(2, 1, 2000)),
				new CommissionEmployee("XXX", "YYY", "222", 10000, 0.06, new DayOfBirth(1, 3, 1999)),
				new PieceWorker("Maya", "Malkiss", "999", 50, 60, new DayOfBirth(26, 6, 2002)) };
	}

	// Prints details of each employee, including their type, personal information,
	// and salary (with possible bonus).
	public void printArrayOfEmployees() {
		int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1; // Get the current month

		for (int i = 0; i < employees.length; i++) {// Iterate over the array of employees
			System.out.println("-----------");
			System.out.println("Employee Type: " + employees[i].getClass().getSimpleName()); // Print employee's class
																								// name
			System.out.println(employees[i]);// Print employee details using toString()
			System.out.println("Salary: " + PrintSalaryAndBonus(employees[i], currentMonth)); // Print salary including
																								// potential bonus

		}
		System.out.println("-----------");
	}

	// Calculates the salary of an employee, including a bonus if their birthday
	// falls in the current month.
	private static double PrintSalaryAndBonus(Employee employee, int currentMonth) {
		double salary = employee.earnings(); // Get the base salary of the employee
		if (currentMonth == employee.getBirthDate().getMonth()) { // Check if employee's birth month matches the current
																	// // month
			salary += BONUS;
			System.out.println("🎉 Happy Birthday " + employee.getFirstName() + "! You received a 200$ bonus! 🎉");
		}
		return salary;
	}
}

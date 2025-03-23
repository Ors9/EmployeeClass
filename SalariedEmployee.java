/**
 * Represents a salaried employee who is paid a fixed weekly salary. This class
 * extends the Employee class.
 */
public class SalariedEmployee extends Employee {
	private double weeklySalary; // Weekly salary of the employee

	// Constructor for SalariedEmployee class
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary,
			DayOfBirth birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate); // Call to the constructor of the superclass
																		// (Employee)
		if (weeklySalary < 0) { // Validate weeklySalary
			throw new IllegalArgumentException("Weekly salary must be >= 0");

		}
		this.weeklySalary = weeklySalary; // Initialize weeklySalary
	}

	// Setter for weeklySalary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0) { // Validate weeklySalary
			throw new IllegalArgumentException("Weekly salary must be >= 0");

		}

		this.weeklySalary = weeklySalary; // Set weeklySalary
	}

	// Getter for weeklySalary
	public double getWeeklySalary() {
		return weeklySalary; // Return weeklySalary
	}

	// Implementation of earnings method for SalariedEmployee
	@Override
	public double earnings() {
		return getWeeklySalary(); // Return weeklySalary as earnings for salaried employee
	}

	// Override toString method to provide formatted string representation of
	// SalariedEmployee
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%, .2f", super.toString(), "weekly salary",
				getWeeklySalary()); // Format and return string representation
	}
}
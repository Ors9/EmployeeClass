
/**
 * Represents an hourly employee who is paid based on hours worked and an hourly
 * wage. This class extends the Employee class.
 */
public class HourlyEmployee extends Employee {

	private double wage; // Hourly wage
	private double hours; // Hours worked per week

	// Constructor for HourlyEmployee class
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours,
			DayOfBirth birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate); // Call to the constructor of the superclass
																		// (Employee)
		if (wage < 0) // Validate hourly wage
			throw new IllegalArgumentException("Hourly wage must be >= 0");

		if ((hours < 0) || (hours > 168)) // Validate hours worked
			throw new IllegalArgumentException("Hours worked must be >=0 and <= 168");

		this.wage = wage; // Initialize wage
		this.hours = hours; // Initialize hours

	}

	// Getter for wage
	public double getWage() {
		return wage; // Returns the hourly wage
	}

	// Setter for wage
	public void setWage(double wage) {
		if (wage < 0) // Validate hourly wage
			throw new IllegalArgumentException("Hourly wage must be >= 0");

		this.wage = wage; // Set hourly wage
	}

	// Getter for hours
	public double getHours() {
		return hours; // Returns the hours worked
	}

	// Setter for hours
	public void setHours(double hours) {
		if ((hours < 0) || (hours > 168)) // Validate hours worked
			throw new IllegalArgumentException("Hours worked must be >=0 and <= 168");

		this.hours = hours; // Set hours worked
	}

	// Implementation of earnings method for HourlyEmployee
	@Override
	public double earnings() {
		if (getHours() <= 40) // Check if hours worked is less than or equal to 40 (regular hours)
			return getHours() * getWage(); // Calculate earnings for regular hours
		else // If hours worked is greater than 40 (overtime hours)
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5; // Calculate earnings with overtime pay (1.5
																			// times the wage for hours over 40)
	}

	// Override toString method to provide formatted string representation of
	// HourlyEmployee
	@Override
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%, .2f; %s: %, .2f", super.toString(), "hourly wage", getWage(),
				"hours worked", getHours()); // Format and return string representation
	}

}
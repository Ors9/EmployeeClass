/**
 * Represents an employee who earns a commission based on their gross sales.
 * This class extends the Employee class.
 */
public class CommissionEmployee extends Employee {

	private double grossSales; // Total sales made by the employee
	private double commissionRate; // Percentage of sales earned as commission

	// Constructs a CommissionEmployee object with given details.
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, DayOfBirth birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);

		// Validate commistion rate and grossSales
		if (commissionRate <= 0 || commissionRate >= 1)
			throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
		if (grossSales < 0)
			throw new IllegalArgumentException("Gross sales must be >= 0");
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	// return The total gross sales made by the employee.
	public double getGrossSales() {
		return grossSales;
	}

	// Sets the total gross sales.
	public void setGrossSales(double grossSales) {
		if (grossSales < 0)
			throw new IllegalArgumentException("Gross sales must be >= 0");
		this.grossSales = grossSales;
	}

	// return The commission rate as a decimal (e.g., 0.06 for 6%).
	public double getCommissionRate() {
		return commissionRate;
	}

	// Sets the commission rate.
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0 || commissionRate >= 1)
			throw new IllegalArgumentException("Commission rate must be > 0 and < 1");
		this.commissionRate = commissionRate;
	}

	@Override
	// Calculates the earnings based on gross sales and commission rate.
	public double earnings() {
		return getCommissionRate() * getGrossSales();
	}

	@Override
	// Returns a formatted string representation of the CommissionEmployee.
	public String toString() {
		return String.format("%s: %s%n%s: $%, .2f; %s: %, .2f", "commission employee", super.toString(), "gross sales",
				getGrossSales(), "commission rate", getCommissionRate()); // Format and return string representation

	}

}

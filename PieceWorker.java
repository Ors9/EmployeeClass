/**
 * Represents a piece worker who is paid based on the number of items produced.
 * This class extends the Employee class.
 */
public class PieceWorker extends Employee {
	private static final int MIN_ITEMS = 0; // Minimum valid number of items
	private static final double MIN_SALARY_PER_ITEM = 0.01; // Minimum valid salary per item

	private int numberOfItems;// Number of items produced
	private double salaryPerItem; // Payment per item produced

	// Constructs a PieceWorker object with given details.
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int numberOfItems,
			double salaryPerItem, DayOfBirth birthDate) {
		super(firstName, lastName, socialSecurityNumber, birthDate);// Call to the constructor of the superclass
		// (Employee)

		this.setNumberOfItems(numberOfItems);
		this.setSalaryPerItem(salaryPerItem);

	}

	@Override
	// Calculates the earnings based on the number of items produced and the salary
	// per item.
	public double earnings() {
		return this.numberOfItems * this.salaryPerItem;
	}

	/** @return The total number of items produced. */
	public int getNumberOfItems() {
		return this.numberOfItems;
	}

	/** @return The amount paid per item produced. */
	public double getSalaryPerItem() {
		return this.salaryPerItem;

	}

	// Sets the number of items produced.
	public void setNumberOfItems(int numberOfItems) {
		// Check if valid
		if (numberOfItems < MIN_ITEMS) {
			throw new IllegalArgumentException("Number of items must be >= " + MIN_ITEMS);
		}
		this.numberOfItems = numberOfItems;
	}

	// Sets the salary per item.
	public void setSalaryPerItem(double salaryPerItem) {
		// Check if valid
		if (salaryPerItem < MIN_SALARY_PER_ITEM) {
			throw new IllegalArgumentException("Salary per item must be >= " + MIN_SALARY_PER_ITEM);
		}
		this.salaryPerItem = salaryPerItem;
	}

	// Override toString method to provide formatted string representation of
	// PieceWorker
	@Override
	public String toString() {
		return String.format("Piece Worker: %s%nNumber of Items: %d; Salary per Item: $%.2f", super.toString(),
				numberOfItems, salaryPerItem);
	}

}

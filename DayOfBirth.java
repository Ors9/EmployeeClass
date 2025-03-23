/**
 * The DayOfBirth class represents a date of birth, including day, month, and
 * year.
 */
public class DayOfBirth {
	private static final int MIN_YEAR = 1;
	private static final int MIN_MONTH = 1;
	private static final int MAX_MONTH = 12;
	private static final int MIN_DAY = 1;
	// private static final int MAX_DAY = 31;

	// Array representing the number of days in each month (non-leap year)
	private static final int[] DAYS_IN_MONTHS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int day;
	private int month;
	private int year;

	// Copy constructor - creates a new DayOfBirth object with the same values.
	public DayOfBirth(DayOfBirth other) {
		this(other.day, other.month, other.year); // Uses main constructor
	}

	/**
	 * Constructs a DayOfBirth object with a given day, month, and year. Validates
	 * that the date is correct.
	 */
	public DayOfBirth(int day, int month, int year) {
		setYear(year); // Use setter for year (ensures validation)
		setMonth(month); // Use setter for month (ensures validation)
		setDay(day); // Use setter for day (ensures validation)
	}

	// Gets the day of birth.
	public int getDay() {
		return this.day;
	}

	// Gets the month of birth.
	public int getMonth() {
		return this.month;
	}

	// Gets the year of birth.
	public int getYear() {
		return this.year;
	}

	// Sets the day of birth, ensuring it is valid for the current month and year.
	public void setDay(int day) {
		if (day < MIN_DAY || day > getDaysInMonth(this.month, this.year)) {
			throw new IllegalArgumentException("Invalid day for the given month.");
		}
		this.day = day;
	}

	// Sets the month of birth, ensuring the current day remains valid.
	public void setMonth(int month) {
		if (month < MIN_MONTH || month > MAX_MONTH) {
			throw new IllegalArgumentException("Month must be between 1 and 12.");
		}
		if (this.day > getDaysInMonth(month, this.year)) {
			throw new IllegalArgumentException("Current day is invalid for the new month.");
		}
		this.month = month;
	}

	// Sets the year of birth if valid.
	public void setYear(int year) {
		if (year < MIN_YEAR) {
			throw new IllegalArgumentException("Year must be positive.");
		}
		this.year = year;
	}

	@Override
	// Returns a string representation of the date of birth in the format
	// DD/MM/YYYY.
	public String toString() {
		return day + "/" + month + "/" + year;
	}

	// Determines the number of days in a given month of a given year.
	private int getDaysInMonth(int month, int year) {
		if (month == 2 && isLeapYear(year)) {
			return 29;
		}
		return DAYS_IN_MONTHS[month - 1];
	}

	// Checks if a given year is a leap year.
	private boolean isLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}

}

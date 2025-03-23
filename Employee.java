/**
 * Represents an abstract Employee with basic personal information. This class
 * serves as a base class for different types of employees.
 */
public abstract class Employee {

	private final String firstName; // First name of the employee
	private final String lastName; // Last name of the employee
	private final String socialSecurityNumber; // Social Security Number of the employee
	private final DayOfBirth birthDate; // Employee's date of birth

	// Constructor to initialize Employee object
	public Employee(String firstName, String lastName, String socialSecurityNumber, DayOfBirth birthDate) {
		this.firstName = firstName; // Initialize firstName
		this.lastName = lastName; // Initialize lastName
		this.socialSecurityNumber = socialSecurityNumber; // Initialize socialSecurityNumber
		this.birthDate = new DayOfBirth(birthDate); // Returning a new object to prevent external modifications
	}

	// Getter for firstName
	public String getFirstName() {
		return firstName; // Returns the first name of the employee
	}

	// Getter for lastName
	public String getLastName() {
		return lastName; // Returns the last name of the employee
	}

	// Getter for socialSecurityNumber
	public String getSocialSecurityNumber() {
		return socialSecurityNumber; // Returns the social security number of the employee
	}

	// Returns a string representation of the Employee, including personal details
	// and birth date.
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s%ndate of birth: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber(), birthDate.toString());
	}

	// Abstract method for calculating earnings - to be implemented by subclasses
	public abstract double earnings();

	// return a new DayOfBirth object representing the employee's birth date.
	public DayOfBirth getBirthDate() {
		return new DayOfBirth(this.birthDate);
	}

}
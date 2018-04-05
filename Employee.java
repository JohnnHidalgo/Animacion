package employee;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	
	public Employee(String first, String last, String ssn) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
	}//fin Employee


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getsocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString () {
		return String.format("%s %s\n  socil security nuber: %s", getFirstName(), getLastName(), getsocialSecurityNumber() );
	}
	
	public abstract double earnings();
}
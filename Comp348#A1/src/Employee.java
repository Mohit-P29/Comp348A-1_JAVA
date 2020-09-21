import java.math.BigDecimal;

public class Employee implements Person {

	private long ID;
	private String firstName;
	private String lastName;
	private double salary;

	// default constructor

	public Employee() {
		super();
	}

	// parameterized constructor
	public Employee(long iD, String firstName, String lastName, double salary) {
		super();
		ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

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

	public double getSalary() {

		return salary;
	}

	public BigDecimal getSalaryInBd() {
		return BigDecimal.valueOf(salary);
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (ID != other.ID)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	public static Employee parse(String employeeInfo) {
		
		String[] parseInfo =  employeeInfo.split(",");
		Long id = Long.parseLong(parseInfo[0]);
		String name = parseInfo[1];
		String lastName = parseInfo[2];
		double salary = Double.parseDouble(parseInfo[3]);
		
		return new Employee(id, name, lastName, salary);
		
	}

	public String toString() {
		return ID + "," + firstName + "," + lastName + "," + salary;
	}

}

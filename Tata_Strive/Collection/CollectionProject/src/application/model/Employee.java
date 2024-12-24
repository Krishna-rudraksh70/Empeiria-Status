package application.model;

public class Employee {
	private int empid;
	private String name;
	private String deg;
	private String dept;
	private double salary;

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getDeg() {
		return deg;
	}

	public String getDept() {
		return dept;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(int empid, String name, String deg, String dept, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.deg = deg;
		this.dept = dept;
		this.salary = salary;
	}
	
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", deg=" + deg + ", dept=" + dept + ", salary=" + salary
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((deg == null) ? 0 : deg.hashCode());
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
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
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (deg == null) {
			if (other.deg != null)
				return false;
		} else if (!deg.equals(other.deg))
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}

	
}

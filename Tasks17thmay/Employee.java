package Tasks17thmay;

public class Employee {
	String name;
	String postion;
	int Salary;
	String department;
	
	
	public String getName() {
		return name;
	}
	public void setName(String string) {
		this.name = string;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", postion=" + postion + ", Salary=" + Salary + ", department=" + department
				+ "]";
	}
	
	
	
	

}

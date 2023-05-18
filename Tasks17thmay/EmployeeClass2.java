package Tasks17thmay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeClass2   {

	public static void main(String[] args) {

		Employee employee1 = new Employee();
		employee1.setName("ram");
		employee1.setPostion("HR");
		employee1.setSalary(700000);
		employee1.setDepartment("salesForce");

		Employee employee2 = new Employee();
		employee2.setName("krishna");
		employee2.setPostion("manager");
		employee2.setSalary(500000);
		employee2.setDepartment("business");

		Employee employee3 = new Employee();
		employee3.setName("usha");
		employee3.setPostion("Clerk");
		employee3.setSalary(800000);
		employee3.setDepartment("ADMINSTION");

		List<Employee>emplist=new ArrayList<>();

		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);

		for (Employee e : emplist) {
			System.out.println(e);
		}



	}
}









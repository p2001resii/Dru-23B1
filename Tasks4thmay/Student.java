package Tasks4thmay;

public class Student
{
	public String name;

	public Student(String name) {
	this.name = name;
	}

	
	public Student() {
	this.name = "unknow";
	}

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public static void main(String[] args) {
	
	Student student1 = new Student();
	Student student2 = new Student("prasanna");
	
	   System.out.println("Name of student1: " + student1.getName());
	   System.out.println("Name of student2: " + student2.getName());
	}
}


	



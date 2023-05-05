package Tasks4thmay;
  //.try to create a default constructor and a parameterised
    //constructor and use it in your class
public class Constractor  
{
	
	                
	// Instance variables
	String name;
	int age;

	// Default constructor
	
	public Constractor() 
	{
	this.name ="Unknow";
	this.age = 0;
	}

	// Parameterised constructor
	
	public Constractor  (String name, int age) {
	this.name = name;
	this.age = age;
	}

	
	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public int getAge() {
	return age;
	}

	public void setAge(int age) {
	this.age = age;
	}

	// Main method to test the class

	public static void main(String[] args) {

	
	// Create an object with default constructor and set values using the setter methods
	Constractor   c1 = new Constractor  ();
	c1.setName("Alice");
	c1.setAge(25);
	}
}


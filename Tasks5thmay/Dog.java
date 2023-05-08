package Tasks5thmay;

public class Dog  extends Animal1{
          
	public String type="mammal";
	 
	public void printType() {
		System.out.println("Iam a"+type);
		System.out.println("Iam an"+super.type);
	}
    public static void main(String[] args) 
    {
    	Dog dog1=new Dog();
    	dog1.printType();
		
	}
	}


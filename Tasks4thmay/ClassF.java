package Tasks4thmay;

public class ClassF extends ClassE
{
	int c=67;
	void show()
	{
		System.out.println("show is print");
		
	}
    public static void main(String[] args) 
    {
    	ClassF  CF=new ClassF();
    	CF.show();
    	CF.display();
		ClassE CE=new ClassE();
		CE.meth1();
		CE.display();
	}
}

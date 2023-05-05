package Tasks4thmay;
//create a class called Pizza and create a object for food class and 
  //try to acces the variables and methods in it.
public class Pizza 
{
	String food="pizza";
	int price=200;
	public void fooddetails()

	{
		System.out.println("what do you want");
		System.out.println("we want pizza");
		System.out.println(" how much of this");
		System.out.println(price+ "rupees");
	}
    public static void main(String[] args) 
    {
    	Pizza pi=new Pizza();
    	pi.fooddetails();
    	System.out.println(pi.food);
		System.out.println(pi.price);
	}
	
	
}
 
package Tasks4thmay;
 
//create a class named Food with some variables and methods and then create a object in same class, 
      //try to access these methods and variables

public class Food 
{
 String food="pizza";
 String food1="Egg Rice";
 String food2="Noodles";

	 public void  Eating()
	 {
		System.out.println("pizza is some better");
		System.out.println("Egg rice is gud");
		System.out.println("noddles is yummy");
	 }
	  public static void main(String[] args) 
	  {
		  Food fo=new Food();
		  fo.Eating();
		  System.out.println(fo.food);
		  System.out.println(fo.food1);
		  System.out.println(fo.food2);
		  
		  
		
	}
 }



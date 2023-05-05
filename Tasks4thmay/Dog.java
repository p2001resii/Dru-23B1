package Tasks4thmay;
   //create a class named dog and have any fields like colour, 
    //age , cost anything.. and try creating atleast 2- 3 objects 
   ///with name like germanshepherd, dalmation, anything
public class Dog 
{
	String color="red";
	int cost=2000;
	int age=8;
	String gender="male";
	
	   public Dog(String color,int cost,int age,String gender)//parametersied constractor
	   {
		   String color1 = color;
			int cost1=cost;
			int age1=age;
			String gender1=gender;
		   
	   }

      public Dog()       //default constractor
      {
    	  this.color="red";
    	  this.cost=2000;
    	  this.age=8;
    	  this.gender="male";
      }
      public static void main(String[] args) 
      {
    	  System.out.println("**********object creation1**********");
    	       Dog  samoyed=new Dog();
    	       samoyed.color="white";
    	       samoyed.cost=30000;
    	       System.out.println(samoyed.color);
    	       System.out.println(samoyed.cost);
    	  
    	   System.out.println("***********object creation2*********");
    	       Dog Eskimo=new Dog();
    	       Eskimo.color="white";
    	       Eskimo.age=9;
    	       System.out.println(Eskimo.color);
    	       System.out.println(Eskimo.age);
    	       
    	    System.out.println("************object creation3********");  
    	        Dog husky=new Dog();
    	        husky.color="grey";
    	        husky.age=13;
    	        System.out.println(husky.color);
    	        System.out.println(husky.age);
      }

}    	        
    	
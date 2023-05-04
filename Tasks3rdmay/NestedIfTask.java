package Tasks3rdmay;

import java.util.Scanner;

public class NestedIfTask 
{
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
      System.out.print("Enter your money: ");
     int money = sc.nextInt();
     if (money >= 50000)
     {
        System.out.println("You can afford an iPhone.");
     } 
     else if (money >= 25000) 
     {
         System.out.println("You can afford a Redmi.");
     } 
     else if (money >= 1000) 
     {
         System.out.println("You can buy a normal Nokia set.");
     } 
     else 
     {
         System.out.println("Sorry, you cannot afford any of these phones.");
         System.out.println("Please return home.");
     }

    
}
}

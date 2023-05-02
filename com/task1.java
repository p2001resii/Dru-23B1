package drucaretasks.com;

import java.util.Scanner;

public class task1 
{
	 public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Your Name:");
	        String Name=sc.nextLine();
	        System.out.println("Name:"+Name);
	       
	        System.out.println("Enter Your Id:");
	        int Id=sc.nextInt();
	        System.out.println("id:"+Id); 
	          
	        System.out.println("Name:"+Name+" "+"Id:"+Id);
	        System.out.println("Enter a number:");
	        int num1=sc.nextInt();
	        System.out.println("Enter another number:");
	        int num2=sc.nextInt();
	        System.out.println(num1+"+"+num2+"="+(num1+num2));
	            
	        sc.nextLine();
	        System.out.println("Enter Your CollegeName:");
	        String CollegeName=sc.nextLine();
	             
	        System.out.println("CollegeName:"+CollegeName);
	              
	        System.out.println(" enter any for two numbers for division");
	        System.out.println("Enter a number:");
	        int num3=sc.nextInt();
	        System.out.println("Enter another number:");
	        int num4=sc.nextInt();
	        System.out.println("Division of two numbers:"+num3+"/"+num4+"="+(num3/num4));
	        System.out.println("hello"+123);
	            
	        System.out.println(" enter two numbers for adding");
	        System.out.println("Enter a number:");
	        int num5=sc.nextInt();
	        System.out.println("Enter another number:");
	        int num6=sc.nextInt();
	        System.out.println("Addition of two numbers:"+num5+"+"+num6+"="+(num1+num2));
	            
	    }
	

}

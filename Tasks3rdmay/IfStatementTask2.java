package Tasks3rdmay;

import java.util.Scanner;

public class IfStatementTask2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter money:");
		int a =sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter ice cream money:");
		int  icecream=sc.nextInt();
		System.out.println("ice cream money is\n" +icecream);

		if(a>=icecream) {
		  System.out.println(" Its soo Yummy");
		} else {
		  System.out.println("Let me buy next time");
		}
		
	}

}

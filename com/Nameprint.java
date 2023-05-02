package drucaretasks.com;

import java.util.Scanner;

public class Nameprint 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter college name:");
		String clgname=sc.nextLine();
		System.out.println("enter name:");
		String name=sc.nextLine();
		
		System.out.println("enter your id:");
		int id=sc.nextInt();
		System.out.println(name);
		System.out.println(id);
		System.out.print(name+" "+id);
		System.out.println();
		System.out.println("addition of two numbers");
		System.out.println("enter first nbr:");
		int n1=sc.nextInt();
		System.out.println("enter second number:");
		int n2=sc.nextInt();
		int n3=n1+n2;
		System.out.println(n3);
		//System.out.println("hello");
		//System.out.println(id);
		System.out.println("hello"+" "+id);
		System.out.println("deviding the two numbers");
		int n=n1/n2;
		System.out.println(n);
		
	}

}

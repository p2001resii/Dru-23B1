package Tasks3rdmay;

import java.util.Scanner;

public class PatternDownwordTriangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print("*");
			}
		
		System.out.println();
		}
		
	}

}







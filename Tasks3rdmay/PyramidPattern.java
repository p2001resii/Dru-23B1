package Tasks3rdmay;

import java.util.Scanner;

public class PyramidPattern 
{
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int k=0;
		for(int i=1;i<num;i++)
		{
			for(int j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
		while(k!=2*i-1))
{
	System.out.println("*");
     k++;	
}
			System.out.print("*");	
			}
			System.out.println();
		}
		
}


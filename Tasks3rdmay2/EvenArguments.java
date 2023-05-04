package Tasks3rdmay2;

import java.util.Scanner;

public class EvenArguments 
{
	public boolean isEven(int number)
	{
		if(number%2 == 0)

			return true;

		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		EvenArguments ea=new EvenArguments();

		boolean result = ea.isEven(num);
		System.out.println(result);
	
}     
}
   





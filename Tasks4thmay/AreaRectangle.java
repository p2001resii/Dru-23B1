package Tasks4thmay;

import java.util.Scanner;

public class AreaRectangle 
{
	public int setDim(int l ,int b)
	{
	 int k;
	 k=l+b;
	 
	 return 2*k;
	 
	}
	public int getArea( int a, int b) {
        return a * b;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length");
		int l=sc.nextInt();
		System.out.println("enter breadth");
		int b=sc.nextInt();
		AreaRectangle ar=new AreaRectangle();
		
		 System.out.println("perimeter of rectangle: " + ar.setDim(l, b));
		 System.out.println("Area of rectangle: " + ar.getArea(l, b));
		
		

	}

}

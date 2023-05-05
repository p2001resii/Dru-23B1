package Tasks4thmay;

import java.util.Scanner;

public class RectangleArea 
{
	
		int length;
		int breadth;
        public RectangleArea(int l, int b) {
		     length = l;
		      breadth = b;
		}

		
		 public int returnArea() 
		 {
			 return length * breadth;
		}
		
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		int len = sc.nextInt();
		System.out.print("Enter breadth of rectangle: ");
		int brea = sc.nextInt();

		
		 
		   RectangleArea retangle = new RectangleArea(len, brea);
		  
		  
		  System.out.println("Area of rectangle: " + retangle.returnArea());
		}
		}

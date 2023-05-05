package Tasks4thmay;

public class RectangleSquare 
{
	public void calculateArea1(int side) {
	    int area = side * side;
	    System.out.println("Area of the square is: " + area);
	}

	public void calculateArea(int length, int breadth) {
	    int area = length * breadth;
	    System.out.println("Area of the rectangle is: " + area);
	}
	  public void calculateArea(int side) {
	        int area = side * side;
	        System.out.println("Area of the square: " + area);
	    }
	    
	    // Main method to test the class
	    public static void main(String[] args) 
	    {
	    	
	       RectangleSquare calculator = new RectangleSquare();
	    		   {
	            int side = 0;
				int area = side *side;
	            System.out.println("Area of the square: " + area);
	       calculator.calculateArea(5, 4);
	            
	        calculator.calculateArea(8);
	        
	       calculator.calculateArea(5, 4);
	        
	        calculator.calculateArea(8);
}
	    }
}

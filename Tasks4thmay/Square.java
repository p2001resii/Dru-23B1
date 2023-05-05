package Tasks4thmay;

public class Square extends Shape
{

	
    public void printSquare() {
    System.out.println("Square is a rectangle.");
}
	

public static void main(String[] args) {
	Square square = new Square();
	square.printShape();
	square.printSquare();
	
	}
}

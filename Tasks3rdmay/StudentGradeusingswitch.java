package Tasks3rdmay;

public class StudentGradeusingswitch 
{

	
	 public static void main(String[] args) {
	      char grade = 'A';

	      switch (grade) {
	         case 'A':
	            System.out.println("Excellent Your grade is " + grade + " with a score above 90%");
	            break;
	         case 'B':
	            System.out.println("Good  Your grade is " + grade + " with a score between 80%to 90%" );
	            break;
	         case 'C':
	            System.out.println("You passed Your grade is " + grade + " with a score between 70% to 80%");
	            break;
	         case 'D':
	            System.out.println("You can do better Your grade is " + grade + " with a score between 60% to 70%");
	            break;
	         case 'F':
	            System.out.println("Sorry, you failed Your grade is " + grade + " with a score below 60%");
	            break;
	         default:
	            System.out.println("Invalid grade");
	            break;
	      }
	 }
}

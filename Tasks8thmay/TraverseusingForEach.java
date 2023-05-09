package Tasks8thmay;
//Write a program to traverse (or iterate) ArrayList using for each loop
import java.util.ArrayList;

public class TraverseusingForEach {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(60);
		al.add(null);
		al.add(97);
		al.add(50);
		al.add("java");

		for(Object o:al)
		{
			System.out.println(o);
		}
	}
}



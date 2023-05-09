package Tasks8thmay;

import java.util.ArrayList;

public class RetriveElements {
	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add("drucare");
		al.add(20);
		al.add(null);
		al.add(30);
		al.add(50);
		System.out.println(al);

		System.out.println("****** retrieve elements specific index********");

		System.out.println(al.get(4));
		
	}

}



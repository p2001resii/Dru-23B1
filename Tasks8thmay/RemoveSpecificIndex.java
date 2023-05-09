package Tasks8thmay;

import java.util.ArrayList;

public class RemoveSpecificIndex {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add("drucare");
		al.add(20);
		al.add(null);
		al.add("upma");
		al.add(50);
		al.add("dosa");
		System.out.println(al);

		System.out.println("****Remove specific index*****");
		al.remove(5);
		System.out.println(al);
	}


}

package Tasks8thmay;

import java.util.ArrayList;

public class AddElement {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(10);
		al.add("biskate");
		al.add(20);
		al.add(null);
		al.add("upma");
		al.add(50);
		al.add("dosa");
		System.out.println(al);

		System.out.println("Add the element partical index");
		al.add(4, "icecream");
	}
}
package Tasks8thmay;

import java.util.ArrayList;

public class AddFoodItems {
	public static void main(String[] args) {

		ArrayList food=new ArrayList();
		food.add("egg rice");
		food.add("noodles");
		food.add("puri");
		food.add("bonda");
		food.add("biryani");
		food.add("chicken fry");
		food.add("bajji");
		
		System.out.println(food);
		
		System.out.println("**********************food items******************");
		for(int i=0;i< food .size();i++) {
			System.out.println(food.get(i));
		}
		
		//write a program to check if element(pizza) exists in ArrayList
		System.out.println("Elements exists in Arraylist");
		System.out.println(food.contains("pizza"));
	}
}
	

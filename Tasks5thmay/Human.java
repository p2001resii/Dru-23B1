package Tasks5thmay;

public class Human extends Monkey implements BasicAnimal {

	public void eat(String food) {

		System.out.println("The human eat : " +food);
	}

	@Override
	public void sleep(int hour) {
		// TODO Auto-generated method stub
		System.out.println("The human sleepling Hours : "+ hour);
		
	}
	public void jump() {

		System.out.println("jump method");
	}
	public void bite() {
		System.out.println("bite method");

	}
	public static void main(String[] args) {
		Human h=new  Human();
		h.eat("apple");
		h.sleep(5);
		h.jump();
		h.bite();
		System.out.println("*****************");
		Monkey m=new Monkey();
		m.jump();
		m.bite();
		
		
	}

	
	
}





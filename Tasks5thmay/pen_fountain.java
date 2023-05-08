package Tasks5thmay;

public class pen_fountain extends Pen{
	
	public void changeNib() {
	
	System.out.println("pen nib is change");	
	}

	@Override
	public void write() {
	System.out.println("write soming");
		
	}

	@Override
	public void refill() {
		System.out.println("we can refil the pen");
		
	}
	public static void main(String[] args) {
		pen_fountain pf=new pen_fountain();
		pf.write();
		pf.refill();
		pf.changeNib();
		
	}

}

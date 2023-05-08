package Tasks5thmay;

public  class SmartPhone extends Telephone {

	public void lift() {
		System.out.println("lift the call....");
	}
	@Override
	public void disconnected() {
		System.out.println("disconnect the call....");

	}


	public static void main(String[] args) {

		Telephone tobj = new SmartPhone();
		tobj.lift();
		tobj.disconnected();


	}

}


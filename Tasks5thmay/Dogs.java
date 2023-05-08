package Tasks5thmay;

public  class Dogs  extends Animals {
	
	public void cats() {
	}
	public void dogs() {
		
	System.out.println("Dogs bark");
	}
	
    public static void main(String[] args) {
    	
     Animals cat=new Cats();
     cat.cats();
         
     Animals dog = new Dogs();
     dog.dogs();
     }
    
		
		
}

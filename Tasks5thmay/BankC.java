package Tasks5thmay;

public class BankC  extends Bank{
     int bal=500;
	
	public void getBalance() {
		System.out.println("C bank balance is:"+bal);

	}
      public static void main(String[] args) {
    	 
    	  Bank aobj=new BankA();
  		  aobj.getBalance();
  		
  		  Bank bobj=new BankB();
		  bobj.getBalance();
		  
		  Bank Ba =new BankC();
    	  Ba.getBalance();
    	  
	}
}



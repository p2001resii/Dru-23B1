package Tasks4thmay;

public class Empolyee extends Office
{
	  void SecurityGuard()
	{
		System.out.println("security guard to employee:show me your Id");
	}
     public static void main(String[] args) {
    	 {
    		 Office A=new Boss();
    		 A.securityguard();
    		 Office obj=new Empolyee();
    		 obj.securityguard();
    	 }
     }
}
 
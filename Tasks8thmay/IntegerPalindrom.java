package Tasks8thmay;

public class IntegerPalindrom {
	public static void main(String[] args) {
		int n=121,temp=n,d,sum=0;
		while(n>0)
		{
			d=n%10;
			sum=(sum*10)+d;
			n=n/10;
		}
		if(temp==sum)
		{
		 System.out.println("it is palindrom");
		}
		 else 
			 System.out.println("is not a palindrom");
		}
	}


package Tasks3rdmay;

public class NamingRulesCheck 
{
	public static void main(String[] args)
	{
		
		
		String word ="java";  //VALID

		String Word = " comp";  //VALID

		String word@ = "java string";  //@symbol is not allowed  //invalid
		String word12 = "java string";   //VALID

		String 12word = "java string";     //invalid

		String int = "java";     //invalid

		String *java = "java";      //invalid

		String symbol$ = "100 dollars";   //VALID

		String word ="java";      //invalid      //duplicates not allowed

		String word = " comp";       //invalid

		String word_ ="java";      //VALID
		String word- ="java is here";    //invalid

		String capital; = "delhi”;      //invalid
		
	}
	

}

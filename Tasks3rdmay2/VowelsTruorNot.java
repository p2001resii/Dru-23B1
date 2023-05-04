package Tasks3rdmay2;

import java.util.Scanner;

public class VowelsTruorNot 
{
	 boolean isVowel(char character)
	    {
	        if(character == 'a'|| character == 'e'|| character == 'i'|| character == 'o'|| character == 'u')
	        return true;
	        else
	        {
	            return false;
	        }
	    }
	    public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a Character:");
	        char character=sc.next().charAt(0);
	        character =Character.toLowerCase(character);
	        VowelsTruorNot  p=new VowelsTruorNot ();
	       
	       System.out.println( p.isVowel(character));
	    }
	}


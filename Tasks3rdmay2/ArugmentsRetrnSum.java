package Tasks3rdmay2;

import java.util.Scanner;

public class ArugmentsRetrnSum 
{
    int getsum(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
         int a=sc.nextInt();
         System.out.print("Enter another number:");
         int b=sc.nextInt();
         ArugmentsRetrnSum  arg=new ArugmentsRetrnSum ();
         
         int result = arg.getsum(a, b);
         System.out.println(result);

          
    }
}
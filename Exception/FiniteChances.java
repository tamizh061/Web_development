package FundamentalJava.Exception;

import java.util.Scanner;

public class FiniteChances
{
    private   String Content="The throw keyword is used to create a custom error.Throw is followed by instance of exception Class.";
    public void Limited(int attempts)
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Which index of value you want-first index");
            int first=scan.nextInt();
            System.out.println("Which index of value you want-Last index");
            int last=scan.nextInt();
            System.out.println(Content.substring(first,last));
        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println(siobe+" please less then"+Content.length());
            if(attempts<10)
            {
                attempts++;
                System.out.println("Your chance is "+attempts);
                Limited(attempts);
            }
            else {
                System.out.println("your values is wrong,max attempts is over");
            }
        }
    }
    public static void main(String[] args)
    {
        FiniteChances chance=new FiniteChances();
        chance.Limited(1);

    }
}
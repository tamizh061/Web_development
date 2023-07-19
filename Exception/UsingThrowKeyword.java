package FundamentalJava.Exception;

public class UsingThrowKeyword
{
    public static void main(String[] args)
    {
        UsingThrowKeyword key=new UsingThrowKeyword();
        try
        {
            key.TrytoThrow();
        }
        catch(NullPointerException npe)
        {
            System.out.println("i got a second time -nullpointer exception");
        }


        try
        {
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
            throw new ArithmeticException();
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }

    public void TrytoThrow()
    {
        try
        {
            throw new NullPointerException();
        }
        catch(NullPointerException npe)
        {
            System.out.println("i got a null pointer exception first time");
            throw npe;
        }
    }
}
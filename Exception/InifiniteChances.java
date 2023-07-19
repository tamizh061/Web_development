package FundamentalJava.Exception;

import java.util.Scanner;

public class InifiniteChances
{
    public static void main(String[] args)
    {
        InifiniteChances infinite=new InifiniteChances();
        infinite.unlimited();
    }

    private  String myvalue="The throw keyword is used to create a custom error.Throw is followed by instance of exception Class.";

    public void unlimited()
    {
        Scanner scan=new Scanner(System.in);
        try
        {
            System.out.println("Which index of value you want-first index");
            int first=scan.nextInt();
            System.out.println("Which index of value you want-Last index");
            int last=scan.nextInt();
            System.out.println(myvalue.substring(first,last));
        }
        catch (StringIndexOutOfBoundsException siobe)
        {
            System.out.println("your stating value is 0 to endling value "+(myvalue.length()-1));
            System.out.println(siobe);
            unlimited();
        }
    }
}
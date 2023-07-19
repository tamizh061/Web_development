package FundamentalJava.constructor;
import java.util.Scanner;

public class DemoConstructor
{
    int myage;
    String myname;
    public DemoConstructor()//Constructor
    {
        System.out.println("welcome to my program");
    }
    public DemoConstructor(int myage,String myname)
    {
        this.myage=myage;
        this.myname=myname;
        System.out.println("my name "+myname+"\n my age "+myage);
    }

    public static void main(String[] args)
    {
        DemoConstructor demo=new DemoConstructor();//initialize an object

        Scanner scan=new Scanner(System.in);
        System.out.println("what is your age");
        int myage=scan.nextInt();
        System.out.println("what is your name");
        String myname=scan.next();
//        DemoConstructor demo1=new DemoConstructor(myage,myname);

        new DemoConstructor(myage,myname);
        new DemoConstructor(21,"Manojkumar");
    }

}

class Execution
{

}
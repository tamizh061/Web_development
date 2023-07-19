package FundamentalJava.Encapsulation;

public class SuperKeyword extends Example2
{
    int abnumber=100;
    String myuser="Mohanavel";

    public void exe()
    {
        System.out.println("my current class ab number is"+abnumber);
        System.out.println(" my sub class ab number  is "+super.abnumber);
        System.out.println("my sub class username is "+super.myuser);
        super.exe();//super class-Example2
//        exe();//main class-superkeyword
    }

    public static void main(String[] args) {
        SuperKeyword sup=new SuperKeyword();
        sup.exe();

    }
}


class Example2
{
    int abnumber=90;
    String myuser="Rohini";

    public void exe()
    {
        System.out.println(" my class name is Example2");
    }
}
package FundamentalJava.Variables;

import java.util.Scanner;

public class Staticvariable
{

    static double Balance=89000.0; //Static variable

    public void Execution()
    {
        System.out.println(Balance);
        System.out.println("Method is called");
        System.out.println(" in this balance called by user defined metho"+Balance);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);// scanner class object creation
        System.out.println("What is your account type");
        String type=scan.next();//Instance variable
        System.out.println("your account type is : "+type);
        System.out.println(Balance); //static variable is called an main method

        Staticvariable obj=new Staticvariable();

        obj.Execution();

        ExecutioOne();//this is static method ,so you dont need object

    }

    public static  void ExecutioOne()// this is static method
    {
        System.out.println("Thank You ");
    }

    static//static block
    {
        System.out.println("Welcome to Indian Bank");
    }
}
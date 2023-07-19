package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your age");
        int age =scan.nextInt();
        if(age>=18)//OuterBlock
        {
            System.out.println("you are eligible voter list");
            if(age>=24 && age<=27)//innerblock
            {
                System.out.println("your are eligible to marriage");
            }
            else {
                System.out.println("Your age is over limited");
            }


        }
        else
        {
            System.out.println("your age is below 18 ,so your are childish person");
        }

    }
}
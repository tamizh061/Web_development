package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class Ifelse
{
    public static void main(String[] args)
    {
        ifelsestatement("Manoj");
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your height");
        float height=scan.nextFloat();

        if(height>160)
        {
            System.out.println("Your are eligible to police category");
        }
        else
        {
            System.out.println("Your not eligible");
        }


    }

    public static void ifelsestatement(String username)
    {
        if("Manoj"==username)
        {
            System.out.println("My username is : "+username );
        }
        else {
            System.out.println("your username is false");
        }
    }
}
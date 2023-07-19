package FundamentalJava;

import java.util.Scanner;

public class DemoScannerClass
{
    public static void main(String[] args)
    {
//        long mobilno2=87654387967l;
        Scanner scans=new Scanner(System.in);//scanner class obeject creation
        System.out.println("What is your MobileNumber");
        long mobileno= scans.nextLong();//runtime memory allocated by long value-declared a variable

        System.out.println("your mobile no is :"+mobileno);
        System.out.println("what is your name ");
        String myfullname=scans.next();
        System.out.println("my mobile no is "+mobileno+"\n your full name is "+myfullname);

    }
}
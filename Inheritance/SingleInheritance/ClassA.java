package FundamentalJava.Inheritance.SingleInheritance;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA
{
    public void connect1()
    {
        System.out.println("Connecting a normal method");
    }
    public static void replacingInArray(Long[] EBBILL)
    {
        System.out.println("before updating an Eb bill statement"+ Arrays.toString(EBBILL));
        Scanner scan=new Scanner(System.in);
        System.out.println("which index of EB Bill value ");
        int index=scan.nextInt();
        System.out.println(EBBILL[index]+" in this no is your EB bill no,you edit this bill no,");
        Long newvalue=scan.nextLong();
        EBBILL[index]=newvalue;
        System.out.println("After updating an Eb bill statement"+ Arrays.toString(EBBILL));
    }

    public static void main(String[] args)
    {
        Long EbValue[]={837877378328l,3783782738787328l,32763876276378l,37928378938l};
        replacingInArray(EbValue);
    }
}
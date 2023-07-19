package FundamentalJava.Operator;

import java.util.Scanner;

public class ArithemeticOperatorAssignmentOperator
{
    //+,-,*,/,%

    static
    {
        System.out.println("Welcome to our class");
    }

    public static void main(String[] args)
    {
        System.out.println("Mark details");
        int tamilamrk=96;
        int englishmark=84;
        int mathsmark=92;
        int sciencemark=99;
        int socialmark=98;

        int mytotalmark=tamilamrk+englishmark+mathsmark+sciencemark+socialmark;

        System.out.println("My tamil mark :"+tamilamrk+"\nEnglish mark :"+englishmark+"\nMaths mark :"+mathsmark+"\nScience mark :"+sciencemark+"\nSocial mark :"+socialmark);
        System.out.println("My total 10th mark is ="+mytotalmark);
        String myName="Manojkumar";//compile declaration
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your father name :");
        String Fathername=scan.next();//runtime value declaration

        String Myfullname=myName+Fathername;
        System.out.println("My full name is "+Myfullname);

        int minusvalue=tamilamrk-sciencemark;
        int multivalue1=tamilamrk*minusvalue;
        System.out.println("myu minus value is :"+minusvalue);
        System.out.println("my multification value is :"+multivalue1);
        int a=10;
        a+=90;


        double mypricedeclaredby=89000.3;
        double myfriendpricedeclaredby=(mypricedeclaredby+=10000);
        System.out.println("my frind value is "+myfriendpricedeclaredby);
    }
}
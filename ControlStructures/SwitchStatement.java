package FundamentalJava.ControlStructures;

import java.util.Scanner;

public class SwitchStatement
{
    //    Scanner scan=new Scanner(System.in);
//    String statename=scan.next();
    public static void main(String[] args)
    {
        /*SwitchStatement switch1=new SwitchStatement();
        System.out.println("my statename: "+switch1.statename);*/

        Scanner scan=new Scanner(System.in);
        System.out.println("which programming languages you know");
        String languagename=scan.next();

        switch (languagename)
        {
            case "Java": {
                System.out.println("i know java languages");
                break;
            }
            case "Python":
                System.out.println("i know python languages");
                break;
            case "Rprogram":
                System.out.println("i know Rprogramming languages");
                break;
            default:
                System.out.println("you are not eligible for IT field,.....?");


        }


    }
}
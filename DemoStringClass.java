package FundamentalJava;

import java.util.Scanner;

public class DemoStringClass
{
    public static void main(String[] args)
    {

        DemoStringClass cls=new DemoStringClass();

        String user1="Rohini123";
        String user2="Mohanavel123"; //Literal

        String user3=new String("Manojkumar");//Non-Literal
//        System.out.println(user3);
////        System.out.println(user3.concat("Madherswaran"));//Manojkumar.concat("Madheswaran")
//        user3=user3.concat("Madheswaran");
//        System.out.println(user3);
//        System.out.println(user3);

        System.out.println(user1.charAt(3));
        System.out.println(user2.contains("vel1"));//true
        System.out.println(user1.equals("rohini123"));//false
        System.out.println(user1.equalsIgnoreCase("rohini123"));//true
        String user4="rohini123";
        System.out.println(user1.compareTo(user4));
        System.out.println(user1.compareToIgnoreCase(user4));

        String sentence="    i am manojkumar from namakkal    ";
        System.out.println(sentence);
        String sentence1=sentence.trim();
        System.out.println(sentence1);

        String a="";

        System.out.println(sentence1.isEmpty());
        System.out.println(user2.replace("Mohanavel123","Shanmugavel123"));
        System.out.println(user2);
        System.out.println(sentence1.substring(3));
        System.out.println(sentence1.substring(3,10));
    }
}
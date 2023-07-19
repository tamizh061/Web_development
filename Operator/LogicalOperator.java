package FundamentalJava.Operator;

import java.util.Scanner;

public class LogicalOperator
{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {
        LogicalOperator logic=new LogicalOperator();
        logic.logical();
    }

    public void logical()
    {
        int alphavalue=90;
        int cosmovalue=99;
        char initial='M';
        char bloodgroup='B';
//                          90<=99 &&  M!=B    =T && F =True
        System.out.println((alphavalue<=cosmovalue)&&(initial==bloodgroup)); //And operator --two condition are true youe value is tru
        System.out.println((alphavalue==cosmovalue)||(initial!=bloodgroup)); //Or Operator- any ine condition is true your output value is tru
        System.out.println(!(initial==bloodgroup));//not operator-opposite reaction of your value
    }

}
package FundamentalJava.Operator;

import java.util.Scanner;

public class RelationalOperator
{
    static  Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {
        Detailsofrelational();
//        down performance values are >,<,>=,<=
        float mysinvalue=56.6f;
        float mytanvalue=90.3f;
        float myccosvalue=90.3f;

        System.out.println(mysinvalue>mytanvalue);//56.6>90.3//false
        System.out.println(mysinvalue<mytanvalue);//56.6<90.3//true
        System.out.println(myccosvalue>=mytanvalue);//90.3>=90.3//true
        System.out.println(myccosvalue>=mytanvalue);//90.3<=90.3//true

    }

    public static void Detailsofrelational()
    {
//        System.out.println("what is your statename");
//        String statename=scan.next();
        String myfrdstatename="Tamilnadu";
        String myCrushstatename="Tamilnadu";

        System.out.println(myfrdstatename==myCrushstatename);//equal to operator
        System.out.println(myfrdstatename!=myCrushstatename);//not equal to operator


    }
}
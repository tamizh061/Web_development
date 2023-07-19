package FundamentalJava;

public class DemoTypeCasting
{
    public static void main(String[] args)
    {
//        float os=4.5f;
//        long os1=(long)os;
//        float os=3.4f;
//        smaller to largest datatype is converting-widening
        int delta=90+67;
        System.out.println("delta value is "+delta);
        float cosma=delta;
        System.out.println("integer value is converted by float value "+ cosma);
//        largest datatype to smallest datatype converting-narrowing
        double myheight=170.6;
        long heightvalue=(long)myheight;
        long myaadhar=98765786587876l;
        System.out.println("my original height is "+myheight+" converting value is :"+heightvalue);
        int calculation=(int)heightvalue+delta;//
        System.out.println("converting a narrowing format using double datats"+calculation);

        char myinitial='3';
        int convertinginitialbyno=myinitial;
        System.out.println(convertinginitialbyno);

        char floatvalue=(char) cosma;
        System.out.println(" my pointer value charcter is :"+floatvalue);

    }
}
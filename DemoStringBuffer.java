package FundamentalJava;

public class DemoStringBuffer
{
    public static void main(String[] args)
    {
        String AccountHolder="Manojkumar Madheswaran";

        StringBuilder Sbuilder=new StringBuilder("Mohanavel");

        StringBuffer SBuffer=new StringBuffer("Rohini");
        SBuffer.append("HariShankar");//RohiniHarishankar
        System.out.println(SBuffer);

        SBuffer.insert(6,"Rithish");//RohiniRithishHarishankar
        System.out.println(SBuffer);

        System.out.println(SBuffer.reverse());//raknahSiraHhsihtiRinihoR

        System.out.println(SBuffer.reverse());//RohiniRithishHarishankar

        SBuffer.delete(6,13);
        System.out.println(SBuffer);


    }
}
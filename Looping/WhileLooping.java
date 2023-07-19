package FundamentalJava.Looping;

public class WhileLooping
{
    public static void main(String[] args) {
        int Mydatavalue = 1;
        int calculation = 0;
        while (Mydatavalue <=10)
        {
            calculation = calculation + Mydatavalue;
            Mydatavalue++;
            System.out.println("my sum of value :" + calculation);
        }


    }
}
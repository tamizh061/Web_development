package FundamentalJava.ControlStructures;

public class ElseIfStatement
{
    public static void main(String[] args)
    {
        int tamilmark=96;
        int englishmark=84;
        int mathsmark=92;
        int sciencemark=99;
        int socialmark=98;

        int mytotalmark=477;

        if(mytotalmark>480)
        {
            System.out.println("Your eligible to any category of group you are choose");
        }
        else if ((mathsmark>80)&&(socialmark>80 && sciencemark>80))
        {
            System.out.println("Your are eligible to maths biology group");
        }
        else if (mytotalmark>320)
        {
            System.out.println("your are choose only arts category groups");
        }
        else
        {
            System.out.println("Your are not eligible for 11th standard");
        }

    }

}
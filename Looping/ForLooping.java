package FundamentalJava.Looping;

import java.util.Scanner;

public class ForLooping
{
    public void Loopingtypeone(int limitofspeed)
    {
        if(limitofspeed>=80)
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("your bike  super model no :"+i);
            }
            System.out.println("your speedlimit is 80");
        }

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("what is your bike speed limit");

        int speedlimit=scan.nextInt();

        ForLooping loop=new ForLooping();
        loop.Loopingtypeone(speedlimit);
    }
}
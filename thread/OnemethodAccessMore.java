package FundamentalJava.Thread;

import java.util.Scanner;

public class OnemethodAccessMore
{
    public static void main(String[] args)
    {
        Mythreadclass my=new Mythreadclass();
        Thread th=new Thread(my,"Manojkumar");
        Thread th1=new Thread(my,"Mohanavel");
        Thread th2=new Thread(my,"Tamilarasan");
        th2.setPriority(10);
        th1.setPriority(6);

        th.start();
        th1.start();
        th2.start();
    }
}


class Mythreadclass implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());//min=1,max=10,Default=5
        System.out.println(Thread.currentThread().getId());
        searching();
    }

    public void searching()
    {
        double[] monthwificharge={240,501.50,1000,1500,1200.75};
        Scanner scan=new Scanner(System.in);
        System.out.println("which category you want (monthly wifi charge)");
        double userexpectation=scan.nextDouble();
        for(int pos=0;pos<monthwificharge.length;pos++)
        {
            if(userexpectation==monthwificharge[pos])
            {
                System.out.println("your expectation value is "+userexpectation+" currently avilable in Jio/vodafone/airtel -type of position is"+pos);
                return;
            }
        }
    }
}
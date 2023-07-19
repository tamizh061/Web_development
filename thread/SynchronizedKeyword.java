package FundamentalJava.thread;
public class SynchronizedKeyword
{
    public static void main(String[] args) throws InterruptedException {
        Execution execution= new Execution();

        Thread th=new Thread()
        {
            public void run()
            {
                execution.Tables(3);
            }
        };

        Thread th1=new Thread()
        {
            public void run()
            {
                execution.Tables(6);
            }
        };

        th.start();
//        th.join();
        th1.start();
    }
}

class Execution
{
    synchronized public void Tables(int add)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+"X"+add+"="+(add*i));//1X5=5
            try
            {
                Thread.sleep(2000);
            }
            catch (InterruptedException IE)
            {

            }
        }
    }
}
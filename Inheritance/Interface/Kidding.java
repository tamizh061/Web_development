package FundamentalJava.Inheritance.Interface;
public interface Kidding extends  Sleepable
{
    public void DemoKidding(); //no implements

    public static void main(String[] args)
    {
        Kidding ok=new Kidding()
        {
            public void DemoKidding()
            {
                 System.out.println("ji");
            }
            public void DemoSleep(){ }
        };
        ok.DemoKidding();
    }
}

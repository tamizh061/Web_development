package FundamentalJava.Variables;

public class LocalVariable
{
    public static void main(String[] args)
    {
        int a=10;//instance variable
        //object creation
//        classname objname=new classname();
        LocalVariable obj1=new LocalVariable();//accessed by local variable or user defined method
        obj1.localvariable();//calling a method
        obj1.lcv1();
    }

    public void localvariable()
    {
        String AccoundHolder="Manojkumar";//local variable
        System.out.println("My indian bank name is :"+AccoundHolder);
    }

    public void lcv1()
    {
        double Balane=89000.0;
        System.out.println("your bank balance is :"+Balane);
    }
}

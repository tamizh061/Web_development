package FundamentalJava.Polymorphism;

public class DemoOverriding3 extends  DemoOverriding2
{
    //    upcasting=object created by parent class ,referenced by child class.
    public int Calculation(int AValue,int Bvalue)
    {
        int divition=AValue*Bvalue;
        return divition;
    }
    public int Calculation(float Avalue,int Bvalue)
    {
        int ConvertAvalue=(int)Avalue;//using narrowing typecasting

        int divition=ConvertAvalue/Bvalue;
        return divition;
    }
    public String Connection()
    {
        return "Manojkumar";
    }
    public static void main(String[] args)
    {
        //class name referencevariable name= new keewword  classname(this or another class name)
        DemoOverRiding1 ride=new DemoOverriding2();//upcasting
        System.out.println(ride.Calculation(35,10));//350
        DemoOverRiding1 ride1=new DemoOverriding3();
        System.out.println(ride1.Calculation(10,10));//100
        DemoOverRiding1 ride2=new DemoOverriding3();
        System.out.println(ride2.Calculation(30,11));
    }
}
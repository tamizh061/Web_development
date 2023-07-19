package FundamentalJava.Polymorphism;

public class DemoOverriding2 extends DemoOverRiding1
{
    public int Calculation(int AValue,int Bvalue)
    {
        int Multiple=AValue*Bvalue;
        return Multiple;
    }
    public int Calculation(float Avalue,int Bvalue)
    {
        int ConvertAvalue=(int)Avalue;//using narrowing typecasting
        int divition=ConvertAvalue/Bvalue;
        return divition;
    }

    public String Connection()
    {
        return "HariShankar";
    }


    }
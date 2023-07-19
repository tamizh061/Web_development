package FundamentalJava.Polymorphism;

public class DemoOverRiding1
{
    //    withoutreturnkeyword
    public int Calculation(int AValue,int Bvalue)
    {
        int Addition=AValue+Bvalue;
        return Addition;
    }
    public int Calculation(float Avalue,int Bvalue)
    {
        int ConvertAvalue=(int)Avalue;//using narrowing typecasting
        int substraction=ConvertAvalue-Bvalue;
        return substraction;
    }
    public String Connection()
    {
        return "Rohini";
    }
}
package FundamentalJava.Polymorphism;

public class DemoOverloading
{
    //    Compile Time Polumorphism-Method OverLoading
//    Same class,Same Method Name,Different Parameter or aruguments
    public static void main(String[] args)
    {
        DemoOverloading loading=new DemoOverloading();
        loading.Calculation(15,56);
        loading.Calculation('o');

    }

    public void Calculation(int a,int b)
    {
        System.out.println("Addition of two numbers with using typecasting");
        float ab=8.9f;
        int newprocess=(int)ab+a+b;
        System.out.println("my addition method value is "+newprocess);
    }
    public void Calculation(String myname,String mycrushname)
    {
        System.out.println("Addition of two numbers with using typecasting");
    }
    public void Calculation(Float CGPA,int Convertint)
    {
        System.out.println("Addition of two numbers with using typecasting");
    }
    public void Calculation(char section)
    {
        int change=section;
        System.out.println(section+" in this charcter asci value is "+change);
    }

}
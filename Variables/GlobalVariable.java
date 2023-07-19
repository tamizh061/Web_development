package FundamentalJava.Variables;

public class GlobalVariable
{


    public static void main(String[] args)
    {
        String waterbottlebrand="JOIL";//Instance variable
        System.out.println(waterbottlebrand);
        GlobalVariable obj=new GlobalVariable();//object is created done
        obj.CallGlobal();

    }
    public void CallGlobal()
    {
        System.out.println("Welcome to Global variable");
        System.out.println(Myweight);//Global Variable
        int watterbottlecount=10;//local variable
        System.out.println(watterbottlecount+" is my count of water bottle");

    }
    public void okok()
    {
        System.out.println(Myweight);
    }
    Float Myweight=59.8f;
}
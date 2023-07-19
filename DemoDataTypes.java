package FundamentalJava;

public class DemoDataTypes
{
    public static void main(String[] args)
    {
        System.out.println("Data Types...!");
//      datatype     variablename=value;
        short       FourdigitOTP=5858;
        System.out.println("MY Short value is :"+FourdigitOTP);

        int RegisterNo=1324017;

        System.out.println(RegisterNo + " in this no is 10th Registration Number");

        System.out.println("my registration no is :"+RegisterNo + "\n What is your OTP no :" +FourdigitOTP);

        long MobileNo=9789355930l;

        System.out.println("my Mobile no is : "+MobileNo);

        float CGPA=8.8f;
        double percentage=88;//output is 88.0
        String username="Maddy Mano 434";
        char myclass='C';

        System.out.println("my username is ...? - "+username +" my class is :"+myclass+" your tenth CGPA is :"+CGPA+" Your College percenatge is "+percentage);
    }
}
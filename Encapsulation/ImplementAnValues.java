package FundamentalJava.Encapsulation;

public class ImplementAnValues
{
    public static void main(String[] args)
    {
        DeclaredVariables variable=new DeclaredVariables();
        variable.setAccountName("tamil");
        variable.setAccountBalance(28000);
        variable.setAccountNumber(7397367468736l);

        System.out.println("my account name is "+variable.getAccountName());
        System.out.println("my account no is :"+variable.getAccountNumber()+"\n my account balance"+variable.getAccountBalance());
    }
}
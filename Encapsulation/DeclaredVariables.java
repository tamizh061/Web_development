package FundamentalJava.Encapsulation;

public class DeclaredVariables
{
    private String AccountName;
    private int accountBalance;
    private Long AccountNumber;

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String accountName) {
        AccountName = accountName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    public int setAccountBalance(int accountBalance)
    {
       return this.accountBalance = accountBalance;
    }

    public Long getAccountNumber()
    {
        return AccountNumber;
    }
    public void setAccountNumber(Long accountNumber)
    {
        AccountNumber = accountNumber;
    }
}
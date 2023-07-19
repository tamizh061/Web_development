package FundamentalJava.ConsoleApplication;

import java.io.IOException;

public interface ZealousCustomerDetailsPerforamance
{
    public String addcustomerdetail(ZealousCustomerDetails zealous) throws ZealousException, IOException, ClassNotFoundException;

    public  void listallcostomerdetails();//no implement methods

    public String updatecustomerdetail(String Studentname);//no implements

    public String deletecustomerdetail(String Studentname);

    public void sortingcustomerdetail();

    public String Searchcustomerdetails(String stduentname);
}
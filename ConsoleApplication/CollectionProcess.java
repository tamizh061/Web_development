package FundamentalJava.ConsoleApplication;

import java.util.*;

public class CollectionProcess implements ZealousCustomerDetailsPerforamance,Runnable
{
    ArrayList<ZealousCustomerDetails> zealous=new ArrayList<ZealousCustomerDetails>();

    public  CollectionProcess()
    {
        zealous.add(new ZealousCustomerDetails("Aarthi",1.00,8978355930l,"JavScript Stack",28000.0f,"Manoj"));
        zealous.add(new ZealousCustomerDetails("Pavitha",2.30,9767355930l,"Python Stack",25000.0f,"Annamalai"));
        zealous.add(new ZealousCustomerDetails("Manojkumar",2.00,9789355930l,"Java Stack",30000.0f,"Razak"));
    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous1)
    {
        zealous.add(zealous1);
        return zealous1.getStudentName()+" has been added successfully";
    }
    @Override
    public void listallcostomerdetails()
    {
        Iterator it= zealous.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    @Override
    public String updatecustomerdetail(String Studentname)
    {
        try
        {
            Scanner scan=new Scanner(System.in);
                   for(int i=0;i< zealous.size();i++)
            {
                if(zealous.get(i).getStudentName().equalsIgnoreCase(Studentname))
                {
                    System.out.println("Please tell us which field you want Update");
                    String Whatfield=scan.next();
                    switch (Whatfield)
                    {
                        case "studentname":
                            System.out.println("your are choosen student name \n please tell us new value you are replaced");
                            String newvalue=scan.next();
                            zealous.get(i).setStudentName(newvalue);
                            System.out.println(Studentname+" has student updated ");
                            break;
                        case "Hours":
                            System.out.println("you choosen hours value\n please tell us updated hours value");
                            double newvalue1=scan.nextDouble();
                            zealous.get(i).setHours(newvalue1);
                            break;
                        default:
                            throw new ZealousException();
                    }

                }

            }
        }
        catch (ZealousException Ze)
        {
            Scanner scan=new Scanner(System.in);
            System.out.println(Ze+"Keyword to update not matched ,please select any below");
            System.out.println("keyword /referenced  to update should be  studentname/Hours/studentmobileno/price");
            for(ZealousCustomerDetails zea:zealous)
            {
                System.out.println(zea.getStudentName());
            }
            updatecustomerdetail(scan.next());
        }
        return Studentname+"has been updated successfully";
    }

    @Override
    public String deletecustomerdetail(String Studentname)
    {
        for(int i=0;i< zealous.size();i++)
        {
            if(zealous.get(i).getStudentName().equalsIgnoreCase(Studentname))
            {
                zealous.remove(zealous.get(i));
                System.out.println(Studentname+" has been deleted in successfully");
            }
        }
        return Studentname;
    }

    @Override
    public void sortingcustomerdetail()
    {
        Collections.sort(zealous);
    }

    @Override
    public String Searchcustomerdetails(String stduentname) {
        return null;
    }

    @Override
    synchronized public void run()
    {
        System.out.println("Welcome to Zealous "+Thread.currentThread().getName());
        CollectionProcess execution=new CollectionProcess();
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("which process you want work this" + "\n1.AddnewStudentdetails\n2.Listallstudentdetails\n3.updatestudentdetails\n4.deletecustomerdetail\n5.sortingstudentdetails\n6.searchanstduentname");
            int usage = scan.nextInt();
            switch (usage) {
                case 1:
                    System.out.println("adding new student details" + "\nStudentname\tHours\tStudentMobileno\tCoursedetail\tprice\tInchangeName");
                    ZealousCustomerDetails customer1 = new ZealousCustomerDetails(scan.next(), scan.nextDouble(), scan.nextLong(), scan.next(), scan.nextFloat(), scan.next());
                    execution.addcustomerdetail(customer1);
                    break;
                case 2:
                    System.out.println("List all you values ");
                    execution.listallcostomerdetails();
                    break;
                case 3:
                    System.out.println("Which type of studentname details you are updated");
                    String updatenames = scan.next();
                    System.out.println(execution.updatecustomerdetail(updatenames));
                    break;
                case 4:
                    System.out.println("Which name of array you delete in your object");
                    String name = scan.next();
                    execution.deletecustomerdetail(name);
                    break;
                case 5:
                    execution.sortingcustomerdetail();
                    execution.listallcostomerdetails();
                    break;
                case 6:
                    System.out.println("which studnetname details you are seraching..");
                    String studentname = scan.next();
                    execution.Searchcustomerdetails(studentname);

                default:
                    return;
            }
        }while (true);
    }
}
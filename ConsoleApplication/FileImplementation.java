package FundamentalJava.ConsoleApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FileImplementation implements ZealousCustomerDetailsPerforamance ,Runnable
{
    File myfile=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\FundamentalJava\\ConsoleApplication\\Myzealousfile.doc");
//  ArrayList<ZealousCustomerDetails>studentdetails=new ArrayList<ZealousCustomerDetails>();
    ArrayList<ZealousCustomerDetails> studentdetails=null;


    public FileImplementation()  {
        System.out.println("Welcome to Files");
        studentdetails=new ArrayList<ZealousCustomerDetails>();
    }
    public void writing() throws IOException
    {
        FileOutputStream fos=new FileOutputStream(myfile);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(studentdetails);
        oos.close();
        fos.close();
    }
    public void reading() throws IOException,ClassNotFoundException
    {
        FileInputStream fis=new FileInputStream(myfile);
        ObjectInputStream ois=new ObjectInputStream(fis);
        studentdetails= (ArrayList<ZealousCustomerDetails>)ois.readObject();
        ois.close();
        fis.close();
    }
    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous) throws ZealousException
    {
        try {
            reading();
            studentdetails.add(zealous);
            writing();
        }
        catch (EOFException eofException)
        {
            System.out.println(eofException);
            studentdetails.add(zealous);
            try {
                writing();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return zealous.getStudentName()+" has been added successfully";
    }

    @Override
    public void listallcostomerdetails()
    {
        try {
            reading();
            Iterator<ZealousCustomerDetails> it= studentdetails.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String updatecustomerdetail(String Studentname) {
        return null;
    }

    @Override
    public String deletecustomerdetail(String Studentname) {
        return null;
    }

    @Override
    public void sortingcustomerdetail() {

    }

    @Override
    public String Searchcustomerdetails(String stduentname) {
        return null;
    }

    synchronized public void run()
    {
        System.out.println("Welcome to Zealous "+Thread.currentThread().getName());
        FileImplementation execution=new FileImplementation();
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("which process you want work this" + "\n1.AddnewStudentdetails\n2.Listallstudentdetails\n3.updatestudentdetails\n4.deletecustomerdetail\n5.sortingstudentdetails\n6.searchanstduentname");
            int usage = scan.nextInt();
            switch (usage) {
                case 1:
                    System.out.println("adding new student details" + "\nStudentname\tHours\tStudentMobileno\tCoursedetail\tprice\tInchangeName");
                    ZealousCustomerDetails customer1 = new ZealousCustomerDetails(scan.next(), scan.nextDouble(), scan.nextLong(), scan.next(), scan.nextFloat(), scan.next());
                    try {
                        System.out.println(execution.addcustomerdetail(customer1));
                    } catch (ZealousException e) {
                        throw new RuntimeException(e);
                    }
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
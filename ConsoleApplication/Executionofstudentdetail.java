package FundamentalJava.ConsoleApplication;

import java.util.Scanner;

public class Executionofstudentdetail  implements ZealousCustomerDetailsPerforamance,Runnable {

    synchronized public void run() {
        System.out.println("Welcome to Zealous " + Thread.currentThread().getName());
        Executionofstudentdetail execution = new Executionofstudentdetail();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Zealous Academy");
        System.out.println("which process you want work this"+"\n 1.AddnewStudentdetails\n2.Listallstudentdetails\n3.updatestudentdetails\n4.deletecustomerdetail\n5.sortingstudentdetails\n6.searchanstduentname");
        int usage = scan.nextInt();
        switch (usage) {
            case 1:
                System.out.println("adding new student details" + "\nStudentname\tHours\tStudentMobileno\tCoursedetail\tprice\tInchangeName");
                ZealousCustomerDetails customer1 = new ZealousCustomerDetails(scan.next(), scan.nextDouble(), scan.nextLong(), scan.next(), scan.nextFloat(), scan.next());
                System.out.println(execution.addcustomerdetail(customer1));
                break;
            case 2:
                System.out.println("List all you values ");
                execution.listallcostomerdetails();
                break;
            case 3:
                System.out.println("Which type of studentname details you are updated");
                execution.listallcostomerdetails();
                String updatenames = scan.next();
                execution.updatecustomerdetail(updatenames);
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
    }

    ZealousCustomerDetails[] studentdetails = new ZealousCustomerDetails[2];
//        {
//            System.out.println(studentdetails[i]);
//        }ZealousCustomerDetails[10];//Array Declaration

    public Executionofstudentdetail()//Default constuctor
    {
        studentdetails[0] = new ZealousCustomerDetails("Manojkumar", 1.30, 9789355930l, "Java Full Stack developer", 28000.0f, "Razak");
        studentdetails[1] = new ZealousCustomerDetails("Saipavi", 1.00, 782798788722l, "Python Stack dveeloper", 20000.0f, "Razak");
    }

    @Override
    public String addcustomerdetail(ZealousCustomerDetails zealous) {
        Scanner scan = new Scanner(System.in);
        try {
            for (int pos = 0; pos < studentdetails.length; pos++) {
                if (studentdetails[pos] == null) {
                    studentdetails[pos] = zealous;
                    return zealous.getStudentName() + " has been added in our studentdetails";
                }
            }
            throw new ZealousException();//user defined exception
        } catch (ZealousException ze) {
            System.out.println(ze + " my memory is full,so any one value you deleted that time added a new values");
            for (ZealousCustomerDetails zea : studentdetails) {
                System.out.println(zea.getStudentName());
            }
            System.out.println("which name you want delete");
            String studname = scan.next();
            deletecustomerdetail(studname);//delete a one value
            addcustomerdetail(zealous);
        }
        return zealous.getStudentName() + " has  been added -successfully";
    }

    @Override
    public void listallcostomerdetails() {
        for (ZealousCustomerDetails customers : studentdetails) {
            System.out.println(customers);
        }

    }

    @Override
    public String updatecustomerdetail(String Studentname) {
        Scanner scan = new Scanner(System.in);

        for (int index = 0; index < studentdetails.length; index++) {
            if (studentdetails[index].getStudentName().equalsIgnoreCase(Studentname)) {
                System.out.println(studentdetails[index]);
                System.out.println("which field data you want update");
                String usage = scan.next();
                switch (usage) {
                    case "studentname":
                        System.out.println("your are choosen student name \n please tell us new value you are replaced");
                        String newvalue = scan.next();
                        studentdetails[index].setStudentName(newvalue);
                        return null;
                    case "Hours":
                        System.out.println("you choosen hours value\n please tell us updated hours value");
                        double newvalue1 = scan.nextDouble();
                        studentdetails[index].setHours(newvalue1);
                        return studentdetails[index].getStudentName() + " has updated";
                    case "StudentMobileno":
                        System.out.println("you choosen student mobile number tell us update mobile number");
                        Long mno=scan.nextLong();
                        studentdetails[index].setStudentMobileno(mno);
                        System.out.println( studentdetails[index].getStudentMobileno()+"has updated");
                }
            }
        }
        return Studentname;
    }

    @Override
    public String deletecustomerdetail(String Studentname) {
        for (int index = 0; index < studentdetails.length; index++) {
            if (studentdetails[index].getStudentName().equalsIgnoreCase(Studentname)) {
                studentdetails[index] = null;
                System.out.println(Studentname + " has been deleted successfully");
                break;
            }
        }
        return Studentname + " has not been deleted";
    }

    @Override
    public void sortingcustomerdetail() {
        Scanner scan = new Scanner(System.in);
        ZealousCustomerDetails csdetails = null;
        System.out.println("which field values you are sorting");
        String fieldname = scan.next();
        for (int i = 0; i < studentdetails.length; i++) {
            for (int j = i + 1; j < studentdetails.length; j++) {
                if (fieldname.equalsIgnoreCase("studentname")) {
                    if (studentdetails[i].getStudentName().compareTo(studentdetails[j].getStudentName()) > 0) {
                        csdetails = studentdetails[i];
                        studentdetails[i] = studentdetails[j];
                        studentdetails[j] = csdetails;
                    }
                } else if (fieldname.equalsIgnoreCase("StudentMobileno")) {
                    if (studentdetails[i].getStudentMobileno() > studentdetails[j].getStudentMobileno()) {
                        csdetails = studentdetails[i];
                        studentdetails[i] = studentdetails[j];
                        studentdetails[j] = csdetails;
                    }
                }
            }
        }

    }

    @Override
    public String Searchcustomerdetails(String stduentname) {
        for (int i = 0; i < studentdetails.length; i++) {
            if (studentdetails[i].getStudentName().equalsIgnoreCase(stduentname)) {
                System.out.println(studentdetails[i]);
                break;
            }
        }
        return stduentname;
    }
}


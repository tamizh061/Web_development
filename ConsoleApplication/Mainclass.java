package FundamentalJava.ConsoleApplication;

import java.io.IOException;

public class Mainclass
{
    public static void main(String[] args) throws IOException {
//   Executionofstudentdetail execute=new Executionofstudentdetail();
   //     CollectionProcess execute=new CollectionProcess();
      FileImplementation execute=new FileImplementation();

        Thread th1=new Thread(execute,"Manojkumar");
        Thread th2=new Thread(execute,"Tamil");
        Thread th4=new Thread(execute,"Mohanavel");
        Thread th3=new Thread(execute,"Rohini");


        th1.start();
        th2.start();
        th3.start();
        th4.start();


    }
}
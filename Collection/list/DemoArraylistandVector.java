package FundamentalJava.Collection.list;

import java.util.ArrayList;
import java.util.Vector;

public class DemoArraylistandVector
{
    public static void main(String[] args)
    {
        Vector phase1=new Vector();
        phase1.add("Manojkumar");
        phase1.add(22);
        phase1.add('M');
        phase1.add(5.6);
        phase1.add(true);//add last
        phase1.add("tamilarasan");
        phase1.add("Thoppur");
        phase1.add("Mohanavel");
        phase1.add("Veerapandi");


        ArrayList phase2=new ArrayList();
        phase2.addAll(phase1);
        phase2.add("Rasipuram");
        phase2.add("Annamalai");
        phase2.add(978937878373l);
        phase2.add(83.4);
        phase2.set(2,"Elachipalayam");
     //   phase2.remove("Elachipalayam");//remove a object

        System.out.println(phase2.indexOf("Annamalai"));//get a index no
        System.out.println(phase2.get(10));//get a value
        System.out.println("my vector values :\t"+phase1);
        System.out.println("my arraylist values :\t"+phase2);

      //  phase1.removeAll(phase2);//delete a original values
        phase1.retainAll(phase2);//delete a different values
      //  System.out.println("my arraylist values :\t"+phase2);
        System.out.println("my vector values :\t"+phase1);




    }
}
package FundamentalJava.Collection.set;

import lombok.AllArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demosets
{
    public static void main(String[] args)
    {
//        treeset is maintained order
        TreeSet<Studentdetails> object=new TreeSet<Studentdetails>();

        object.add(new Studentdetails("Mohanavel","Civil",2021,80.0));
        Studentdetails stud1=new Studentdetails("Tamil","CSE",2021,98.8);
        Studentdetails stud2=new Studentdetails("Apsheya","Fashion Tech",2014,88.9);
        object.add(stud1);
        object.add(stud2);

        Iterator it=object.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

//        System.out.println(object);

//        HashSet<Character> set1=new HashSet<Character>();
//
//        set1.add('M');
//        set1.add('A');
//        set1.add('O');
//        set1.add('J');
//        set1.add('K');
//        set1.add('U');
//        set1.add('M');
//        set1.add('A');
//        set1.add('R');
//
//        TreeSet<Character> set2=new TreeSet<Character>();
//
//        set2.addAll(set1);
//        System.out.println(set1);
    }
}

@AllArgsConstructor
class Studentdetails implements Comparable<Studentdetails>
{
    String studname;
    String studdepartment;
    int studpassedyear;
    double studpercentage;
    @Override
    public String toString() {
        return "Studentdetails{" +
                "studname='" + studname + '\'' +
                ", studdepartment='" + studdepartment + '\'' +
                ", studpassedyear=" + studpassedyear +
                ", studpercentage=" + studpercentage +
                '}';
    }
    @Override
    public int compareTo(Studentdetails o) {
        return this.studname.compareTo(o.studname);
    }
}
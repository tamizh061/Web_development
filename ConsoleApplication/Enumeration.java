package FundamentalJava.ConsoleApplication;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Enumeration
{
    public static void main(String[] args)
    {
        List<String> obj=new LinkedList<String>();

        // creating object of Vector<String>
        Vector<String> v = new Vector<String>();

        // Adding element to Vector v
        v.add("A");
        v.add("B");
        v.add("C");
        v.add("D");
        v.add("E");

        // printing the list
        System.out.println("Current list : " + obj);

        // creating Enumeration
        java.util.Enumeration e = v.elements();

        // getting arrlist of specified Enumeration
        // using list() method
        obj = Collections.list(e);

        // printing the arrlist
        System.out.println("Returned list: " + obj);
    }
}
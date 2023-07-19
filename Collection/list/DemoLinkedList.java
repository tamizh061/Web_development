package FundamentalJava.Collection.list;
import java.util.LinkedList;

public class DemoLinkedList
{
    public static void main(String[] args)
    {
        LinkedList list=new LinkedList();//generic
        LinkedList<Integer> list1=new LinkedList<Integer>();//non-generic
        list.add("Manojkumar");
        list.add(22);
        list.add('M');
        list.add(5.6);
        list.add(true);//add last
        list.add(null);
        list.addFirst("M");//add first
        list.add(2,"Mohanavel");//add with index
        list.remove("Manojkumar");//delete with object
        list.remove(0);//delete with index
        list.set(3,6.5);//update
        list.add("Mohanavel");//duplicate value also allowed
        System.out.println("my first index value is "+ list.getFirst());//getting a value with index
        System.out.println(list.contains(5.6));//boolean value get a output
        System.out.println("my linked list values"+list);
        list.clear();//delete a all values
        System.out.println("my linked list values"+list);
//        System.out.println(list);
//        list1.add(23);
//        list1.add(22);


        /* add-add a value
           addfirst-adding first index place;
           addlast-adding last index place
           add(index,object)-adding index wise value
           remove(index)-removing index wise
           remove(object)-removing object wise
           set(index,object)-updating index wise setting object
           getfirst-getting 1st object;
           getlast-getting last object;
           contains(object)-this for check perticular value are be or not been.returns boolean value
           clear()-delete a all values



         */


    }
}
package FundamentalJava.Collection.list;

import java.util.Stack;

public class DemoStack
{
    public static void main(String[] args)
    {
        Stack<String> lifo=new Stack<String>();//non-generic

        lifo.push("blue");//add a new value
        lifo.push("white");
        lifo.push("Black");
        lifo.push("Green");
        lifo.push("Gray");
        lifo.push("Maroon");
        lifo.push("Violet");
        lifo.push("Seagreen");
        lifo.pop();//delete a last element
        System.out.println("top of the element"+lifo.peek());//get a top eleement
        System.out.println("search a 5 index"+lifo.search("Black"));//last to first(not mention by index)
        System.out.println(lifo.empty());//boolean
        System.out.println(lifo);
    }
}

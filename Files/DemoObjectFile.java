package FundamentalJava.Files;

import java.io.*;

public class DemoObjectFile
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\mycodes\\FundamentalJava\\demofiles\\file.txt");

        file.createNewFile();


        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        GroceryItem product1=(GroceryItem)ois.readObject();
      ///  GroceryItem product1=(GroceryItem) ois.readObject();
        System.out.println("you are need product name is "+product1.ProductName+"\n Product Quntity"+product1.ProductQuantity+"\n Price of 2 litre milk"+product1.ProductPrice);
        ois.close();
        fis.close();
//        FileOutputStream fos=new FileOutputStream(file);
//
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//
//        GroceryItem product1=new GroceryItem("Milk",2,65);
//
//        oos.writeObject(product1);
//
//        oos.close();
//        fos.close();
    }

}



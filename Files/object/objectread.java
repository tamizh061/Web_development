package FundamentalJava.Files.object;


import java.io.*;

public class objectread {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\FundamentalJava\\Files\\object\\file.txt");

        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);

        GroceryItem product1=(GroceryItem)ois.readObject();;
        System.out.println("you are need product name is "+product1.ProductName+"\n Product Quntity"+product1.ProductQuantity+"\n Price of 2 litre milk"+product1.ProductPrice);
        ois.close();
        fis.close();
    }
}

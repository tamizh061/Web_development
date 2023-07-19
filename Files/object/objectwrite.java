package FundamentalJava.Files.object;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class objectwrite {


    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\FundamentalJava\\Files\\object\\file.txt");

        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);

        ObjectOutputStream oos=new ObjectOutputStream(fos);

        GroceryItem product1=new GroceryItem("Milk",2,65);

        oos.writeObject(product1);

        oos.close();
        fos.close();
    }
}
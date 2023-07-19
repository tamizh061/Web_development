package FundamentalJava.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoRead
{
    public static void main(String[] args) throws IOException
    {
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\FundamentalJava\\Files\\writing.txt");
        FileInputStream fis=new FileInputStream(file);
        int size=fis.available();
        byte[] obj=new byte[size];
        fis.read(obj);
        String bytetostring=new String(obj);
       //System.out.println( bytetostring+" in this content available in my file -file name is "+file.getName());
        fis.close();


    }
}
package FundamentalJava.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demowrite
{
    public static void main(String[] args)throws IOException
    {
        //create a file process
        File file=new File("C:\\Users\\tamiz\\IdeaProjects\\src\\main\\java\\FundamentalJava\\Files\\writing.txt");
        file.createNewFile();
        System.out.println(file.getName()+"Your file is created...! ");
        FileOutputStream  fos=new FileOutputStream(file);
        Scanner scan=new Scanner(System.in);
        System.out.println("Please which value you want added in your file");
        String content=scan.nextLine();
        System.out.println(file.getName()+" in this file written successfully");
        fos.write(content.getBytes());
        fos.close();
    }
}
package ExceptionHandling;

import java.io.*;
public class CheckedExceptionIOEx1 {
    public static void main(String[] args){
        try{
            FileReader file=new FileReader("config.txt");
            BufferedReader fileInput=new BufferedReader(file);

            System.out.println(fileInput.readLine());
            fileInput.close();
        }catch (IOException e){
            System.out.println("Wait i couldn't find the file!");
        }
    }
}

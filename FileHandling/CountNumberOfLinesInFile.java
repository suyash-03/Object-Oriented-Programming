package FileHandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountNumberOfLinesInFile {
    public static void main(String[] args){
        Scanner inputStream = null;
        PrintWriter outputStream = null;

        try{
            inputStream = new Scanner(new FileInputStream("stuff.txt"));
            outputStream = new PrintWriter(new FileOutputStream("stuff2.txt"));
        }catch(IOException e){
            System.out.println("Unable to Open Files");
            System.exit(0);
        }

        
        int count = 0;
        while(inputStream.hasNextLine()){
            count++;
            outputStream.println(count + inputStream.nextLine());
            
        }
        System.out.println(count);
        
        inputStream.close();
        outputStream.close();
    }
}

package FileHandling;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class TextFileOutputDemo
{
  public static void main(String[] args)
  {
    PrintWriter outStream = null;
    try {
        //use true to append to a file otherwise a content of the pre-existing file is lost everytime a stream is connected
       outStream = new PrintWriter(new FileOutputStream("stuff.txt",true));
     }
     //catch (IOException e) -- The class IOException is the root class for a variety of exception classes having to do with input and/or output

    catch(FileNotFoundException e)
    {
       System.err.println("Error opening the file stuff.txt.");
       System.exit(0);
    }
    outStream.println("The quick brown fox");
    outStream.println("jumped over the lazy dog.");

    outStream.close( );
  }
}
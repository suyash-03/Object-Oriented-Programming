package InputMethods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ScannerClass {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String s = br.readLine();
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
        

        //Taking All Inputs in New Line
        //Taking Integer Input
        int i = Integer.parseInt(scanner.nextLine());
        System.out.println(i);

        //Now taking string input
        String name = scanner.nextLine();
        System.out.println(name);

        //Taking Space Separated Input
        String s1 = scanner.next();
        String s2 = scanner.next();
        System.out.println(s1);
        System.out.println(s2);

        scanner.close();
    }
}

import java.io.IOException;

class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}

public class CustomExceptions {
    public static int test() throws ArithmeticException,IOException,ArrayIndexOutOfBoundsException,MyException{
        return 0/0;
    }
    public static void main(String[] args){
        try{
            test();
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }catch(IOException e){
            System.out.println(e.toString());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }catch(MyException e){
            System.out.println();
        }finally{
            System.out.println("Hola!");
        }
    }


}

@FunctionalInterface
interface FuncInterface
{
    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun()
    {
        System.out.println("Hello");
    }
}

interface MyNumber {
    double getValue();
    default void normalFun()
    {
        System.out.println("Hello");
    }
}



public class lambdas {
    public static void main(String[] args){
        // lambda expression to implement above
        // functional interface. This interface
        // by default implements abstractFun()
        FuncInterface fobj = (int x)->System.out.println(2*x);
        
        // This calls above lambda expression and prints 10.
        fobj.abstractFun(5);
        fobj.normalFun();


        // Create a reference to a MyNumber instance.
        // a lambda expression is assigned to that interface reference
        MyNumber myNum;

        myNum = () -> 123.45;

        //Default methods can also be called after a lamda has been assigned to them
        myNum.normalFun();

        System.out.println("A fixed value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
    }
}

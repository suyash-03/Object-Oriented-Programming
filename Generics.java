import java.util.ArrayList;
import java.util.List;

class Printer<T>{
    T thingToPrint;

    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}




public class Generics {
    public static void main(String[] args){
        //Generics don't work with primitve types instead use wrapper classes (Integer in place of int)
        Printer<Integer> p = new Printer<Integer>(5);
        Printer<String> p2 = new Printer<String>("Java");
        p.print(); 
        p2.print();


        shout("Hola BITS");
        shout("69");


        List<Integer> ll = new ArrayList<>();
        ll.add(55);
        printList(ll);


        List<String> ll2 = new ArrayList<>();
        ll2.add("Suyash");
        printList(ll2);

    }


    private static<T> void shout(T thingToShout){
        System.out.println(thingToShout+"!!!!!!");
    }

    private static void printList(List<?> myList){
        System.out.println(myList);
    }
}

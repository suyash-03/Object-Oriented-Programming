class EnclosingClass{
    int index;

    class NClass{
        int nestedIndex;
        public void print(){
            System.out.print("Print from Nested Class");
        }

        NClass(){
            nestedIndex = 5;
        }
    }

    static class NClass2{
        int nestedIndex;
        public static void print(){
            System.out.println("Print from Static Nested Class");
        }

        NClass2(int nestedIndex){
            this.nestedIndex = nestedIndex;
        }
    }
}

/*
 * Without an outer class object existing, there may be a static nested class object.
 * That is, static nested class object is not associated with the outer class object.
 */
public class NestedClasses {
    public static void main(String[] args){
        EnclosingClass ec = new EnclosingClass();
        EnclosingClass.NClass nc = ec.new NClass();
        nc.print();

        EnclosingClass.NClass2 ecn2=  new EnclosingClass.NClass2(5);
        System.out.println(ecn2.nestedIndex);

        EnclosingClass.NClass2.print();


    }
}

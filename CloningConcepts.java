
class ABC implements Cloneable{
    int i;
    int j;

    @Override
    public String toString(){
        return "ABC: " + i + " " + j;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class CloningConcepts {
    public static void main(String[] args) throws CloneNotSupportedException{
        ABC obj1 = new ABC();
        obj1.i = 5;
        obj1.j = 6;

        //Shallow COPY
        ABC obj2 = obj1;

        //Deep COPY
        ABC obj3 = new ABC();
        obj3.i = obj1.i;
        obj3.j = obj1.j;

        
        ABC obj4 = (ABC) obj1.clone();
        System.out.println("Orignal Object:" + obj1);
        System.out.println("Cloned Object:" + obj4);


    }
}

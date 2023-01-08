interface Sounds{
    public void catSound();
    void dogSound();

    static void printDed(){
        System.out.println("Default, private and Static Methods can have implementation inside Interfaces");
    }
    private void printagain(){
        System.out.println("asdsads");
    }
    default void printAgain2(){
        System.out.println("asdsads");
    }
}

abstract class Pig{
    static int numPigs = 0;
    public abstract void pigSound();
    
    void increasePigs(){
        numPigs++;
        System.out.println(numPigs);
    }
}

class Animal extends Pig implements Sounds{

    // @Override
    // void increasePigs() {
    //     super.increasePigs();
    // }
    // Super Keyword is used to access the methods of the superclass
    
    public void catSound(){
        System.out.println("Meow");
    }
    public void dogSound(){
        System.out.println("Bark");
    }
    public void pigSound(){
        System.out.println("Squeak");
    }



}


/*
Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
Interface methods do not have a body - the body is provided by the "implement" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)
*/

public class abstractionConcepts {
    public static void main(String[] args){
        Animal animal = new Animal();
        Sounds.printDed();
        animal.catSound();
        animal.dogSound();
        // animal.pigSound();


        for(int i=0; i<5; i++){
            animal.increasePigs();
        }
    }
}

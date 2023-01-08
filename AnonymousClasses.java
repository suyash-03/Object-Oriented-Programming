class testClass{
    int id;
    String name;
    
    testClass(){
        id = 0;
        name = "suyash";
    }

    public void printDetails(){
        System.out.println(id +" "+name);
    }
}

interface testInterface{
    void testInterfaceFunction();
}

public class AnonymousClasses {    
    public static void main(String[] args){
        testClass instance = new testClass(){
            //This Overrrides the printDetails Function of the superclass
            public void printDetails(){
                System.out.println(id + " -- " + name);
            }
        };

        testInterface tInstance = new testInterface() {
            
            
            public void newInterfaceFunction(){
                System.out.println("We can create new methods while implementing interfaces via Anonymous Classes");
            }

            public void testInterfaceFunction() {
                System.out.println("Anonymous Classes can also be used to implement interfaces");
                newInterfaceFunction();
            }

        };
        //Overrides and defines a specific implementation of printDetails method
        instance.printDetails();
        tInstance.testInterfaceFunction();
        
        // tInstance.newInterfaceFunction();  //can't acess new methods this way
    }
}

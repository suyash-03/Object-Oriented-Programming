package LabSheets.Lab2;

class exerciseCtest{
    private static String[] String;
    static {
        System.out.println("1.%");
    }
    public static void main(String args) {
        System.out.println("2.@");
    }
    static {
        System.out.println("3.&");
    }
    static {
        exerciseC.main(String);
        System.out.println("4.~");
    }
    static {
        System.out.println("5.$");
    }
}
class exerciseC{
    public static void main(String[] args) {
        /* Q2. Create an object for the stest class. Check what happens when this statement is
        omitted and remaining part of the code is executed */
   
        exerciseCtest.main(new String());
        System.out.println("6.#");
    }
}
    

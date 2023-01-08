package StaticBlocks;

public class StaticExample2 {
    static int[] values = initialiseArray(10);

    public static int[] initialiseArray(int n){
        System.out.println("Initialising Array");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i;
        }
        return arr;
    }

    public static void printValues(){
        for(int value:values){
            System.out.println(value + " ");
        }
    }

    static{
        printValues();
    }
    
    public static void main(String[] args){
        System.out.println("Main Called");
    }
}

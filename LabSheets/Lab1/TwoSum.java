package LabSheets.Lab1;
import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {
    public static void twoSum(int arr[],int target){
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        for(int i=0; i<arr.length; i++){
            if(mp.containsKey(target - arr[i]) == true){
                System.out.println(arr[i] + " " +(target-arr[i]));
            }else{
                int count = mp.getOrDefault(arr[i], 0);
                mp.put(arr[i], count+1);
        }
    }
}
    public static void main(String[] args) {
        int arr[] = new int[6];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<6; i++){
            int a = in.nextInt();
            arr[i] = a;
        }
        int target = in.nextInt();
        twoSum(arr,target);
        in.close();
    }
}
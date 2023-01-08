import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> fq1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> fq2 = new HashMap<Integer,Integer>();
        
        for(int i=0; i<arr.length; i++){
            int n = fq1.getOrDefault(arr[i],0);
            fq1.put(arr[i],n+1);
        }
        
        for(var entry: fq1.entrySet()){
            int x = fq2.getOrDefault(entry.getValue(),0);
            if(x == 1){
                return false;
            }else{
                fq2.put(entry.getValue(),x+1);
            }
        }
        
        return true;
    }
}

class UniqueNumberOfOccurences{
    public static void main(String[] args){
        Solution s = new Solution();
        int[] arr = new int[] {1,2,2,1,1,3};
        Boolean res = s.uniqueOccurrences(arr);
        System.out.println(res);
    }
}
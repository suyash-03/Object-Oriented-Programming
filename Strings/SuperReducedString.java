package Strings;

public class SuperReducedString {
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("aaabbe");
        
        boolean exists = true;
        while(sb.length() > 0 && exists == true){
            exists = false;
            for(int i=0; i<sb.length()-1; i++){
                if(sb.charAt(i) == sb.charAt(i+1)){
                    sb.delete(i,i+2);
                    exists = true;
                    break;
                }
            }
        }
        
        if(sb.length() == 0){
            System.out.println("Empty String");
        }else{
            System.out.println(sb.toString());
        }
    }
}

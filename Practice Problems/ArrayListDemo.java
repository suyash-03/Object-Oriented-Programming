import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> line = new ArrayList<Integer>();
            int d = scanner.nextInt();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            arr.add(line);
        }
    
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            try {
                System.out.println(arr.get(scanner.nextInt() - 1).get(scanner.nextInt() - 1));
            } catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
        scanner.close();
    }
}

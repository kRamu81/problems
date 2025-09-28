import java.util.*; // import List, ArrayList, Scanner

public class Leetcode448 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int n = parts.length;
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(findDisappearedNumbers(num));
        sc.close();
    }

    public static List<Integer> findDisappearedNumbers(int[] num){
        int n = num.length;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int index = Math.abs(num[i]) - 1;
            if(num[index] > 0) num[index] = -num[index];
        }
        for(int i=0;i<n;i++){
            if(num[i] > 0) result.add(i + 1);
        }
        return result;
    }
}


import java.util.*;
//leetcode 88
public class MergeSorted2Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts1 = sc.nextLine().trim().split("\\s+");
        int m = sc.nextInt();
        sc.nextLine();
        String[] parts2 = sc.nextLine().trim().split("\\s+");
        int n = sc.nextInt();
        int[] num1 = new int[parts1.length];
        int[] num2 = new int[parts2.length];
        for(int i=0;i<parts1.length;i++){
            num1[i]= Integer.parseInt(parts1[i]); 
        }
        for(int i=0;i<parts2.length;i++){
            num2[i]= Integer.parseInt(parts2[i]); 
        }
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int p1 = m-1;
        int p2 = n-1;
        int p = m+n-1;
        while(p1>=0 && p2>=0){
            if(nums1[p1]>nums2[p2]){
                nums1[p] = nums1[p1];
                p1--;
            }else{
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        while(p2>=0){
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }
}

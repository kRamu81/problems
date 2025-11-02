
import java.util.*;
import java.lang.*;
import java.io.*;

class Lapindromes {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
            String st = s.next();
            int n = st.length();

            String left, right;
            if(n%2==0){
                left = st.substring(0,n/2);
                right = st.substring(n/2);
            }
            else{
                left = st.substring(0,n/2);
                right = st.substring(n/2+1);
            }

            int[] leftcount = new int[26];
            int[] rightcount = new int[26];

            for(char c : left.toCharArray()){
                leftcount[c-'a']++;
            }
            for(char c : right.toCharArray()){
                rightcount[c-'a']++;
            }
            boolean check = true;
            for(int i=0;i<26;i++){
                if(leftcount[i] != rightcount[i]){
                    check = false;
                    break;
                }
            }
            if (check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
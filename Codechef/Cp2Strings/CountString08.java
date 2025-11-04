
import java.util.*;
import java.lang.*;
import java.io.*;

class CountString08 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
            int n = s.nextInt();
            String sc = s.next();
            long count =0;
            for(char c : sc.toCharArray()){
                if(c=='1') count++;
            }
            long res = count*(count+1)/2;
            System.out.println(res);
        }
    }
}

import java.util.*;
import java.lang.*;
import java.io.*;

class HiringTest{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            int y = s.nextInt();

            for(int i=0;i<n;i++){
                String st = s.next();
                int full =0;
                int partial = 0;

                for(char c : st.toCharArray()){
                    if(c=='F') full++;
                    else if(c=='P') partial++;
                }
                if(full >= x || (full==(x-1) && partial >= y)){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
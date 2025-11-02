
import java.util.*;
import java.lang.*;
import java.io.*;

class MagicalDoors{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-->0){
            String st = s.next();
            int count = 0;
            for(int i=1;i<st.length();i++){
                if(st.charAt(i)!=st.charAt(i-1)) count++;
            }
            if(st.charAt(0)=='0') count++;
            System.out.println(count);
        }

    }
}
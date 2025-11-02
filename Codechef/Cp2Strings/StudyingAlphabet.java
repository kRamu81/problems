
import java.util.*;
import java.lang.*;
import java.io.*;

class StudingAlphabet{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        Set<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(int i=0;i<n;i++){
            String word= sc.next();
            boolean check = true;

            for(char c : word.toCharArray()){
                if(!set.contains(c)){
                    check = false;
                    break;
                }
            }
            System.out.println(check ? "Yes" : "No");

        }
    }
}
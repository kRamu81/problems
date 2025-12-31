package Recursion;


import java.util.*;
import java.lang.*;

class LongestPalindromicSubsequence
{
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        String sc = s.next();
        System.out.println(solve(sc,0,sc.length()-1));
    }
    private static int solve(String s,int start,int end){
        if(start > end) return 0;
        if(start == end) return 1;

        if(s.charAt(start)==s.charAt(end)){
            return 2+solve(s,start+1,end-1);
        }
        return Math.max(solve(s,start+1,end),solve(s,start,end-1));

    }
}

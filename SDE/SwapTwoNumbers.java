package SDE;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("BEfore :"+a +" "+b);
        //using Artjimetic operator
        a = a+b;
        b = a-b;
        a = a-b;
        /*
        noraml way
        int temp = a;
        a = b;
        b = temp;

        using Xor
        a = a^b
        b = a^b
        a = a^b
         */
        System.out.println("After :"+a +" "+b);
    }
}

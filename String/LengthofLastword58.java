package String;
//58,28,151,3,387,345,290,125,14,389,242,205
public class LengthofLastword58 {
    public static void main(String[] args) {
        String s = "Hello World";
        int length =0;
        int n = s.length()-1;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        while(n>=0 && s.charAt(n)!=' '){
            length++;
            n--;
        }
        System.out.println(length);
    }
}

package String;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "level";
        System.out.println(palindrome(s));
    }
    public static boolean palindrome(String s){
        String original = s;
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--){
            reverse = reverse+s.charAt(i);
        }
        if(s.toLowerCase().equals(reverse.toLowerCase())){
            return true;
        }else{
            return false;
        }
    }
}

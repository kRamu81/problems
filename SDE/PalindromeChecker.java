package SDE;

public class PalindromeChecker {
    public static void main(String[] args) {
        String s = "malayalam";
        String str = s.toLowerCase(); // Convert to lowercase for case-insensitive comparison

        boolean isCheck = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isCheck = false;
                break;
            }
        }

        System.out.println(s + " is palindrome: " + isCheck);
    }
}

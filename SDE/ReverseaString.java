package SDE;

public class ReverseaString {
    public static void main(String[] args) {
        String original = "Automation";
        //Using StringBuilder
        String rev = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: "+ rev);
    }
}

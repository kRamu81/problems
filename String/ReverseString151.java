package String;

public class ReverseString151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] parts = s.split(" "); // split by spaces
        StringBuilder sb = new StringBuilder();

        for (int i = parts.length - 1; i >= 0; i--) {
            // skip extra spaces
                sb.append(parts[i]);
                sb.append(" ");

        }

        System.out.println(sb.toString().trim()); // remove trailing space
    }
}

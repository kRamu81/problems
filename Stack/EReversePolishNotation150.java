package Stack;
import java.util.*;

public class EReversePolishNotation150 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Read full line of input (space-separated tokens)
        String[] tokens = s.nextLine().trim().split("\\s+");

        System.out.println(polishNotation(tokens));
    }

    public static int polishNotation(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop(); // second operand
                int a = stack.pop(); // first operand
                int res = applyOperator(token, a, b);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(String token, int a, int b) {
        switch (token) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;  // assume no divide by zero
            default: throw new IllegalArgumentException("Invalid operator: " + token);
        }
    }
}

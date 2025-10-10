package Stack;
import java.util.*;

public class ValidParenthsis20 {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(valid(s));
    }
    public static boolean valid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else
                if(stack.isEmpty() || stack.pop()!=c) return false;
        }
        return true;
    }
}

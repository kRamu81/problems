import java.util.*;
import java.util.Stack;


public class BalancedParenthesesCheck {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(validParenthis(str));
    }
    public static boolean validParenthis(String str){
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='{') stack.push('}');
            else if(c=='[') stack.push(']');
            else if(stack.isEmpty() || stack.pop()!=c) return false;
        }
        return stack.isEmpty();
    }  
}


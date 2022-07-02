package easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if(ch == '}' && !stack.isEmpty() && stack.peek() =='{')
                stack.pop();
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));

        String s1 = "()[]{}";
        System.out.println(isValid(s1));

        String s3 = "(]";
        System.out.println(isValid(s3));

        String s4 = "{[]}";
        System.out.println(isValid(s4));

    }
}

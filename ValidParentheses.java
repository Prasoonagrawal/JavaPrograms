package prasoon.odessa;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="[";

        Stack<Character> stack=new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(')
                stack.add(')');
            else if (s.charAt(i)=='[')
                stack.add(']');
            else if (s.charAt(i)=='{')
                stack.add('}');

            else
            {
                if(s.charAt(i)!=stack.peek()) {
                    System.out.println("False");
                    return;
                }
                else {
                    stack.pop();
                }
            }
        }
        if (stack.size()!=0)
            System.out.println("False");
        else
        System.out.println(true);

    }
}

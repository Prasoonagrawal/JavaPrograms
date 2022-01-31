package prasoon.odessa;

import java.util.Stack;

public class scoreOfParentheses {
    public static void main(String[] args) {
       String s="()()";
       int result=0;
        Stack<Integer> stack=new Stack<Integer>();

        for (int i = 0; i < s.length(); i++) {
            int sum=0;
            if (s.charAt(i)=='(')
            {
                stack.push(-1);
            }
            else{
                while (stack.peek()!=-1)
                {
                    sum+=stack.pop();
                }
                stack.pop();
                sum=Math.max(1,2*sum);
                stack.push(sum);
            }
        }
        while (!stack.isEmpty())
        result+=stack.pop();

        System.out.println(result);
    }
}

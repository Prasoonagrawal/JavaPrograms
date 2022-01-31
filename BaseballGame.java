package prasoon.odessa;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        Stack<String> stack = new Stack<>();
        int a;
        int b;
        String c;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i] == "+") {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                c = String.valueOf(a + b);
                stack.push(String.valueOf(b));
                stack.push(String.valueOf(a));
                stack.push(c);
            } else if (ops[i] == "C") {
                stack.pop();
            } else if (ops[i] == "D") {
                stack.push(String.valueOf((Integer.valueOf(stack.peek())) *2));
            } else {
                stack.push(ops[i]);
            }
        }

        int answer=0;
        while (stack.size()!=0)
        {
            answer+=Integer.valueOf(stack.pop());
        }
        System.out.println(answer);
    }
}


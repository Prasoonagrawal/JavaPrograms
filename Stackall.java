package prasoon.odessa;

import java.util.Stack;

public class Stackall {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

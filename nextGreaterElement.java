package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int [] num2={1,2,3,4};
        int [] nums1={2,4};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        hashMap.put(num2[num2.length-1],-1);
        stack.push(num2[num2.length-1]);
        for (int i = num2.length-2; i >=0; i--) {
            while (stack.size()!=0 && num2[i]>stack.peek())
                stack.pop();
            if (stack.size()==0)
                hashMap.put(num2[i],-1);
            else
                hashMap.put(num2[i],stack.peek());
            stack.push(num2[i]);
        }
        int [] result=new  int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i]=hashMap.get(nums1[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}

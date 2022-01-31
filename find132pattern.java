package prasoon.odessa;

import java.util.Arrays;
import java.util.Stack;

public class find132pattern {
    public static void main(String[] args) {
        int[] nums={3,5,0,3,4};
        if (nums.length<3){
            System.out.println(false);
            return;
        }
        int n=nums.length;

        int []l= new int[n];
        l[0]=nums[0];
    for (int i = 1; i <nums.length ; i++) {
            if (l[i-1]<nums[i])
            l[i]=l[i-1];
            else
                l[i]=nums[i];
        }
        Stack<Integer> stack=new Stack<>();

        for (int i = n-1; i >=0; i--) {
            if (l[i]<nums[i])
            {
                while (!stack.isEmpty() && stack.peek()<=l[i])
                    stack.pop();
                if (!stack.isEmpty() && stack.peek()<nums[i])
                {
                    System.out.println(true);
                    return;
                }
                stack.push(nums[i]);
            }
        }
        System.out.println(false);


    }
}

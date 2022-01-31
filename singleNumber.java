package prasoon.odessa;

import java.util.Arrays;

public class singleNumber {
    public static void main(String[] args) {
        int [] nums={2,2,1,1,4};
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            x=x^nums[i];
        }
        System.out.println(x);
    }
}

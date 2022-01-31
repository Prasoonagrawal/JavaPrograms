package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSumClosest {
    public static void main(String[] args) {
        int []nums={0,0,0};
        int target=1;
        Arrays.sort(nums);
        int sum1=nums[0]+nums[1]+nums[nums.length-1];
        for (int i = 0; i < nums.length-2; i++) {
            int l=i+1;
            int h=nums.length-1;

            while (l<h)
            {
                int sum2=nums[i]+nums[l]+nums[h];
                if (sum2>target)
                h--;
                else
                    l++;
                if (Math.abs(sum2-target)<Math.abs(sum1-target))
                sum1=sum2;
            }
        }
        System.out.println(sum1);
    }
}

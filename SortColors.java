package prasoon.odessa;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] nums={2,0,1,0,0,1,2,2,1};
        int z=0,o=0,t=0;
        for (int i = 0; i < nums.length; i++) {
        if(nums[i]==0)
            z++;
        else if(nums[i]==1)
            o++;
        else
            t++;
        }
        for (int i = 0; i < z; i++) {
            nums[i]=0;
        }
        for (int i = z; i < z+o; i++) {
nums[i]=1;
        }
        for (int i = z+o; i < z+o+t; i++) {
            nums[i]=2;
        }
System.out.println(Arrays.toString(nums));
    }
}

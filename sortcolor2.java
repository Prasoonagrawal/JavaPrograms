package prasoon.odessa;

import java.util.Arrays;

public class sortcolor2 {
    public static void main(String[] args) {
        int [] nums={2,0,1};
        int l=0,m=0,h=nums.length-1;
        while (m<=h)
        {
            switch (nums[m])
            {
                case 0:
                {
                    int t=nums[m];
                    nums[m]=nums[l];
                    nums[l]=t;
                    m++;l++;
                    break;
                }

                case 1:
                    m++;
                    break;
                case 2:
                {
                    int t=nums[m];
                    nums[m]=nums[h];
                    nums[h]=t;
                    h--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

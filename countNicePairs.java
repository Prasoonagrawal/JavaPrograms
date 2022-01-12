package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class countNicePairs {

    public static void main(String[] args) {
        int mod=1000000000+7;
        int [] nums={42,11,1,97};
        int [] a=new int[nums.length];
        int ans=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val=nums[i]-rev(nums[i]);
            int c=map.getOrDefault(val,0);
            ans=(ans+c)%mod;
            map.put(val,c+1);
        }
      System.out.println(ans);

        }

    public static int rev(int n){
        int rev=0;
        while (n!=0)
        {
            int rem=n%10;
             n=n/10;
            rev=rev*10+rem;
        }
        return rev;
    }
}

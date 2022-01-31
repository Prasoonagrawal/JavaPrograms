package prasoon.odessa;

public class maxProduct {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,-1,2};
        int ans=nums[0];
        int max=ans;
        int min=ans;
        int n=nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i]<0)
            {
                int t=max;
                max=min;
                min=t;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            ans=Math.max(ans,max);
        }
        System.out.println(ans);
    }
}

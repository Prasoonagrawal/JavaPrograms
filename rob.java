package prasoon.odessa;

public class rob {
    public static void main(String[] args) {
        int [] nums={2,1,1,2};
        if (nums==null || nums.length==0) {
            System.out.println(0);
            return;
        }
        if (nums.length==1)
        {
            System.out.println(nums[0]);
            return;
        }
        if (nums.length==2)
        {
            System.out.println(Math.max(nums[0],nums[1]));
            return;
        }
        int [] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[1],nums[0]);

        for (int i = 2; i <nums.length ; i++) {
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        System.out.println(dp[nums.length-1]);
        return;
    }
}

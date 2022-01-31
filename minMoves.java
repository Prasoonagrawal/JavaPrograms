package prasoon.odessa;

public class minMoves {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        int small=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]<small)
                small=nums[i];
            sum+=nums[i];
        }

        System.out.println(sum-nums.length*small);
    }
}

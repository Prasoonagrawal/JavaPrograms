package prasoon.odessa;

public class findKthLargest {
    public static void main(String[] args) {
        int nums[] = {3, 2, 6, 5, 1, 4};
        int k = 2;
        System.out.println(quickselect(nums, 0, nums.length-1, k));

    }

    private static int quickselect(int[] nums, int left, int right, int k) {
        int pivot = left;
        for(int i=left;i<right;i++){
            if(nums[i]<=nums[right]){
                swap(nums,pivot++,i);
            }
        }
        swap(nums,pivot,right);

        int count=right-pivot+1;

        if(count==k){
            return nums[pivot];
        }
        else if(count>k){
            return quickselect(nums,pivot+1,right,k);
        }

        return quickselect(nums,left,pivot-1,k-count);
    }

    static void  swap(int[] nums,int l,int r){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
}
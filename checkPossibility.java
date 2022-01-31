package prasoon.odessa;

public class checkPossibility {
    public static void main(String[] args) {
        int nums[]={3,4,2,1};
        int n=nums.length;
//        if (n==0 || n==1){
//            System.out.println(true);
//            return;
//        }
//int c=0;
//        for (int i = 0; i < n-1; i++) {
//            if (nums[i]>nums[i+1])
//            {
//                c++;
//                if (c==2)
//                {
//                    System.out.println(false);
//                    return;
//                }
//                if (i>0 && nums[i-1]>nums[i+1])
//                    nums[i+1]=nums[i];
//            }
//        }
//        System.out.println(true);

        int c=-1;
        for (int i = 0; i < n-1; i++) {
            if (nums[i]>nums[i+1]){
                if (c!=-1)
                {
                    System.out.println(false);
                    return;
                }
                c=i;
            }
        }
        boolean m=c==0||c==-1 || c==nums.length-2 || nums[c-1]<=nums[c+1] || nums[c]<=nums[c+2];
        System.out.println(m);
    }
}

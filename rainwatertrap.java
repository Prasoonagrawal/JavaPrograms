package prasoon.odessa;

public class rainwatertrap {
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int n=height.length;
        int rm=0,lm=0;
        int l=0,r=n-1;
        int result=0;

        while(l<=r){
            if(height[l]<=height[r])
            {
                if(height[l]>=lm){
                    lm=height[l];
                }
                else{
                   result+=lm-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rm)
                {
                    rm=height[r];
                }
                else{
                    result+=rm-height[r];
                }
                r--;
            }
        }



        return result;



    }
}

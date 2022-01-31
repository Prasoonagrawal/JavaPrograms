package prasoon.odessa;

public class maxDistToClosest {
    public static void main(String[] args) {
        int[] seats = {0,0,1,0,1,1};
       int n=seats.length;
       int ans=0;
       int count=0;
        for (int i = 0; i < n; i++) {
            if (seats[i]==0)
            {
            count++;
            ans=Math.max(count,ans);
            }
            else {
                count=0;
            }
        }
        int right=0;
        count=0;
        for (int i = seats.length-1; i >-1; i--) {
            if (seats[i]==0)
            {
                count++;
                right=Math.max(right,count);
            }
            else {
                break;
            }
        }
        int left=0;
        count=0;
        for (int i = 0; i <seats.length; i++) {
            if (seats[i]==0)
            {
                count++;
                left=Math.max(left,count);
            }
            else {
                break;
            }
        }
        ans=(ans+1)/2;
        ans=Math.max(ans,left);
        ans=Math.max(ans,right);
        System.out.println(ans);
        }
}

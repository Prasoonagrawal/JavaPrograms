package prasoon.odessa;

import java.util.Arrays;

public class minEatingSpeed {
    public static void main(String[] args) {

        int []piles = { 3,6,7,11 };
        int H = 8;
        int start = 1;

        int end = Arrays.stream(piles).max().getAsInt();

        while (start < end) {
            int mid = start + (end - start) / 2;

            if ((check(piles, mid, H)) == true) {
                end = mid;
            }
            else {
                start = mid + 1;
            }
        }
        System.out.println(end);
        return;

//        long maxp=0;
//        for (int i = 0; i < piles.length; i++) {
//            if(piles[i]>maxp)
//                maxp=piles[i];
//        }
//        if(h==piles.length) {
//            System.out.println(maxp);
//    return;
//        }
//        long s=1;
//        long e=maxp;
//        while (s<=e){
//            long m=(s+e)/2;
//           long x= time(m,piles);
//           if (x==h)
//           {
//               System.out.println(m);
//               return;
//           }
//           else if(x<h)
//               e=m-1;
//            else
//                s=m+1;
//        }
//    }
//
//    public static long time(long m, long[] piles) {
//        int i=0;
//        long answer=0;
//        long k=0;
//        long a=0;
//        while (i<piles.length)
//        {
//            if(k==0)
//            {
//                a=piles[i];
//            }
//            if (a<=m)
//            {
//                i++;
//                answer++;
//                k=0;
//            }
//            else{
//                a-=m;
//                answer++;
//                k=1;
//            }
//        }
//        return answer;
    }

    static boolean check(int[] bananas, int mid_val, int H)
    {
        int time = 0;
        for (int i = 0; i < bananas.length; i++) {

            if (bananas[i] % mid_val != 0) {

                time += ((bananas[i] / mid_val) + 1);
            }
            else {

                time += (bananas[i] / mid_val);
            }
        }
        if (time <= H) {
            return true;
        }
        else {
            return false;
        }
    }
}

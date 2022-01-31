package prasoon.odessa;

import java.util.stream.StreamSupport;

public class canCompleteCircuit {
    public static void main(String[] args) {
        int [] gas={1,2,3,4,5};
        int [] cost={3,4,5,1,2};
//        int n=gas.length;
//        for (int i = 0; i < n; i++) {
//            int total=0,stopCount=0,j=i;
//            while (stopCount<n)
//            {
//                total+=gas[j%n]-cost[j%n];
//                if (total<0)
//                break;
//                stopCount+=1;
//                j++;
//            }
//            if (stopCount==n &&total>=0) {
//                System.out.println(i);
//                return;
//            }
//        }
//        System.out.println(-1);
        int t=0,total=0,index=0;
        for (int i = 0; i < gas.length; i++) {
            int c= gas[i]-cost[i];
            t+=c;
            if(t<0)
            {
                index=i+1;
                t=0;
            }
            total+=c;
        }
        if(total<0)
            System.out.println(-1);
        else
            System.out.println(index);
    }
}

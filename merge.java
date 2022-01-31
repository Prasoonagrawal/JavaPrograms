package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge {
    public static void main(String[] args) {
        int intervals[][]={{1,3},{2,6},{8,10},{15,18}};
        List<int[]> answer=new ArrayList<>();
        if(intervals.length==0 || intervals==null) {
            System.out.println("No array");
           // return answer.toArray(new int[0][]);
        }
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int s=intervals[0][0];
        int e=intervals[0][1];

        for (int [] i: intervals) {
            if (i[0]<=e)
            {
                e=Math.max(e,i[1]);
            }
            else {
                answer.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
        }
        answer.add(new int[]{s,e});
        System.out.println(answer);
    }
}

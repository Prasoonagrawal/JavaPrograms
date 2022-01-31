package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class goodDaysToRobBank {
    public static void main(String[] args) {
        int [] security={1,1,1,1,1};
        int time=0;

        List<Integer> answer=new ArrayList<>();

        int []l=new int[security.length];
        int []r=new int[security.length];
        l[0]=0;
        r[security.length-1]=0;
        for (int i = 1; i <security.length ; i++) {
            if (security[i-1]>=security[i])
                l[i]=l[i-1]+1;
            else
                l[i]=0;
        }
        for (int i = security.length-2; i >=0 ; i--) {
            if (security[i+1]>=security[i])
                r[i]=r[i+1]+1;
            else
                r[i]=0;
        }
        for (int i = 0; i < r.length; i++) {
            if(r[i]>=time && l[i]>=time)
                answer.add(i);
        }
System.out.println(answer);
    }
}

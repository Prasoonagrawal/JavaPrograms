package prasoon.odessa;

import java.util.ArrayList;

public class plus1 {
    public static void main(String[] args) {
        int [] d={1,2,3};

        ArrayList<Integer> a=new ArrayList<>();
        int c=0;

        for (int i = d.length-1; i >=0 ; i--) {
            if(i==d.length-1)
            {
                int r=d[i]+1;
                int q=r%10;
                c=r/10;
                a.add(q);
            }
            if(d[i]+c>9)
            {
                int r=d[i]+1+c;
                int q=r%10;
                c=r/10;
                a.add(q);

            }
            else{
                a.add(d[i]+c);
                c=0;
            }

        }
        if(c!=0)
            a.add(c);
        System.out.println(a);
    }
}

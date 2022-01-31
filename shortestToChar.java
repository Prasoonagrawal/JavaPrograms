package prasoon.odessa;

import java.util.Arrays;

public class shortestToChar {
    public static void main(String[] args) {
        String s="loveleetcode";
        char c='e';
        int n=s.length();
        int [] l=new int[n];
        int [] r=new int[n];
        Arrays.fill(l,Integer.MAX_VALUE);
        Arrays.fill(r,Integer.MAX_VALUE);
        int run=Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i)==c)
            {
                run=0;
                r[i]=run;
            }
            else {
                if (run!=Integer.MAX_VALUE)
                {
                    r[i]=++run;
                }
            }
        }
        System.out.println(Arrays.toString(r));
        for (int i = n-1; i >-1; i--) {
            if (s.charAt(i)==c)
            {
                run=0;
                l[i]=run;
            }
            else {
                if (run!=Integer.MAX_VALUE)
                {
                    l[i]=++run;
                }
            }
        }
        System.out.println(Arrays.toString(l));
        int [] result=new int[n];
        for (int i = 0; i < result.length; i++) {
            if(l[i]<r[i])
            result[i]=l[i];
            else
                result[i]=r[i];
        }
        System.out.println(Arrays.toString(result));
    }
}

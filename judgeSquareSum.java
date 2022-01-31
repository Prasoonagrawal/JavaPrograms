package prasoon.odessa;

public class judgeSquareSum {
    public static void main(String[] args) {
        int c=2147483600;

        int l=0;
        int r=(int)Math.sqrt(c);

        while (l<=r)
        {
            if (l*l+r*r==c) {
                System.out.println(l+" "+r);
                return;
            }
            else if(l*l+r*r>c)
            {
                r=r-1;
            }
            else
            {
                l=l+1;
            }
        }
        System.out.println(false);
return;
    }
}

package prasoon.odessa;

public class maxSatisfied {
    public static void main(String[] args) {
        int [] customers={3};
        int []grumpy={1};
        int minutes=1;
       int happy=0,unhappy=0,maxunhappy=0;

        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i]==0)
                happy+=customers[i];
        }
int i=1-minutes;
        for (int j = 0; j < customers.length; j++) {
           if (grumpy[j]==1)
           unhappy+=customers[j];

        if(i>0)
        {
            if (grumpy[i-1]==1)
            unhappy-=customers[i-1];
        }
        if (i>=0)
        {
            maxunhappy=Math.max(maxunhappy,unhappy);
        }
        i++;
    }
        System.out.println(maxunhappy+happy);
}}

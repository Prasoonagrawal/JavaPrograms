package com.prasoon;
//if element exit more than n/2 times
//using moore's voting algorithm
public class MajorityElement {
    public static void main(String[] args) {
        int [] arr={40,50,30,40,50,30,30};
        int r =Majority(arr);
        System.out.println(r);
    }

    static int Majority(int[] arr) {
        int c=1;
        int r=0;
        for (int i = 1; i <arr.length ; i++) {
if(arr[r]==arr[i])
{
    c++;
}
else{
    c--;
}
if(c==0)
{
    r=i;
    c=1;
}


        }
        c=0;
        for (int i = 0; i < arr.length; i++) {
            c++;
        }
        if(c<=arr.length/2)
        {
            return -1;
        }
        return arr[r];

    }
}

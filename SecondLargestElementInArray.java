package com.prasoon;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] arr={7,10,10,10};
        int a=SeondLargest1(arr);// two loop
        System.out.println(a);
        int b=SeondLargest2(arr);
        System.out.println("index"+b);// one loop
    }

    private static int SeondLargest2(int[] arr) {
        int l1 = 0;
        int l2 = -1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>arr[l1])
            {
                l2=l1;
                l1=i;
            }
            else if(arr[l1]!=arr[i]){
                if(l2==-1 || arr[i]>arr[l2])
                {
                    l2=i;
                }


            }
        }
        return l2;
    }


    static int SeondLargest1(int[] arr) {
        int l1=-1;
        int l2=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(l1<arr[i])
            {
                l1=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(l2<arr[i] && arr[i]!=l1)
            {
                l2=arr[i];
            }
        }
        return l2;
    }
}

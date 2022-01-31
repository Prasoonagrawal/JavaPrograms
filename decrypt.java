package prasoon.odessa;

import java.util.Arrays;

public class decrypt {
    public static void main(String[] args) {
        int code[]={2,4,9,3};
        int k=-2;
        int [] result=new int[code.length];

        if(k==0) {
            for (int i = 0; i < code.length; i++) {
                code[i] = 0;
            }
            System.out.println(Arrays.toString(code));
            return;
        }
        if(k>0)
        {

            for (int i = 0; i < code.length; i++) {
                int sum=0;
                for (int j = i+1; j < i+k+1; j++) {
                    sum=sum+code[j%code.length];
                }
                result[i]=sum;
            }
            System.out.println(Arrays.toString(result));
            return;
        }
        int j=0;
        if(k<0){
            k=-k;
            for (int i = code.length-1; i >-1; i--) {
                result[j++]=code[i];
            }

        for (int i = 0; i <code.length; i++) {
            code[i]=result[i];
        }
        for (int i = 0; i < code.length; i++) {
            int sum=0;
            for ( j = i+1; j < i+k+1; j++) {
                sum=sum+code[j%code.length];
            }
            result[i]=sum;
        }
            for (int i = 0; i <code.length; i++) {
                code[i]=result[i];
            }
            j=0;
            for (int i = code.length-1; i >-1; i--) {
                result[j++]=code[i];
            }

            System.out.println(Arrays.toString(result));
        return;
    }}
}

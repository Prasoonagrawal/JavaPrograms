package prasoon.odessa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class plau2 {
    public static void main(String[] args) {
        int [] digits={9,8,9};
        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                for (int j = 0; j < digits.length ; j++) {
                    System.out.println(digits[j]);
                }
                ;return;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        for (int j = 0; j < digits.length ; j++) {
            System.out.println(digits[j]);
        }
        return;

        }

        }

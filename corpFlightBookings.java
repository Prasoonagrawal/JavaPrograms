package prasoon.odessa;

import java.util.Arrays;

public class corpFlightBookings {
    public static void main(String[] args) {
        int [][]bookings={{1,2,10},{2,2,15}};
        int n=2;

//        int [] answer=new int[n];
//        for (int i = 0; i < bookings.length; i++) {
//            for (int j = bookings[i][0]-1; j <=bookings[i][1]-1 ; j++) {
//                answer[j]+=bookings[i][2];
//            }
//        }
//        System.out.println(Arrays.toString(answer));
        int [] answer=new int[n];
        int s,e,se;
        for (int i = 0; i < bookings.length; i++) {
            s=bookings[i][0];
            e=bookings[i][1];
            se=bookings[i][2];

            answer[e-1]+=se;
            if (s>1)
            {
                answer[s-2]-=se;
            }
        }
        for (int i = n-2; i >=0 ; i--) {
            answer[i]+=answer[i+1];
        }
    }
}

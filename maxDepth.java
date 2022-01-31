package prasoon.odessa;

public class maxDepth {
    public static void main(String[] args) {
        String s="((1)+((2))+(((3))))";
        int answer=0;
        int balance=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='(')
            {
                balance+=1;
            }
            else if(s.charAt(i)==')')
            {
                balance-=1;
            }

            if (balance<0)
            {
                System.out.println(-1);
                return;
            }
            answer=Math.max(answer,balance);
        }
        System.out.println(answer);
    }
}

package prasoon.odessa;

import java.util.Arrays;

public class maxDepthAfterSplit {
    public static void main(String[] args) {
        String seq="(()())";
        int[] r = new int[seq.length()];
        int md = 0;
        int cd = 0;
        for (int i=0;i<seq.length();i++) {
            if (seq.charAt(i) == '(') cd++;
            if (seq.charAt(i) == ')') cd--;
            if (cd>md) md = cd;
        }
        int hd = md/2;
        cd = 0;
        for (int i=0;i<seq.length();i++) {
            if (seq.charAt(i) == '(') cd++;
            if (cd>hd) r[i] = 1;
            if (seq.charAt(i) == ')') cd--;
        }

        System.out.println(Arrays.toString(r));
    }
}

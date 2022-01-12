package prasoon.odessa;

import java.util.ArrayList;
import java.util.List;

public class pascal_tringle {public static void main(String[] args) {
    int numRows=5;
    List<List<Integer>> result = new ArrayList<>();
    if (numRows <= 0)
        System.out.println(result);

    List<Integer> pre = new ArrayList<>();
    pre.add(1);
    result.add(pre);

    for (int i = 2; i <= numRows; i++) {
        List<Integer> cur = new ArrayList<>();

        cur.add(1); //first
        for (int j = 0; j < pre.size() - 1; j++) {
            cur.add(pre.get(j) + pre.get(j + 1)); //middle
        }
        cur.add(1);//last

        result.add(cur);
        pre = cur;
    }

    System.out.println(result);
}
}

package prasoon.odessa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insertinterval {
    public static void main(String[] args) {
        int [][]intervals={{1,2},{3,5},{6,7},{8,10},{12,16}};
        int [] newInterval={4,8};

        List<int[]> res = new ArrayList<>();

        int i = 0;
        int n = intervals.length;
        while(i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i++]);
        }
        while(i < n && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);
        while(i < n) res.add(intervals[i++]);

        int[][] answer= res.toArray(new int[res.size()][]);

        for (int j = 0; j < answer.length; j++) {
                System.out.println(Arrays.toString(answer[j]));

        }

        }
    }


package prasoon.odessa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class groupThePeople {
    public static void main(String[] args) {
        int [] groupSizes={2,1,3,3,3,2};

        List<List<Integer>> result=new ArrayList<>();
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
int n=groupSizes.length;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> group;
            int s=groupSizes[i];
            if (map.containsKey(s))
            {
                group=map.get(s);
            }
            else{
                group=new ArrayList<>();
            }
            group.add(i);
            if (group.size()==s){
                map.remove(s);
                result.add(group);
            }
            else
            {
                map.put(s,group);
            }
        }
        System.out.println(result);
    }
}

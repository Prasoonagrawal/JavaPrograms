package prasoon.odessa;

import java.util.*;

public class relativeSortArray {
    public static void main(String[] args) {
        int []arr1={2,3,1,3,2,4,6,7,9,2,19};
        int []arr2={2,1,4,3,9,6};
        ArrayList<Integer> list=new ArrayList<>();

        Hashtable<Integer,Integer> map=new Hashtable<Integer,Integer>();
        for (int i: arr1) {
            if (map.get(i)==null)
                map.put(i,+1);
            else
            map.put(i,map.get(i)+1);
        }

int index=0;
        for (int i = 0; i < arr2.length; i++) {
            int a=map.get(arr2[i]);
            for (int j = 0; j < a; j++) {
        arr1[index++]=arr2[i];
            }
            map.remove(arr2[i]);
        }

        for(Map.Entry m:map.entrySet())
        {
            int b=(int)m.getValue();
            for (int i = 0; i < b; i++) {
                int c=(int)m.getKey();
               list.add(c);
            }
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            arr1[index++]=list.get(i);
        }
        System.out.println(Arrays.toString(arr1));
    }
}

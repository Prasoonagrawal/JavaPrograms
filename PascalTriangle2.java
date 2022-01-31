package prasoon.odessa;

import java.beans.PropertyEditorSupport;
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        int rowIndex=5;
        List<List<Integer>> r= new ArrayList<>();
        if (rowIndex==0)
System.out.println(r);

        List<Integer> x=new ArrayList<>();
        x.add(1);
        r.add(x);

        for (int i = 2; i < rowIndex; i++) {
            List<Integer> y=new ArrayList<>();
            y.add(1);
            for (int j = 0; j < x.size()-1; j++) {
                y.add(x.get(j)+x.get(j+1));
            }
            y.add(1);
            r.add(y);
            x=y;
        }
        System.out.println(r);

        System.out.println(r.get(3));
    }
}

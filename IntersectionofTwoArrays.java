package prasoon.odessa;

import java.util.ArrayList;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        int a[]={3,1,2,2,1,3};
        int b[]={2,3};
        ArrayList<Integer> ar=new ArrayList<>();
      int  n1=a.length,n2=b.length;
      if(n1>n2)
      {
          for (int i = 0; i < n1-1; i++) {
              for (int j = 0; j < n2-1; j++) {
                  if(a[i]==b[j])
                  {
                      ar.add(a[i]);
                      break;
                  }
              }
          }
      }
      System.out.println(ar);
    }
}

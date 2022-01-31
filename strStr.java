package prasoon.odessa;

public class strStr {
    public static void main(String[] args) {
        String h = "mississippi";

        String n = "issipi";
        int s = 0;
        int index = -1;
        int z=h.length();
        int y=n.length();

        if (h.equals(n) || n.length()==0)
            System.out.println(0);
        if(n.length()>h.length())
            System.out.println(-1);
        else {
            for (int i = 0; i < z-y; i++) {
                int j=0;
                for (j = 0; j < y; j++) {
                    if (h.charAt(i+j)!=n.charAt(j))
                        break;
                }
                if (j==y)
                    System.out.println(i);
                return;
            }
        }
    }
}

package prasoon.odessa;

public class defangIPaddr {
    public static void main(String[] args) {
        String address="1.1.1.1",a="";
       int c=0;
//        for (int i = 0; i < address.length(); i++) {
//            if (address.charAt(i)=='.')
//            {
//                a+="[.]";
//            }
//            else{
//                a+=address.charAt(i);
//            }
//        }
//        System.out.println(a);
        address.replace(".","[.]");
        System.out.println( address.replace(".","[.]"));
    }
}

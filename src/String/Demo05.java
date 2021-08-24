package String;

import java.util.Locale;

public class Demo05 {
    public static void main(String[] args) {

        //String s = new String("ABC");


        String str = "Thingking in java 是本好书";
        String s = str.toUpperCase();
        String c = str.substring(5);
        System.out.println(c);
        String s1 = str.substring(9,str.length());
        System.out.println(s1);
        System.out.println(str);
        System.out.println(s);


        String d = str.toLowerCase();
        System.out.println(d);

    }
}

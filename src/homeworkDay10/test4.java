package homeworkDay10;

import java.util.*;

public class test4 {
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();

       for (int i =0;i<10;i++) {
           int z = (int)(Math.random()*100+1);
           c.add(z);
       }
        System.out.println(c);
        Collections.reverse(c);
        System.out.println(c);

    }
}

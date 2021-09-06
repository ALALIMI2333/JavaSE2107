package homeworkDay10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class test3 {
    public static void main(String[] args) {

        Collection c1 = new HashSet();
        for (int x=0;x<10;x++){
            int b = (int) (Math.random()*100+1);
            c1.add(b);
        }

        System.out.println(c1);
    }
}

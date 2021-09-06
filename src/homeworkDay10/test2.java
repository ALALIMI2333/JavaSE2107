package homeworkDay10;

import java.util.ArrayList;
import java.util.Collection;

public class test2 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");

        for (String v : c){
            System.out.println(v);
        }
    }
}

package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionToArrayDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        System.out.println("集合:"+c);

        //Object[] array= c.toArray();
        String[] array = c.toArray(new String[c.size()]);
        System.out.println("数组:"+ Arrays.toString(array));
    }
}

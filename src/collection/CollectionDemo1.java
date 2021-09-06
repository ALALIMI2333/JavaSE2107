package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        int b =c.size();
        System.out.println(b);
        System.out.println(c);
        boolean isEmpty = c.isEmpty();
        System.out.println("当前集合是否一个空集"+isEmpty);
        c.remove("one");
        System.out.println(c);
        c.clear();
        System.out.println(c);
        int b1 =c.size();
        System.out.println(b1);

         isEmpty = c.isEmpty();
        System.out.println("当前集合是否一个空集"+isEmpty);
    }
}

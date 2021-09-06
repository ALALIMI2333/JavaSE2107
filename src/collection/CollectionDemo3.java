package collection;

import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Collection c = new HashSet();
        c.add(new Point(1,2));
        System.out.println(c);
        Point p = new Point(1,2);
        c.add(p);
        System.out.println(c);

        Point p2 = new Point(1,2);
        boolean contains = c.contains(p2);
        System.out.println("是否包含该元素:"+contains);

        c.remove(p2);
        System.out.println(c);
    }
}

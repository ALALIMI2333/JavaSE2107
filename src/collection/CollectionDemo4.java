package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("C");
        c1.add("Java");
        c1.add("C++");
        System.out.println("c1:"+c1);

        Collection c2 = new ArrayList();
        c2.add("android");
        c2.add(".net");
        c2.add("ios");
        c2.add("Java");
        System.out.println("c2"+c2);

        c1.addAll(c2);
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);

        Collection c3 = new HashSet();
        c3.add("Fultter");
        c3.add(".net");
        System.out.println("c3:"+c3);

        c3.addAll(c1);
        System.out.println("c3:"+c3);

        Collection c4 = new ArrayList();
        c4.add("ios");
        c4.add("Java");
       // c4.add("php");

        System.out.println("c4:"+c4);
        boolean contains = c2.containsAll(c4);
        System.out.println("包含所有元素:"+contains);

        c2.removeAll(c4);
        System.out.println("c1:"+c1);
        System.out.println("c4:"+c4);

    }
}

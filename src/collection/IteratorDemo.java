package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("one");
        c.add("#");
        c.add("two");
        c.add("#");
        c.add("three");
        c.add("#");
        c.add("four");
        c.add("#");
        c.add("five");
        System.out.println(c);

        Iterator it = c.iterator();
       while (it.hasNext()){
           String str =(String) it.next();
           if ("#".equals(str)){
               it.remove();
           }
           //System.out.println(c);
           System.out.println(str);
       }
        System.out.println(c);
        //System.out.println(it);

    }
}

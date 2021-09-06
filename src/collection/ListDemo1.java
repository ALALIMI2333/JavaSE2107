package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);
/*
        for (int i=0;i<list.size()/2;i++){
            String e = list.get(i);
            e = list.set(list.size()-1-i,e);
            list.set(i,e);
        }
        System.out.println(list);*/
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        //System.out.println(a.get(list[]));
        //System.out.println(a);
       /* List<String> c = new ArrayList();
        //c.re
        String str = list.get(2);
        System.out.println(str);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


        System.out.println(list);
        String old = list.set(2,"six");
        System.out.println(list);
        System.out.println(old);
        */

    }
}

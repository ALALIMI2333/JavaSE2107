package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jerry");
        list.add("Jack");
        list.add("James");
        list.add("rose");
        list.add("kobe");
        list.add("Ada");
        list.add("Black");
        list.add("Hanmeimei");
        list.add("lilei");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

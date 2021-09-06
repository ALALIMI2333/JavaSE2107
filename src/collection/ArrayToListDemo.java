package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] array ={"one","two","three","four","five"};
        System.out.println("数组:"+ Arrays.toString(array));

        List<String> list =Arrays.asList(array);
        System.out.println("集合:"+list);
        Collections.reverse(list);
        System.out.println(list);
        list.set(1,"six");
        System.out.println("集合:"+list);

        System.out.println("数组:"+Arrays.toString(array));
       // list.add("seven");

        List<String> list2 = new ArrayList<>(list);
        list2.add("seven");
        System.out.println("list2:"+list2);
    }
}

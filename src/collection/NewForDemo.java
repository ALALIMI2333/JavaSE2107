package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class NewForDemo {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        for (int i=0;i<array.length;i++){
            String str = array[i];
            System.out.println(str);
        }
        for (String str : array){
            System.out.println(str);
        }

        Collection<String> c = new ArrayList<>();
        c.add("一");
        c.add("二");
        c.add("三");
        c.add("四");
        c.add("五");

        for (String e : c){
            System.out.println(e);
        }

        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
    }
}

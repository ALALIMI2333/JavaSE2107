package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListDemo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传寄");
        list.add("小泽老师");
        System.out.println(list);

        String str = "";
        for (int i=list.size()-1;i<=0;i--){
            str = list.get(i);
            //System.out.println(str);
            list.set(i,str);
            //list.get(i);
           // System.out.println(list);
        }
        //Collections.sort(list,c);
        Collections.sort(list,(o1, o2) -> o1.length()-o2.length());
        System.out.println(list);
    }
}

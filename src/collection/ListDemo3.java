package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        System.out.println(list);

        //List<Integer> e = list.stream().dropWhile(list.size()!=(019));

        List<Integer> subList12 = list.subList(3,8);
        System.out.println(subList12);

        for (int i=0;i<subList12.size();i++){
            int e = subList12.set(i,subList12.get(i)*10);
            //System.out.println(e);
        }
        System.out.println(subList12);


        List<Integer> list1 = new ArrayList<>();
        for (int i=0;i<100;i+=10){
            list1.add(i);
        }
        System.out.println(list1);
        List<Integer> sublist1 = list1.subList(3,8);
        System.out.println(sublist1);

        list.subList(2,9).clear();
        System.out.println(list);



    }
}

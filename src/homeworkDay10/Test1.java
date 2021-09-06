package homeworkDay10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Iterator it = list.iterator();
        for (int i =1;i<10;i++){
            list.add(i);

        }
        System.out.println("集合:"+list);

    }
}

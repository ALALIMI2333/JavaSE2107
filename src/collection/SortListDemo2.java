package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(1,2));
        list.add(new Point(9,8));
        list.add(new Point(3,4));
        list.add(new Point(12,7));
        list.add(new Point(5,6));
        list.add(new Point(0,2));
        System.out.println(list);
 /*       Comparator<Point> c = new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                int len1= o1.getX()*o1.getX()+o1.getY()*o1.getY();
                int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
                return len1-len2;
            }
        };
        Collections.sort(list,c);*/
        Collections.sort(list,(o1 ,o2)-> o1.getX()*o1.getX()+o1.getY()*o1.getY()-
                        o2.getX()*o2.getX()-o2.getY()*o2.getY()
                // return len1-len2;

        );
        System.out.println(list);

    }
}

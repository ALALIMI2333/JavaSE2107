package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);

        String str = queue.poll();
        System.out.println(str);
        System.out.println(queue);
        String str1 = queue.poll();
        System.out.println(str1);
        System.out.println(queue);

        str = queue.peek();
        System.out.println(str);
        System.out.println(queue);

        int size = queue.size();
        System.out.println("size:"+size);

        for (String s : queue){
            System.out.println(s);
        }

        while (queue.size()>0){
            String s = queue.poll();
            System.out.println(s);
        }
        System.out.println(queue);

    }
}

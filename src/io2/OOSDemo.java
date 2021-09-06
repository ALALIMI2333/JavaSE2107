package io2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        User user = new User("刘伧俗","123456",60,"ddd");
        FileOutputStream fos = new FileOutputStream("name.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(user);
        System.out.println("写出完毕");
        oos.close();
    }
}

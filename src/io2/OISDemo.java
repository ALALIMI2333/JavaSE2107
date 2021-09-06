package io2;

import java.io.*;

public class OISDemo {
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream("name.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        User user = (User)ois.readObject();
        System.out.println(user);
        ois.close();
    }
}

package io2;

import java.io.FileOutputStream;
import java.io.IOException;

public class AutoCloseableDemo {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("ff.dat")){
            fos.write(1);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

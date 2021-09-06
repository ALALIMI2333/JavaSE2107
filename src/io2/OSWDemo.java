package io2;

import java.io.*;

public class OSWDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ows.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");

        String str = "苍老师：吃个挑挑~";
        osw.write(str);
        osw.write("嗯~~好凉凉");
        System.out.println("写出完毕！");
        osw.close();
    }
}

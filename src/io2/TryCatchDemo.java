package io2;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了。。。");
        try {
            //String str = null;
            //String str = "abc";
            //String str = "";
            String str ="123";
            System.out.println(str.length());
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            str.getBytes("UFT-8");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }catch (NullPointerException|StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针，并且解决完毕");
        }/*catch (StringIndexOutOfBoundsException e){
            System.out.println("出现了空指针，并且解决完毕");
        }*/catch (NumberFormatException e){
            System.out.println("数字格式异常!");
        } catch (UnsupportedEncodingException e) {
            System.out.println("不支持的字符集名字");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("反正就是出了个错!");
        }
        System.out.println("程序结束了");

    }
}

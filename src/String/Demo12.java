package String;

public class Demo12 {
    public static void main(String[] args) {
        String str = "Thinking in Java 是本好书";

        int index =str.indexOf("Java");
        index = str.indexOf("in",7);
        //index = str.indexOf('i');
        //index = str.indexOf("java");
        //index = str.indexOf("MOHAMMED");
        System.out.println(index);
    }
}

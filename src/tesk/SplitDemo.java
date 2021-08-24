package tesk;

public class SplitDemo {
    public static void main(String[] args) {
        String str = "1,老王,15610101234,tom@tedu.cu";
        String[] data = str.split(",");
        System.out.println(data[1]);
        System.out.println(data[2]);
        str = "2,老李,,tom@tedu.cn";
        data = str.split(",");
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data.length);


        str = "2,老李,,tom@tedu.cn,,,,,,,,,,,,,,,,,,,,";
        data = str.split(",");
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
        System.out.println(data.length);

    }
}

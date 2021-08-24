package tesk;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String str = "aaa2bbb4fff9fff##";
        String s = str.replaceAll("\\e",",");
        System.out.println(s);
    }
}

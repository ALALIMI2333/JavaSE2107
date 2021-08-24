package String;

public class Demo10 {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");
        String s4 = "Abc";
        String s5 = "Abc";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s5.toUpperCase().equals(s1));
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}

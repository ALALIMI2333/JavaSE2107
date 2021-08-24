package String;

public class Demo04 {

    //public static final String
    public static final String s = "ABC";

    public static void main(String[] args) {



       // public static final String na
        String s1 = "ABC";
        String s2 = "ABCF";

        System.out.println(s1.equals(s2));

        System.out.println(s1.compareToIgnoreCase(s2));

        String s3 = new String("ABC");
        System.out.println(s1==s3);
        System.out.println(s3.equals(s1));
    }


}

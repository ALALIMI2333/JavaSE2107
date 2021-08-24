package tesk;

public class MathesDemo2 {
    public static void main(String[] args) {

        String date = "202107 30";
        System.out.println("\\d");
        boolean b = date.matches("\\d\\d\\d\\d\\d\\d\\s\\d\\d");
        System.out.println(b);
    }
}

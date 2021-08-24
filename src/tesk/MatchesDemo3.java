package tesk;

public class MatchesDemo3 {
    public static void main(String[] args) {

        String name = "Andy_Wang";
        boolean b = name.matches("\\w{8,20}");
        System.out.println(b);
    }
}

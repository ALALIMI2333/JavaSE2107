package tesk;

public class MatchesDemo4 {
    public static void main(String[] args) {





        String mobile =  "156   0010        1234";
        boolean b = mobile.matches("\\d{3}\\s*\\d{4}\\s*\\d{4}");
        System.out.println(b);


        String mm = "008613639360830";
        boolean bb = mm.matches("(0086)+\\d{11}");
        System.out.println(bb);


        String s = "233233233233233233";
        boolean d = s.matches("\\d{11}");
        System.out.println(d);

    }
}

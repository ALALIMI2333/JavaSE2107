package tesk;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("天气不错");
        builder.append("!")
                .insert(0,"今天")
                .setCharAt(0,'昨');
        builder.reverse();
        String str = builder.toString();
        System.out.println(str);

    }
}

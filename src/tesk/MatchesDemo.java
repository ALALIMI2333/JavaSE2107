package tesk;

public class MatchesDemo {
    public static void main(String[] args) {
        /**
         * 测试正则表达式
         * */
        String str = "我去";

        boolean b = str.matches("我[去草艹]");
        System.out.println(b);

        str = "我来";//被检查的字符串
        b = str.matches("我[来草艹]");//正则规则
        System.out.println(b);

        str = "hi i am";
        b = str.matches("h[ i am will go]");
        System.out.println(b);

        //测试两个字符的变量名规则:[a-zA-Z_$][a-zA-Z0-9_$]
        String name = "5B";
        b = name.matches("[a-zA-Z_$][a-zA-z0-9_$]");
        System.out.println(b);

    }
}

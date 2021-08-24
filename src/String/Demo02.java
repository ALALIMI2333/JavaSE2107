package String;

public class Demo02 {
    public static void main(String[] args) {
        /*
        *字符串API方法
        *字符串中每个字符都有下标序号，下表序号从0开始
        * charAt（index）返回字符串中指定位置
         */

       String s = "ABC";
        char c = s.charAt(1);
        int l = s.length();
        System.out.println(c);
        System.out.println(l);

        /*
        *charAt和length配合可以实现字符串中字符的遍历
        * 例子：统计一个否则、字符串中全部英文大写字符个数
         */
        String str = "Thingking In Java 是一本好书";
        int sum = 0;
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch>='A'&&ch<='Z') {
                sum++;
            }

        }
        System.out.println(sum);
    }
}

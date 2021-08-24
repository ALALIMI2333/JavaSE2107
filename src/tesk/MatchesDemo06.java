package tesk;

public class MatchesDemo06 {
    public static void main(String[] args) {
        /**
         * 检查一个邮箱是否符合规则
         * 邮箱规则：\w+@\w+(\.\w{2,})+
         * \w+匹配名字部分，表示一个以上单词字符
         * @ 匹配邮箱地址的人名和服务器名分隔符@
         * \w+匹配服务器名称
         * \.\w{2,}匹配服务器名称后
         *
         * **/


        String email = "liucangsong@tedu.com.cnn";
        boolean match = email.matches("\\w+@\\w+(\\.\\w{2,})+");
        if (match){
            System.out.println("这个邮箱地址写正确");
        }else {
            System.out.println("邮箱地址错误");
        }
    }
}

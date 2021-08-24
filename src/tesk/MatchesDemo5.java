package tesk;

public class MatchesDemo5 {
    public static void main(String[] args) {
        String file = "demo.jpg";
        boolean match = file.matches(".+\\.jpg");
        if (match){
            System.out.println("这个是jpg文件");
        }else {
            System.out.println("这不是jpg文件");
        }
    }
}

package tesk;

public class Test2 {
    public static void main(String[] args) {
        String fileName = "123.PNG";
        boolean check = fileName.toLowerCase().endsWith(".png");
        if (check){
            System.out.println("是PNG图片！");
        }
        else {
            System.out.println("不是PNG图片！");
        }
    }
}

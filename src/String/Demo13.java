package String;

public class Demo13 {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder();
        buf.append("范老师");
        buf.append("早晨起来");
        buf.append("干了惊天动地大事情");
        buf.append("!");
        buf.insert(1,"传奇");
        buf.delete(3,3+2);
        System.out.println(buf);
    }
}

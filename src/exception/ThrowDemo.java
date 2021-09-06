package exception;

public class ThrowDemo {
    public static void main(String[] args) throws Exception {
        Person p = null;
        try {
            p = new Person();
            p.setAge(10000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄"+p.getAge()+"岁");
    }
}

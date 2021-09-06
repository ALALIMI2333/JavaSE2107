package tesk;

class Super {
    public static void m1() {
        System.out.println("m1 in Super");
    }
    public void m2() {
        System.out.println("m2 in Super");
    }
}
class Sub extends Super {
    public static void m1() {
        System.out.println("m1 in Sub");
    }
    public void m2() {
        System.out.println("m2 in Su");
    }
}
public class TestMain {
    public static void main(String args[]) {
        Super sup = new Sub();
        sup.m1();
        sup.m2();
        Sub sub = (Sub) sup;
        sub.m1();
        sub.m2();
    }
}
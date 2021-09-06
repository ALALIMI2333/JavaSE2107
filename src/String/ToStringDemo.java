package String;

public class ToStringDemo {
    public static void main(String[] args) {
        Ship s = new Ship();
        System.out.println(s);

        Beat b = new Beat();
        System.out.println(b.toString());
        System.out.println(b.toInt());


        Bomb bomb = new Bomb(50,60,80,60);
        System.out.println(bomb);


    }

}
class Bomb{
    private double x;
    private double y;
    private double w;
    private double h;

    @Override
    public String toString() {
        return "Bomb{" +
                "x=" + x +
                ", y=" + y +
                ", w=" + w +
                ", h=" + h +
                '}';
    }

    public Bomb(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

}

class Ship{

    @Override
    public String toString() {
        return super.toString();
    }
}
class Beat{

    @Override
    public String toString() {
        return "小船";
    }

    public int toInt(){
        return 55;
    }
}

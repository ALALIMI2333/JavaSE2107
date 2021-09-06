 package String;

import java.util.Objects;

public class EqualsDemo {
    public static void main(String[] args) {
        Point p1 = new Point(4,5);
        Point p2 = new Point(4,5);
        System.out.println(p1==p2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

    }
}

class Point{
    int x;
    int y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }




}

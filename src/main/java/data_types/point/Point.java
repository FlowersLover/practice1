package data_types.point;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class
Point {
    public double x;
    public double y;
    public double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}

class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2, 3);
        Point point1 = new Point(4, 5, 6);
        Point point2 = new Point(7, 8, 9);
    }

}

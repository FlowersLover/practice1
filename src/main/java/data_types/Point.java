package data_types;

import static java.lang.Math.sqrt;

public class
Point {
    public double x = 1;
    public double y = 1;
    public double z = 1;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double length(){
        return sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
}

class PointTest {
    public static void main(String[] args) {
        Point point = new Point(1, 2, 3);
        Point point1 = new Point(4, 5, 6);
        Point point2 = new Point(7, 8, 9);
    }

}

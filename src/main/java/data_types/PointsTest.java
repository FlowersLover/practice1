package data_types;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointsTest {
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    public static final double NaN = 0.0 / 0.0;

    public static final double aproximation = 0.000005;

    @Test
    public void testSum() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.sum(point, point1).x, 5.8);
        assertEquals(Points.sum(point, point1).y, 8.0);
        assertEquals(Points.sum(point, point1).z, 4.2);
        Point point2 = new Point(1, 2, 3);
        Point point3 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        assertEquals(Points.sum(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.sum(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.sum(point2, point3).z, NaN);
    }

    @Test
    public void testSubtract() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.subtract(point, point1).x, -2.4, aproximation);
        assertEquals(Points.subtract(point, point1).y, -2.4, aproximation);
        assertEquals(Points.subtract(point, point1).z, 3.6, aproximation);
        Point point2 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        Point point3 = new Point(1, 2, 3);
        assertEquals(Points.subtract(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.subtract(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.subtract(point2, point3).z, NaN);
    }

    @Test
    public void testMultiply() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.multiply(point, point1).x, 6.97, aproximation);
        assertEquals(Points.multiply(point, point1).y, 14.56, aproximation);
        assertEquals(Points.multiply(point, point1).z, 1.17, aproximation);
        Point point2 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        Point point3 = new Point(1, 2, 3);
        assertEquals(Points.multiply(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.multiply(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.multiply(point2, point3).z, NaN);
    }

    @Test
    public void testDivide() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.divide(point, point1).x, 0.414634 , aproximation);
        assertEquals(Points.divide(point, point1).y, 0.538461, aproximation);
        assertEquals(Points.divide(point, point1).z, 13, aproximation);
        Point point2 = new Point(-1, 1, 0);
        Point point3 = new Point(0, 0, 0);
        assertEquals(Points.divide(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).z, NaN);
    }

    @Test
    public void testEnlarge() {
        double constant=12.3;
        Point point = new Point(656.56, 52.08, 20.05);
        assertEquals(Points.enlarge(point, constant).x, 8075.688 , aproximation);
        assertEquals(Points.enlarge(point, constant).y, 640.584, aproximation);
        assertEquals(Points.enlarge(point, constant).z, 246.615, aproximation);

        double constant1 = 45.6;
        Point point2 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        assertEquals(Points.enlarge(point2, constant1).x, NEGATIVE_INFINITY , aproximation);
        assertEquals(Points.enlarge(point2, constant1).y, POSITIVE_INFINITY, aproximation);
        assertEquals(Points.enlarge(point2, constant1).z, NaN, aproximation);
    }

    @Test
    public void testLength() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.divide(point, point1).x, 0.414634 , aproximation);
        assertEquals(Points.divide(point, point1).y, 0.538461, aproximation);
        assertEquals(Points.divide(point, point1).z, 13, aproximation);
        Point point2 = new Point(-1, 1, 0);
        Point point3 = new Point(0, 0, 0);
        assertEquals(Points.divide(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).z, NaN);

    }

    @Test
    public void testOpposite() {
        Point point = new Point(656.56, 52.08, 20.05);
        assertEquals(Points.opposite(point).x, -656.56 , aproximation);
        assertEquals(Points.opposite(point).y, -52.08, aproximation);
        assertEquals(Points.opposite(point).z, -20.05, aproximation);
        Point point2 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        assertEquals(Points.opposite(point2).x, -NEGATIVE_INFINITY , aproximation);
        assertEquals(Points.opposite(point2).y, -POSITIVE_INFINITY, aproximation);
        assertEquals(Points.opposite(point2).z, NaN, aproximation);
    }

    @Test
    public void testInverse() {
        Point point = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.inverse(point).x, 1/4.1 , aproximation);
        assertEquals(Points.inverse(point).y, 1/5.2, aproximation);
        assertEquals(Points.inverse(point).z, 1/0.3, aproximation);
        Point point2 = new Point(NEGATIVE_INFINITY, POSITIVE_INFINITY, NaN);
        assertEquals(Points.inverse(point2).x,-0.0 );
        assertEquals(Points.inverse(point2).y, 0.);
        assertEquals(Points.inverse(point2).z, NaN);

    }

    @Test
    public void testScalarProduct() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.scalarProduct(point, point1), 0.414634 , aproximation);
        assertEquals(Points.scalarProduct(point, point1), 0.414634 , aproximation);
        Point point2 = new Point(-1, 1, 0);
        Point point3 = new Point(0, 0, 0);
        assertEquals(Points.scalarProduct(point2, point3), NEGATIVE_INFINITY);
        assertEquals(Points.scalarProduct(point2, point3), POSITIVE_INFINITY);
    }

    @Test
    public void testVectorProduct() {
        Point point = new Point(1.7, 2.8, 3.9);
        Point point1 = new Point(4.1, 5.2, 0.3);
        assertEquals(Points.divide(point, point1).x, 0.414634 , aproximation);
        assertEquals(Points.divide(point, point1).y, 0.538461, aproximation);
        assertEquals(Points.divide(point, point1).z, 13, aproximation);
        Point point2 = new Point(-1, 1, 0);
        Point point3 = new Point(0, 0, 0);
        assertEquals(Points.divide(point2, point3).x, NEGATIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).y, POSITIVE_INFINITY);
        assertEquals(Points.divide(point2, point3).z, NaN);
    }
    @Test
    public void testEqualsApproximately(){

    }
}
package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Assert;

public class PointTest extends TestCase {

    public void testDistance() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testDistance1() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testDistance2() {
        double expected = 3.60;
        int x1 = 2;
        int y1 = -2;
        int x2 = 0;
        int y2 = -5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testDistance3() {
        double expected = 4.24;
        int x1 = -3;
        int y1 = 0;
        int x2 = 0;
        int y2 = -3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
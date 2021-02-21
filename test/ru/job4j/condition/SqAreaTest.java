package ru.job4j.condition;

import junit.framework.TestCase;
import org.junit.Assert;

public class SqAreaTest extends TestCase {

    public void testSquare() {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testSquare1() {
        double expected = 1.17;
        int p = 5;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
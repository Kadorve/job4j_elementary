package ru.job4j.calculator;

import junit.framework.TestCase;
import org.junit.Assert;

public class FitTest extends TestCase {

    public void testMan180Then92() {
        short in = 173;
        double expected = 83.95;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void testWoman163Then61() {
        short in = 163;
        double expected = 60.95;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
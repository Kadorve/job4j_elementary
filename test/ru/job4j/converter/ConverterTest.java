package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest extends TestCase {

    public void testRubleToEuro() {
        int in1 = 140;
        int expected1 = 2;
        int out1 = Converter.rubleToEuro(in1);
        Assert.assertEquals(expected1, out1);
    }

    public void testRubleToDollar() {
        int in2 = 300;
        int expected2 = 5;
        int out2 = Converter.rubleToDollar(in2);
        Assert.assertEquals(expected2, out2);
    }
}








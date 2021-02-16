package ru.job4j.calculate;

import junit.framework.TestCase;
import org.junit.Assert;

public class X2Test extends TestCase {

    public void testCalc() {
        //Входные параметры
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        //ожидаемое значениею Это всегда одна переменная.
        int expected = 40;
        //вызов метода, который хотим проверить.
        //Результат вычисления. Это всегда одна переменная.
        int rs1 = X2.calc(a, b, c, x);
        //Сравнение полученного значения с ожидаемым.
        Assert.assertEquals(expected, rs1);
    }

    public void testCalc1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int rs2 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rs2);
    }

    public void testCalc2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int rs3 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rs3);
    }

    public void testCalc3() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rs4 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rs4);
    }

    public void testCalc4() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int rs5 = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rs5);
    }
}
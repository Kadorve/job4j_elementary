package ru.job4j.calculator;

public class MathFunc {

    //Само тело метода func1 взято из исходников
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.func1(100);
        System.out.println(result1);

    }
}

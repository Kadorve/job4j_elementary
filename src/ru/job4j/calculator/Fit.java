package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double idealWeight = (height - 100) * 1.15;
        return idealWeight;
    }

    public static double womanWeight(short height) {
        double idealWeight = (height - 110) * 1.15;
        return idealWeight;

    }

    public static void main(String[] args) {
        short height = 173;
        double man = Fit.manWeight(height);
        System.out.println("Man 173 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Man 173 is " + woman);
    }
}

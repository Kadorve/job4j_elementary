package ru.job4j;

public class converter {

    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main (String[] args) {
        int euro = converter.rubleToEuro(140);
        int dollar = converter.rubleToDollar(300);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollars.");
    }
}

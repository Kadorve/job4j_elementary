package ru.job4j;

public class converter {

    public static int rubleToEuro (int value) {
        int rs1 = value / 70;
        return rs1;
    }

    public static int rubleToDollar(int value) {
        int rs2 = value / 60; //формула перевода рублей в доллары
        return rs2;
    }

    public static void main (String[] args) {
        int euro = converter.rubleToEuro(140);
        int dollar = converter.rubleToDollar(300);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("300 rubles are " + dollar + " dollars.");
    }
}

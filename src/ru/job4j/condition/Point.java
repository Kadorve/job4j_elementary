package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        return Math.sqrt(Math.pow(first, 2) + Math.pow(second, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 3, 2, 5);
        System.out.println("result (1, 3) to (2, 5) " + result);
    }
}

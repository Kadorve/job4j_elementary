package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean maxOf2 = left > right;
        return maxOf2 ? left : right;
    }

    public static void main(String[] args) {
        int result = Max.max(3, 3);
        System.out.println(result);
    }
}

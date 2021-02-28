package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        for (int indexL = 0; indexL < left.length; indexL++) {
            for (int indexR = 0; indexR < right.length; indexR++) {
                if (left[left.length - 1] == right[right.length - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}

package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < array[start]) {
                min = array[index];
                array[index] = array[start];
                array[start] = min;
            }
        }
        return min;
    }
}

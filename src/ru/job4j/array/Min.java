package ru.job4j.array;

public class Min {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5};
        int min = array[0];
        System.out.println(min);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[0] > array[index]) {
                min = array[index];
                array[index] = array[0];
                array[0] = min;
            }
        }
        return  min;
    }
}

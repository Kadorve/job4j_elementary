package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[i];
                    index = j;
                }
            }
            int temp = data[i];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
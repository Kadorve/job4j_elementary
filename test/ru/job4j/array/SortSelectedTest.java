package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOf3() {
        int[] input = {6, 4, -1};
        int[] result = SortSelected.sort(input);
        int[] expect = {-1, 4, 6};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOf5() {
        int[] input = {2, 1, 0, -1, -2};
        int[] result = SortSelected.sort(input);
        int[] expect = {-2, -1, 0, 1, 2};
        assertThat(result, is(expect));
    }
}
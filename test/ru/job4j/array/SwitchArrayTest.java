package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@SuppressWarnings("checkstyle:WhitespaceAround")
public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 2, 3, 1};
        int[] rst = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenSwap3To0() {
        int[] input = {4, 2, 3, 1, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] rst = SwitchArray.swap(input, 3, 0);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenSwap3To4() {
        int[] input = {2, 1, 0, -2, -1};
        int[] expected = {2, 1, 0, -1, -2};
        int[] rst = SwitchArray.swap(input, 3, input.length - 1);
        assertThat(rst, is(expected));
    }
}
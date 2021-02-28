package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHasMinus1Then2() {
        int[] input = {3, 5, -1, 7};
        int value = -1;
        int result = FindLoop.indexOf(input, value);
        int expected = 2;
        assertThat(result, is(expected));
    }

    @Test
    public void whenArrayHas3ThenMinus1() {
        int[] input = {1, 2, 4, 5};
        int value = 3;
        int result = FindLoop.indexOf(input, value);
        int expected = -1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenFind3() {
        int[] input = {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind() {
        int[] input = {5, 2, 10, 2, 4, 3};
        int value = 3;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
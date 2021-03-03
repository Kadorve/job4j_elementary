package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SkipNegativeTest {

    @Test
    public void skip() {
        int[][] in = {
                {1, -2},
                {1, 2}
        };
        int[][] expect = {
                {1, 0},
                {1, 2}
        };
        int[][] rst = SkipNegative.skip(in);
        assertThat(rst, is(expect));
    }

    @Test
    public void skip1() {
        int[][] in = {
                {1, -2},
                {1, 2, 3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] expect = {
                {1, 0},
                {1, 2, 3},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        int[][] rst = SkipNegative.skip(in);
        assertThat(rst, is(expect));
    }
}
package ru.job4j.array;

import org.junit.Test;

import javax.sound.sampled.Line;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void whenSingle() {
        int[][] in = {{10}};
        int expect = 10;
        int rst = MatrixSum.sum(in);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenTwo() {
        int[][] in = {
                {1, 2},
                {1, 2}
        };
        int expect = 6;
        int rst = MatrixSum.sum(in);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenThree() {
        int[][] in = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expect = 7;
        int rst = MatrixSum.sum(in);
        assertThat(rst, is(expect));
    }
}
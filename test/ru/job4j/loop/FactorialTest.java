package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenInput5Then120() {
        int rsl = Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}
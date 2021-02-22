package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        String expected = "Исходное число делится на 6.";
        assertThat(DivideBySix.checkNumber(24), is(expected));
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        String expected = "Исходное число делится на 3, но не является чётным.";
        assertThat(DivideBySix.checkNumber(9), is(expected));
    }

    @Test
    public void whenNoDivideBy3AndEven() {
        String expected = "Исходное число не делится на 3, но является чётным.";
        assertThat(DivideBySix.checkNumber(4), is(expected));
    }

    @Test
    public void whenNoDivideDy3AndNotEven() {
        String expected = "Исходное число не делится на 3 и не является чётным.";
        assertThat(DivideBySix.checkNumber(13), is(expected));
    }
}
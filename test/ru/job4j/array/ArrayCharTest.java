package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'E'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'I'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}
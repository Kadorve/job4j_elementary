package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] post = {'L', 'O'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] post = {'L', 'A'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}
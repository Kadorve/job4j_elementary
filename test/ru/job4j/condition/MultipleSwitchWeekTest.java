package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void when1Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Понедельник"), is(1));
        assertThat(MultipleSwitchWeek.nameOfDay("Monday"), is(1));
    }

    @Test
    public void when2Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Вторник"), is(2));
        assertThat(MultipleSwitchWeek.nameOfDay("Tuesday"), is(2));
    }

    @Test
    public void when3Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Среда"), is(3));
        assertThat(MultipleSwitchWeek.nameOfDay("Wednesday"), is(3));
    }

    @Test
    public void when4Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Четверг"), is(4));
        assertThat(MultipleSwitchWeek.nameOfDay("Thursday"), is(4));
    }

    @Test
    public void when5Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Пятница"), is(5));
        assertThat(MultipleSwitchWeek.nameOfDay("Friday"), is(5));
    }

    @Test
    public void when6Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Суббота"), is(6));
        assertThat(MultipleSwitchWeek.nameOfDay("Saturday"), is(6));
    }

    @Test
    public void when7Day() {
        assertThat(MultipleSwitchWeek.nameOfDay("Воскресенье"), is(7));
        assertThat(MultipleSwitchWeek.nameOfDay("Sunday"), is(7));
    }

    @Test
    public void whenSomethingElse() {
        assertThat(MultipleSwitchWeek.nameOfDay(""), is(-1));
    }

}
package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SwitchWeekTest {

    @Test
    public void when1Day() {
        assertThat(SwitchWeek.nameOfDay(1), is("Понедельник"));
    }

    @Test
    public void when2Day() {
        assertThat(SwitchWeek.nameOfDay(2), is("Вторник"));
    }

    @Test
    public void when3Day() {
        assertThat(SwitchWeek.nameOfDay(3), is("Среда"));
    }

    @Test
    public void when4Day() {
        assertThat(SwitchWeek.nameOfDay(4), is("Четверг"));
    }

    @Test
    public void when5Day() {
        assertThat(SwitchWeek.nameOfDay(5), is("Пятница"));
    }

    @Test
    public void when6Day() {
        assertThat(SwitchWeek.nameOfDay(6), is("Суббота"));
    }

    @Test
    public void when7Day() {
        assertThat(SwitchWeek.nameOfDay(7), is("Воскресенье"));
    }

    @Test
    public void whenSomethingElse() {
        assertThat(SwitchWeek.nameOfDay(8), is("Ошибка"));
    }
}
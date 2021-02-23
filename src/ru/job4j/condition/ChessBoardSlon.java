package ru.job4j.condition;

public class ChessBoardSlon {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int deltax = Math.abs(x2 - x1);
        int deltay = Math.abs(y2 - y1);
        if (deltax == deltay) {
            rsl = deltax;
            rsl = (rsl != 0) ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(way(7, 0, 0, 7));
    }
}

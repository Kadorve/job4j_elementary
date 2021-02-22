package ru.job4j.condition;

public class CinemaPermission {
    public static void permission(boolean allowByParents, boolean hasMoney) {
        if (allowByParents && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    @SuppressWarnings("checkstyle:WhitespaceAfter")
    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}

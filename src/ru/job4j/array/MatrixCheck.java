package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                return false;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                return false;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rst = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X') {
                rst[index] = board[index][index];
            }
        }
        return rst;
    }
    
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (monoHorizontal(board, index) || monoVertical(board, index)) {
                    result = true;
                    break;
            }
        }
        return result;
    }
}

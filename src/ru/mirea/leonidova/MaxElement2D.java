package ru.mirea.leonidova;

public class MaxElement2D {
    public static <E extends Comparable<E>> E findMax(E[][] matrix) {
        if (matrix == null || matrix.length == 0) throw new IllegalArgumentException("Matrix is empty");
        E max = matrix[0][0];
        for (E[] row : matrix) {
            for (E element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }
}
package ru.mirea.leonidova;

public class MaxElement {
    public static <E extends Comparable<E>> E findMax(E[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array is empty");
        E max = array[0];
        for (E element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}
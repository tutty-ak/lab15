package ru.mirea.leonidova;

import java.util.ArrayList;
import java.util.Collections;

public class MaxInList {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        if (list == null || list.isEmpty()) throw new IllegalArgumentException("List is empty");
        return Collections.max(list);
    }
}

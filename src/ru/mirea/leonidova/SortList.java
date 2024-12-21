package ru.mirea.leonidova;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }
}

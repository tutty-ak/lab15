package ru.mirea.leonidova;
import java.util.Arrays;

public class GenericStack<E> {
    private E[] array;   // Массив для хранения элементов
    private int size;    // Текущий размер стека

    // Конструктор
    @SuppressWarnings("unchecked")
    public GenericStack() {
        array = (E[]) new Object[10]; // Изначальный размер массива 10
        size = 0;
    }

    // Возвращает количество элементов в стеке
    public int getSize() {
        return size;
    }

    // Возвращает верхний элемент стека без удаления
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return array[size - 1];
    }

    // Добавляет элемент в стек
    public void push(E o) {
        if (size == array.length) {
            ensureCapacity(); // Увеличиваем размер массива, если он заполнен
        }
        array[size++] = o;
    }

    // Удаляет и возвращает верхний элемент стека
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        E o = array[--size];
        array[size] = null; // Освобождаем ссылку на объект
        return o;
    }

    // Проверяет, пуст ли стек
    public boolean isEmpty() {
        return size == 0;
    }

    // Увеличивает размер массива вдвое
    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }

    @Override
    public String toString() {
        return "стек: " + Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }

    // Тестирование стека
    public static void main(String[] args) {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack); // стек: [1, 2, 3, 4, 5]

        System.out.println("Верхний элемент: " + stack.peek()); // 5

        stack.pop();
        System.out.println("После удаления элемента: " + stack); // стек: [1, 2, 3, 4]

        for (int i = 6; i <= 15; i++) {
            stack.push(i);
        }
        System.out.println("После добавления новых элементов: " + stack);
        System.out.println("Размер стека: " + stack.getSize()); // 14
    }
}
package ru.mirea.leonidova;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericStack2<E> extends ArrayList<E> {

    // Добавляет элемент в стек
    public void push(E o) {
        this.add(o);
    }

    // Удаляет и возвращает верхний элемент стека
    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return this.remove(size() - 1);
    }

    // Возвращает верхний элемент стека без удаления
    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return this.get(size() - 1);
    }

    // Проверяет, пуст ли стек
    public boolean isEmpty() {
        return super.isEmpty();
    }

    // Тестовая программа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericStack2<String> stack = new GenericStack2<>();

        // Запрос у пользователя пяти строк
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack.push(input); // Добавляем строку в стек
        }

        // Вывод строк в обратном порядке
        System.out.println("\nСтроки в обратном порядке:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        scanner.close();
    }
}

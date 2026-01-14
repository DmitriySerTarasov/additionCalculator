package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            // Ввод первого числа
            System.out.print("Введите первое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
            int first = scanner.nextInt();

            // Ввод второго числа
            System.out.print("Введите второе число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число.");
                scanner.next(); // Очистка некорректного ввода
            }
            int second = scanner.nextInt();

            // Вычисление суммы
            int sum = first + second;
            System.out.printf("Сумма %d и %d равна: %d%n", first, second, sum);

            // Повторный запрос
            System.out.print("Хотите ввести ещё числа? (да/нет): ");
            String answer = scanner.next();
            continueInput = answer.equalsIgnoreCase("да");

            // Очистка буфера сканера
            scanner.nextLine();
        }

        System.out.println("Программа завершена.");
    }
}

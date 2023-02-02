
// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package Sem3Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите длину списка: ");
            int num = in.nextInt();
            List<Integer> Mylist = CreatingList(num);
            MaxNumbers(Mylist);
            MinNumbers(Mylist);
            Average(Mylist);

        }
    }

    // Создание списка
    public static List<Integer> CreatingList(int num) {
        Random random = new Random();
        List<Integer> Numbers = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            Numbers.add(random.nextInt(0, 100));
        }
        System.out.println("Произвольный список целых чисел: " + Numbers);
        return Numbers;
    }

    // Максимальное значение
    public static int MaxNumbers(List<Integer> Numbers) {
        int max = 0;
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) > max) {
                max = Numbers.get(i);
                i--;
            }
        }
        System.out.println("Максимальное число: " + max);
        return max;
    }

    // Минимальное значение
    public static int MinNumbers(List<Integer> Numbers) {
        int min = Numbers.get(0);
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) < min) {
                min = Numbers.get(i);
                i--;
            }
        }
        System.out.println("Минимальное число: " + min);
        return min;
    }

    // Среднее арифметическое значение
    public static double Average(List<Integer> Numbers) {
        Double average = Numbers.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println("Среднее арифметическое: " + average);
        return average;
    }

}

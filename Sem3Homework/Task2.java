
// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
package Sem3Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите длину списка: ");
            int num = in.nextInt();
            List<Integer> result = RemovEvenNumbers(CreatingList(num));
            System.out.println("Список без чётных чисел: " + result);
        }
    }

    // Создание рандомного списка
    public static List<Integer> CreatingList(int num) {
        Random random = new Random();
        List<Integer> Numbers = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            Numbers.add(random.nextInt(0, 100));
        }
        System.out.println("Произвольный список целых чисел: " + Numbers);
        return Numbers;
    }

    // Удаление чётных чисел
    public static List<Integer> RemovEvenNumbers(List<Integer> Numbers) {
        for (int i = 0; i < Numbers.size(); i++) {
            if (Numbers.get(i) % 2 == 0) {
                Numbers.remove(i);
                i--;
            }
        }
        return Numbers;
    }

}

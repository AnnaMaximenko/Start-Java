// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

package Sem2Homework;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        String nameOfFile = "log.txt";

        int[] input = getNumberByUser();

        System.out.println((BubleSort(input, nameOfFile)));
        System.out.println("Итерации записаны в лог-файл: " + nameOfFile);

    }

    // Ввод числа
    static int[] getNumberByUser() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите длинну массива: ");
            int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
            System.out.println("Введите целые числа: ");
            int array[] = new int[size]; // Создаём массив int размером в size
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
            }
            return array;
        }
    }

    // Сортировка
    static String BubleSort(int[] mas, String nameOfFile) {
        int count = 1;

        while (count > 0) {
            count = 0;
            for (int i = 1; i < mas.length; i++) {
                for (int j = 0; j < mas.length - i; j++) {
                    if (mas[j] > mas[j + 1]) {

                        int buf = 0;
                        buf = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = buf;
                        count++;
                    }
                }
                FileWriter(Arrays.toString(mas), nameOfFile);
            }
        }
        return Arrays.toString(mas);
    }

    // Создание файла + запись данных
    public static void FileWriter(CharSequence text, String nameOfFile) {
        try (FileWriter fileWriter = new FileWriter(nameOfFile, true)) {
            fileWriter.append(text + "\n");
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }

    }

}

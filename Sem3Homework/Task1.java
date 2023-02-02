// Реализовать алгоритм сортировки слиянием.

package Sem3Homework;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] Array = new int[9];
        System.out.println("Отсортированный массив: " + "\n" + Arrays.toString(SortMerge(CreatingArray(Array))));

    }

    // Создание рандомного массива
    public static int[] CreatingArray(int[] myIntArray) {
        Random random = new Random();
        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = random.nextInt(1, 100);
        }
        System.out.println("Рандомный массив: " + "\n" + Arrays.toString(myIntArray));
        return myIntArray;
    }

    // Сортировка массива
    public static int[] SortMerge(int[] arr) {
        if (arr == null) {
            System.out.println("Введен пустой массив");
            return null;
        }
        if (arr.length < 2) {
            return arr;
        }
        int[] left = new int[arr.length / 2];
        int[] right = new int[arr.length - arr.length / 2];

        System.arraycopy(arr, 0, left, 0, arr.length / 2);
        System.arraycopy(arr, arr.length / 2, right, 0, arr.length - arr.length / 2);

        left = SortMerge(left);
        right = SortMerge(right);
        return Merge(left, right);

    }

    // Объединение массива
    public static int[] Merge(int arrayOne[], int arrayTwo[]) {
        int[] result = new int[arrayOne.length + arrayTwo.length];
        int lenghtOne = arrayOne.length;
        int lenghtTwo = arrayTwo.length;
        // Создание итераторов для массивов
        int i = 0, j = 0, k = 0;

        while (i < lenghtOne && j < lenghtTwo) {
            if (arrayOne[i] <= arrayTwo[j]) {
                result[k] = arrayOne[i];
                i++;
            } else {
                result[k] = arrayTwo[j];
                j++;
            }
            k++;
        }
        while (i < lenghtOne) {
            result[k] = arrayOne[i];
            i++;
            k++;
        }
        while (j < lenghtTwo) {
            result[k] = arrayTwo[j];
            j++;
            k++;
        }
        return result;
    }
}

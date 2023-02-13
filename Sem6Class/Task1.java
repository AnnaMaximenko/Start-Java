// 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
// 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package Sem6Class;

// import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = createArray(1000, 0, 25);
        // System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        System.out.println(uniquePersent(arr) / 100);

    }

    static int[] createArray(int size, int origin, int bound) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(origin, bound);
        }
        return arr;
    }

    private static float uniquePersent(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int num : arr) {
            nums.add(num);
        }
        System.out.println(nums);
        return nums.size() * 100f / arr.length;
    }

}

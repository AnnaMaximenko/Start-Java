import java.util.Scanner;

/**
 * program
 */
public class program1 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n = getNumberByUser("Введите длинну основания треугольника: ");
        int number = getNumber(n);
        // 2.3 Печать результата
        System.out.printf("Треугольное число: %d", number);

    }

    // 2.0 Ввод числа
    static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    // 2.1 Расчет
    static int getNumber(int n) {
        return (int) ((double) 1 / 2 * n * (n + 1));
    }

}

// Написать программу вычисления n-ого треугольного числа.

// 1. Уточнить ТЗ
// 2. Декомпозиция

// 2.0 Ввод числа
// 2.1 Расчет
// 2.3 Печать результата

// 3. Алгоритм
// 4. Код
// 5. Тесты
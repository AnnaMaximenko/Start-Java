// Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

// Например:
// 5 4 3 - + => 5 1 + => 6

package Sem4Homework;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите пример. Каждый знак вводится через пробел: ");
        String inputLine = input.nextLine();

        String[] inputStrings = inputLine.split(" ");

        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < inputStrings.length; i++) {
            if (isNumber(inputStrings[i])) {
                stack.push(Double.parseDouble(inputStrings[i]));
            } else {
                double number1 = stack.pop();
                double number2 = stack.pop();

                switch (inputStrings[i]) {
                    case "+":
                        stack.push(number1 + number2);
                        break;
                    case "-":
                        stack.push(number2 - number1);
                        break;
                    case "*":
                        stack.push(number1 * number2);
                        break;
                    case "/":
                        stack.push(number2 / number1);
                        break;
                }
            }

        }
        if (!stack.empty()) {
            System.out.println("Ответ: " + stack.pop());
        } else {
            System.out.println("Ошибка!");
        }
    }

    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

}

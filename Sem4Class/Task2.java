import java.util.ArrayDeque;
import java.util.Stack;

// 1) Написать метод, который принимает массив элементов, помещает их в стэк и 
// выводит содержимое стэка, доставая его содержимое по одному.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит 
// на консоль содержимое очереди, доставая её содержимое по одному.

public class Task2 {
    public static void main(String[] args) {
        FillPrintStack(new int[] { 2, 6, 2, 9, 6 });
        System.out.println();
        FillPrintQueue(new int[] { 2, 6, 2, 9, 6 });

    }

    private static void FillPrintStack(int[] numbers) {
        Stack<Integer> stackNumber = new Stack<>();

        for (int num : numbers) {
            stackNumber.push(num);
        }

        while (!stackNumber.isEmpty()) {
            System.out.println(stackNumber.pop());
        }

    }

    private static void FillPrintQueue(int[] numbers) {
        ArrayDeque<Integer> queueNumber = new ArrayDeque<>();

        for (int num : numbers) {
            queueNumber.push(num);
        }

        while (!queueNumber.isEmpty()) {
            System.out.println(queueNumber.pop());
        }

    }
}

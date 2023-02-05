// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package Sem4Homework;

import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("LinkedList: " + list);

        System.out.println("Перевернутый LinkedList: " + ReverseLinkedList(list));

    }

    // Создание дублирующего массива и разворот
    private static LinkedList<Integer> ReverseLinkedList(LinkedList<Integer> list) {

        LinkedList<Integer> reverseList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reverseList.add(list.get(i));
        }
        return reverseList;
    }

}

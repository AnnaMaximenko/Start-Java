// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Sem4Homework;

import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("LinkedList: " + list);

        System.out.println("Добавление элемента в конец очереди: " + enqueue(list));
        System.out.println("LinkedList: " + list);

        System.out.println("Первый элемент из очереди(без удаления): " + first(list));
        System.out.println("LinkedList: " + list);

        System.out.println("Первый элемент из очереди (удалён): " + dequeue(list));
        System.out.println("LinkedList: " + list);

    }

    // enqueue() - помещает элемент в конец очереди

    private static LinkedList<Integer> enqueue(LinkedList<Integer> list) {
        int el = 5;
        list.addLast(el);
        return list;
    }

    // first() - возвращает первый элемент из очереди, не удаляя.
    private static int first(LinkedList<Integer> list) {
        int el = list.element();
        return el;
    }

    // dequeue() - возвращает первый элемент из очереди и удаляет его
    private static int dequeue(LinkedList<Integer> list) {
        int el = list.pollFirst();
        return el;
    }

}

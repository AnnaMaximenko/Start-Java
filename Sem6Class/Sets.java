// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

package Sem6Class;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> threeSet = new TreeSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(threeSet);

        System.out.println(new HashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));
        System.out.println(new LinkedHashSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));
        System.out.println(new TreeSet<>(Arrays.asList(6, 5, 1, 2, 3, 2, 4, 5, 6, 3)));
    }

}

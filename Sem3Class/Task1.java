// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.
package Sem3Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(0, 100));
        }
        randomNumbers.sort(new SortRule());
        // Пишем дополнительный файл с типом сортировки
        System.out.println(randomNumbers);

    }

}

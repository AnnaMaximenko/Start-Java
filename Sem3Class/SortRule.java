package Sem3Class;

import java.util.Comparator;

public class SortRule implements Comparator<Integer> {

    // // Возрастание
    // @Override
    // public int compare(Integer o1, Integer o2) {
    // if (o1 < o2)
    // return -1;
    // else if (o1 > o2)
    // return 1;
    // else
    // return 0;

    // }

    // Убывание
    @Override
    public int compare(Integer o1, Integer o2) {
        // if (o1 < o2)
        // return 1;
        // else if (o1 > o2)
        // return -1;
        // else
        // return 0;
        return o1 - o2;

    }

}

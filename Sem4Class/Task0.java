import java.util.*;

public class Task0 {
    public static void main(String[] args) {
        measureAddElements(new ArrayList<Integer>(), "ArrayList", 1_000_000);

        measureAddElements(new LinkedList<Integer>(), "LinkedList", 1_000_000);
    }

    private static void measureAddElements(List<Integer> list, String hint, int repeatCount) {
        long start = System.nanoTime();

        for (int i = 0; i < repeatCount; i++)
            list.add(i);

        long end = System.nanoTime();

        System.out.println(hint);
        System.out.printf("%.1f\n", (end - start) / 1_000_000f);
    }
}
// 1 sec = 1000 милис = 1000 000 микросекунд = 1 000 000 000 наносекунд
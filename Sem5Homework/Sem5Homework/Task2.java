// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package Sem5Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Map<String, Integer> CountRepeatWorkers = new HashMap<>();
        List<String> workers = new ArrayList<>();

        workers.add("Иван");
        workers.add("Екатерина");
        workers.add("Екатерина");
        workers.add("Екатерина");
        workers.add("Петр");
        workers.add("Екатерина");
        workers.add("Екатерина");
        workers.add("Иван");
        workers.add("Иван");
        workers.add("Николай");
        workers.add("Иван");
        workers.add("Григорий");
        workers.add("Григорий");

        System.out.println(workers);
        System.out.println();

        CountRepeatWorkers = NumberOfRepeat(workers, CountRepeatWorkers);
        System.out.println(CountRepeatWorkers);

        ArrayList<String> list = CreatingCountOfName(CountRepeatWorkers, BubleSort(GetList(CountRepeatWorkers)));
        System.out.println(list);

    }

    private static Map<String, Integer> NumberOfRepeat(List<String> workers, Map<String, Integer> CountRepeatWorkers) {
        List<String> workerNames = new ArrayList<>();
        List<Integer> workerCounts = new ArrayList<>();
        for (String worker : workers) {
            if (!workerNames.contains(worker)) {
                workerNames.add(worker);
                workerCounts.add(1);
            } else {
                int index = workerNames.indexOf(worker);
                workerCounts.set(index, workerCounts.get(index) + 1);
            }
        }

        for (int i = 0; i < workerNames.size(); i++) {
            if (workerCounts.get(i) > 1) {
                CountRepeatWorkers.put(workerNames.get(i), workerCounts.get(i));
            }
        }
        return CountRepeatWorkers;
    }

    private static ArrayList<Integer> GetList(Map<String, Integer> CountRepeatWorkers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> pair : CountRepeatWorkers.entrySet()) {
            list.add(pair.getValue());
        }
        return list;
    }

    static ArrayList<Integer> BubleSort(ArrayList<Integer> mas) {
        int count = 1;

        while (count > 0) {
            count = 0;
            for (int i = 1; i < mas.size(); i++) {
                for (int j = 0; j < mas.size() - i; j++) {
                    if (mas.get(j) < mas.get(j + 1)) {
                        Collections.swap(mas, j, j + 1);
                        count++;
                    }
                }
            }
        }
        return mas;
    }

    private static ArrayList<String> CreatingCountOfName(Map<String, Integer> CountRepeatWorkers,
            ArrayList<Integer> list) {
        ArrayList<String> resultList = new ArrayList<>();
        for (Integer temp : list) {
            for (Map.Entry<String, Integer> pair : CountRepeatWorkers.entrySet()) {
                if (pair.getValue() == temp) {
                    resultList.add(pair.getKey() + ":" + pair.getValue().toString());
                }
            }
        }
        return resultList;
    }
}

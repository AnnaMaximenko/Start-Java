// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
package Sem2Homework;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String nameOfFile = "request.txt";
        String[] pitches = { "name", "country", "city", "age" };

        List<String> tempList = CheckSubString(SplitText(FileReader(nameOfFile)));
        String res = CorrelationsVariable(tempList, pitches);

        System.out.println("SELECT*FROM " + nameOfFile + " WHERE " + FormingResponse(res));

    }

    // Чтение файла
    static String FileReader(String nameOfFile) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(nameOfFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    // Сплит текста из файла
    static String[] SplitText(String text) {
        final String[] items = text.split(",");
        return items;
    }

    // Проверка на ноль
    static List<String> CheckSubString(String[] items) {
        List<String> list = new ArrayList<String>(Arrays.asList(items));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("null")) {
                list.remove(i);
            }
        }
        return list;
    }

    // Соотнесение переменных. Проверка на соответствие запросу
    static String CorrelationsVariable(List<String> list, String[] text) {
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < text.length; index++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).contains(text[index])) {
                    result.append(
                            text[index] + '=' + list.get(j).toString().substring(list.get(j).indexOf(':') + 1) + ' ');
                }
            }
        }
        return result.toString();
    }

    // Формирование ответа
    static String FormingResponse(String text) {
        StringBuilder res = new StringBuilder();
        String[] result = text.split(" ");
        for (int i = 0; i < result.length; i++) {
            res.append(result[i] + ' ');
            if (i != result.length - 1) {
                res.append("AND ");
            }
        }
        return res.toString();
    }
}

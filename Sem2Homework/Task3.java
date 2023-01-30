// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
package Sem2Homework;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task3 {
    public static void main(String[] args) {
        String nameOfFile = "students.txt";

        String[] res = SplitText(FileReader(nameOfFile), ",");
        String word = "";
        for (String el : res) {
            word += WorkString(el) + ' ';
        }
        System.out.println(getResult(word));

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
    static String[] SplitText(String text, String char1) {
        final String[] items = text.split(char1);
        return items;
    }

    // Работа со строкой
    static String WorkString(String text) {
        StringBuilder sb = new StringBuilder(text);
        int startIndex = text.indexOf(text, 0);
        int stopIndex = text.indexOf(":");
        sb.delete(startIndex, stopIndex);
        return sb.toString().replaceAll("[^а-яА-Я\\w+]", "");

    }

    static String getResult(String str) {// Студент Иванов получил 5 по предмету Математика.
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i += 3) {
            sb.append("Студент ");
            sb.append(arr[i]);
            sb.append(" получил ");
            sb.append(arr[i + 1]);
            sb.append(" по предмету ");
            sb.append(arr[i + 2]);
            sb.append(".");
            sb.append("\n");
        }
        return sb.toString();
    }

}

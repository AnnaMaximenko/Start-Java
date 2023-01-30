// Напишите метод, который составит строку, состоящую 
// из 100 повторений слова TEST и метод, который запишет эту строку в простой текстовый файл, 
// обработайте исключения.

package sem2Class;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("file.txt")) {
            fileWriter.append("TEST ".repeat(100));
        } catch (IOException ex) {
            System.out.println("Не удалось открыть файл");
        }
    }
}

// import java.io.*;

// public class Task3 {
// public static void main(String[] args) {
// String line = "empty";
// try {
// String pathProject = System.getProperty("user.dir");
// String pathFile = pathProject.concat("/file.txt");
// File file = new File(pathFile);

// if (file.createNewFile()) {
// System.out.println("file.created");
// }
// else {
// System.out.println("file.existed");
// FileWriter fileWriter = new FileWriter(file, true);
// fileWriter.write("new line");

// //#region lineSeparator
// // A string containing "\r\n" for non-Unix
// // platforms, or a string containing
// // "\n" for Unix platforms.
// fileWriter.append(System.lineSeparator());
// //#endregion

// fileWriter.write("new line");
// fileWriter.append("new line");
// fileWriter.flush();
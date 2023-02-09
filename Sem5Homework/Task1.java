// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package Sem5Homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, ArrayList<String>> PhoneBook = new HashMap<>();

        PhoneBook = PutValues(PhoneBook, "Николай", "89222299988");
        PhoneBook = PutValues(PhoneBook, "Николай", "89222299966");
        PhoneBook = PutValues(PhoneBook, "Елена", "+79221111119988");
        PhoneBook = PutValues(PhoneBook, "Антон", "89222299966");
        PhoneBook = PutValues(PhoneBook, "Елена", "+7922277766645");
        PhoneBook = PutValues(PhoneBook, "Николай", "8922000000966");
        PrintPhoneNumber(PhoneBook);
        System.out.println();

        InputPhoneNumber(PhoneBook);
        PrintPhoneNumber(PhoneBook);

    }

    private static Map<String, ArrayList<String>> PutValues(Map<String, ArrayList<String>> HashMap, String key,
            String value) {
        List<String> list = new ArrayList<>();
        if (HashMap.get(key) != null) {
            list = HashMap.get(key);
            list.add(value);
            HashMap.put(key, (ArrayList<String>) list);
        } else {
            list.add(value);
            HashMap.put(key, (ArrayList<String>) list);
        }
        return HashMap;
    }

    private static String SplitText(List<String> phones) {
        return String.join(", ", phones);
    }

    private static void PrintPhoneNumber(
            Map<String, ArrayList<String>> PhoneBook) {
        for (Map.Entry<String, ArrayList<String>> pair : PhoneBook.entrySet()) {
            System.out.println(pair.getKey() + ": " + SplitText(pair.getValue()));
        }

    }

    private static Map<String, ArrayList<String>> InputPhoneNumber(
            Map<String, ArrayList<String>> PhoneBook) {
        System.out.println("Введите имя пользователя: ");
        String inputName = input.nextLine();
        System.out.println("Введите номер телефона:  ");
        String inputNumber = input.nextLine();
        PhoneBook = PutValues(PhoneBook, inputName, inputNumber);
        return PhoneBook;

    }
}

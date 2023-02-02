// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Sem3Class;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List stringsAndNumbers = new ArrayList<String>();
        stringsAndNumbers.add("Москва");
        stringsAndNumbers.add(125);
        stringsAndNumbers.add(120);
        stringsAndNumbers.add(120);
        stringsAndNumbers.add(120);
        stringsAndNumbers.add("Казань");
        stringsAndNumbers.add(145);
        stringsAndNumbers.add("Омск");
        for (int i = 0; i < stringsAndNumbers.size(); i++) {
            if (stringsAndNumbers.get(i) instanceof Integer) {
                stringsAndNumbers.remove(i);
                i--;
            }
        }
        System.out.println(stringsAndNumbers);
    }
}

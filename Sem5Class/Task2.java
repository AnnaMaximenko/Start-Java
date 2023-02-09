// Написать метод, который переведёт данное целое число в римский формат.
// 2023 => MMXXIII

package Sem5Class;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(Convert(123));
        System.out.println(Convert(136));
        System.out.println(Convert(2023));
        System.out.println(Convert(2023));
        System.out.println(Convert(10));

    }

    private static String Convert(int number) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, " ");
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(20, "XX");
        map.put(30, "XXX");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(60, "LX");
        map.put(70, "LXX");
        map.put(80, "LXXX");
        map.put(90, "XC");

        String roman = map.get(number / 10 % 10 * 10) + map.get(number % 10);

        return roman;

    }

}

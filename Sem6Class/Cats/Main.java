package Sem6Class.Cats;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Барсик", "Сибирская", LocalDate.of(2006, 12, 6),
                "Николай");

        cat.addVaccination(new Vaccination(LocalDate.now(), "бешенство"));
        cat.addVaccination(new Vaccination(LocalDate.of(2012, 5, 6), "комплекс"));

        cats.add(cat);

        Cat murzik = new Cat("Мурзик", "Персидская", LocalDate.of(2015, 6, 17),
                "Людмила");

        murzik.addVaccination(new Vaccination(LocalDate.now(), "бешенство"));
        murzik.addVaccination(new Vaccination(LocalDate.of(2017, 5, 6), "комплекс"));

        cats.add(murzik);

        for (Cat c : cats) {
            System.out.println(c);
        }
    }

}

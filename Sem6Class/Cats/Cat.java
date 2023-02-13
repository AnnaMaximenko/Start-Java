// 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
// а) информационной системой ветеринарной клиники
// б) архивом выставки котов
// в) информационной системой Театра кошек Ю. Д. Куклачёва
// Можно записать в текстовом виде, не обязательно реализовывать в java.

package Sem6Class.Cats;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cat {
    private String name;
    private String breed;
    private LocalDate birthDate;
    private String ownerName;
    private List<Vaccination> vaccinations = new ArrayList<>();

    public Cat(String name, String breed, LocalDate birthDate, String ownerName) {
        this.name = name;
        this.breed = breed;
        this.birthDate = birthDate;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void addVaccination(Vaccination vaccination) {
        this.vaccinations.add(vaccination);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", breed=" + breed + ", birthDate=" + birthDate + ", ownerName=" + ownerName
                + ", vaccination=" + vaccinations + "]";
    }

}

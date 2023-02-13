package Sem6Class.Cats;

import java.time.LocalDate;

public class Vaccination {
    private LocalDate date;
    private String name;

    public Vaccination(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vaccination [date=" + date + ", name=" + name + "]";
    }

}

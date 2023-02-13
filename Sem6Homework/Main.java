package Sem6Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();

        Laptop aquilon = new Laptop("Aquilon", "Dexp", 8, 512, "Windows",
                "gray", "IPS", 2, "Под заказ", 18000);

        laptops.add(aquilon);

        Laptop nb = new Laptop("NB79", "Irbis", 4, 128, "Windows",
                "blue", "TN", 5, "В наличии", 20000);

        laptops.add(nb);

        Laptop lap = new Laptop("laptop15", "ASUS", 12, 128, "linux",
                "gray", "TN", 5, "В наличии", 23000);

        laptops.add(lap);

        PrintList(laptops);

        System.out.println(
                "Введите цифру соответствующую необходимому критерию:\n1-Оперативная память\n2-Объем жёсткого диска\n3-Операционная система\n4-Цвет\n5-Цена\n6-Рейтинг");
        String inputLine = input.nextLine();

        CommunicationWithUser(inputLine, laptops);

    }

    private static void PrintList(List<Laptop> laptops) {
        for (Laptop item : laptops) {
            System.out.println(item + "\n");
        }

    }

    public static void CommunicationWithUser(String inputLine, List<Laptop> laptops) {

        switch (inputLine) {
            case "1":
                System.out.println("Введите необходимое количество: ");
                int inputAccessMemory = input.nextInt();

                StringBuilder resultAM = new StringBuilder();

                for (Laptop item : laptops) {
                    int el = item.getRandomAccessMemory();

                    if (inputAccessMemory == el) {
                        resultAM.append(item + "\n");
                    }
                }
                if (resultAM.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultAM);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
            case "2":
                System.out.println("Введите необходимый объем жесткого диска: ");
                int inputHHD = input.nextInt();

                StringBuilder resultHHD = new StringBuilder();

                for (Laptop item : laptops) {
                    int el = item.getHHD();

                    if (inputHHD == el) {
                        resultHHD.append(item + "\n");
                    }
                }
                if (resultHHD.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultHHD);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
            case "3":
                System.out.println("Введите необходимый тип операционной системы: ");
                String inputSystem = input.nextLine();

                StringBuilder resultSystem = new StringBuilder();

                for (Laptop item : laptops) {
                    String el = item.getOperatingSystem();
                    if (inputSystem.equalsIgnoreCase(el)) {
                        resultSystem.append(item + "\n");
                    }
                }
                if (resultSystem.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultSystem);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
            case "4":
                System.out.println("Введите необходимый цвет: ");
                String inputColor = input.nextLine();

                StringBuilder resultColor = new StringBuilder();

                for (Laptop item : laptops) {
                    String el = item.getColor();

                    if (inputColor.equalsIgnoreCase(el)) {
                        resultColor.append(item + "\n");
                    }
                }
                if (resultColor.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultColor);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
            case "5":
                System.out.println("Введите минимальную цену: ");
                int inputPrise = input.nextInt();

                StringBuilder resultPrise = new StringBuilder();

                for (Laptop item : laptops) {
                    int el = item.getPrice();

                    if (inputPrise < el) {
                        resultPrise.append(item + "\n");
                    }
                }
                if (resultPrise.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultPrise);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
            case "6":
                System.out.println("Введите минимальный рейтинг: ");
                int inputRating = input.nextInt();

                StringBuilder resultRating = new StringBuilder();
                for (Laptop item : laptops) {
                    int el = item.getRating();

                    if (inputRating < el) {
                        resultRating.append(item + "\n");
                    }
                }
                if (resultRating.length() != 0) {
                    System.out.println("Подходящие ноутбуки: \n" + resultRating);
                } else {
                    System.out.println("Ноутбук отсутствует ");
                }
                break;
        }
    }

}

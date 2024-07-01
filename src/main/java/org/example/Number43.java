package org.example;

import java.util.Scanner;

public class Number43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String dateStr = scanner.nextLine();

        String[] dateParts = dateStr.split("\\.");

        String newDateStr = dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0];

        System.out.println("Новый формат даты: " + newDateStr);

    }
}

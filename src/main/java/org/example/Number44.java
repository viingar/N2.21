package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Number44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.MM.yyyy:");
        String dateStr = scanner.nextLine();

        SimpleDateFormat currentFormat = new SimpleDateFormat("dd.MM.yyyy");

        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = currentFormat.parse(dateStr);

            String newDateStr = newFormat.format(date);

            System.out.println("Новый формат даты: " + newDateStr);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты!");
        }
    }
}

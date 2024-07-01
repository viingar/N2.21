package org.example;

import java.util.Scanner;

public class Number41 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String str = scanner.nextLine();

        System.out.println("Введите подстроку:");
        String substr = scanner.nextLine();

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }

        System.out.println("Количество вхождений: " + count);
    }
}
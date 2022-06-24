package com.example.lab7;

import java.io.File;
import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwe pliku:");
        String fileName = scanner.next();

        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("Plik " + fileName + " istnieje.");
        } else {
            System.out.println("Plik " + fileName + " nie istnieje.");
        }
    }
}
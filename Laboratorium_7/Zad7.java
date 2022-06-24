package com.example.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Zad7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku:");
        String fileName = scanner.next();

        try {
            long bytes = Files.size(Paths.get(fileName));
            System.out.println("Rozmiar pliku wynosi: " + bytes + " bajtów");
        } catch (IOException e) {
            System.out.println("Problem z otwarciem pliku.");
        }
    }
}
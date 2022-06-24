package com.example.lab7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku:");
        String fileName = scanner.next();
        scanner.nextLine();
        try {
            PrintWriter writer = new PrintWriter(fileName);
            System.out.print("Podaj tekst do zapisu:");
            String text = scanner.nextLine();
            writer.println(text);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje");
        }
    }
}
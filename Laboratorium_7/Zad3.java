package com.example.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku do odczytu:");
        String fileName = scanner.next();
        File file = new File(fileName);

        try {
            Scanner inputData = new Scanner(file);
            int lines = 0;
            int letters = 0;
            int whiteSpaces = 0;
            while (inputData.hasNext()) {
                String data = inputData.nextLine();
                whiteSpaces += data.length() - data.replaceAll(" ", "").length();
                letters += data.replaceAll(" ", "").length();
                lines++;
            }
            System.out.println("Ilość linii: " + lines);
            System.out.println("Ilość liter: " + letters);
            System.out.println("Ilość białych znaków: " + whiteSpaces);
            inputData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Plik nie istnieje!");
        }
    }
}
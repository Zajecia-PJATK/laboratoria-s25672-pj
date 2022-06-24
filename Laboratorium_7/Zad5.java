package com.example.lab7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        File file = new File("plik.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę linii do odczytu:");
        int linesToRead = scanner.nextInt();
        ArrayList<String> lines = new ArrayList<>();

        try {
            Scanner fileData = new Scanner(file);
            while (fileData.hasNext()) {
                lines.add(fileData.nextLine());
            }

            for (int i = lines.size() - linesToRead; i < lines.size(); i++) {
                if (i < 0) i = 0;
                System.out.println(lines.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Problem z otwarciem pliku!");
        }
    }
}
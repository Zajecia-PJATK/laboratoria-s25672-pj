package com.example.lab7;
import java.io.*;
import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwe pierwszego pliku:");
        String firstFileName = scanner.next();
        scanner.nextLine();
        System.out.print("Podaj nazwe drugiego pliku:");
        String secondFileName = scanner.next();



        try {
            PrintWriter firstFile = new PrintWriter(new FileWriter(firstFileName, true));
            File secondFile = new File(secondFileName);

            Scanner secondFileData = new Scanner(secondFile);
            while (secondFileData.hasNext()) {
                firstFile.println(secondFileData.nextLine());
            }
            firstFile.close();
            secondFileData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem z otwarciem drugiego pliku.");
        } catch (IOException e) {
            System.out.println("Problem z otwarciem pierwszego pliku.");
        }

    }
}

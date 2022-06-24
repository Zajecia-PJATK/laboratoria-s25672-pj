package com.example.lab7;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Zad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku:");
        String fileName = scanner.next();

        File file = new File(fileName);

        try {
            Scanner fileData = new Scanner(file);
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName + ".dat"));
            while (fileData.hasNext()) {
                outputStream.writeUTF(fileData.nextLine());
            }
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Problem z otwarciem pliku");
        }
    }
}
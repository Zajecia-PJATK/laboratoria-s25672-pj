package com.example.lab7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zad8 {

    public static void main(String[] args) {
        File file = new File("data.csv");
        ArrayList<String[]> records = new ArrayList<>();

        try {
            boolean firstLine = true;
            Scanner fileData = new Scanner(file);
            while (fileData.hasNext()) {
                if (!firstLine) {
                    String line = fileData.nextLine();
                    records.add(line.split(","));
                } else {
                    fileData.nextLine();
                    firstLine = false;
                }
            }

            HashMap<String, Integer> currencies = new HashMap<>();
            for (String[] record : records) {
                if (!currencies.containsKey(record[5])) {
                    currencies.put(record[5], 1);
                } else {
                    currencies.put(record[5], currencies.get(record[5]) + 1);
                }
            }

            int comDomainEmails = 0;

            for (String[] record : records) {
                if (record[3].endsWith(".com")) comDomainEmails++;
            }

            for (String key : currencies.keySet()) {
                System.out.println(key + ": " + currencies.get(key));
            }

            System.out.println("Liczba osób z emailem zakończonym .com: " + comDomainEmails);
            fileData.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem z otwarciem pliku.");
        }
    }
}
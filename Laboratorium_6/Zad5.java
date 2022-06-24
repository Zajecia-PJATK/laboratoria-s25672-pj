package com.example.lab7;

import java.util.ArrayList;
        import java.util.LinkedHashSet;
        import java.util.Scanner;
        import java.util.Collections;

class Zad2 {
    public static void main(String[] args) {
        ArrayList<String> listaSlow = new ArrayList<String>();
        LinkedHashSet<String> listaSlow2 = new LinkedHashSet(listaSlow);
        Scanner scan1 = new Scanner(System.in);
        while (scan1.hasNext()) {
            for (String slowo : scan1.nextLine().split(" ")) {
                listaSlow.add(slowo);
            }
        }
        Collections.sort(listaSlow);
        for (String key : listaSlow) {
            listaSlow2.add(key + "=" + Collections.frequency(listaSlow, key));
        }
        System.out.println(listaSlow2.toString().replace("[","{").replace("]","}"));
    }
}

package com.example.demo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Main{
    public static void main(String[] argv){
        ArrayList<String> lista = new ArrayList<String>();
        Scanner n = new Scanner(System.in);
        while (n.hasNext()){
            for (String slowo : n.nextLine().split(" ")){
                lista.add(slowo);}
        }
        System.out.println(lista.toString());
    }
}

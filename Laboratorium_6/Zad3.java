package com.example.lab7;
import java.util.ArrayList;
        import java.util.Locale;
        import java.util.Scanner;
        import java.util.Collections;

        import java.util.List;

class Zad3{
    public static void main(String[] argv){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner n = new Scanner(System.in);
        while (n.hasNextInt()){
            Integer x = new Integer(n.nextInt());
            lista.add(x);
        }
        Collections.sort(lista);
        for(int i=0;i<lista.size(); i++){
            for(int j=1; j<lista.size(); j++){
                if(i!=j && lista.get(i)==lista.get(j)){
                    lista.remove(j);
                }
            }
        }
        System.out.println(lista);
    }
}

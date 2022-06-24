package com.example.lab7;

class Zad10 {
    public static void main(String[] args) {

        int wynik = -1;
        try{
            if(wynik < 0){
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(wynik);
            }
        }
        catch (IllegalArgumentException e){
            System.out.println("Argument nie może być wartością ujemną");
        }
    }
}

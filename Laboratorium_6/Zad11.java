package com.example.lab7;

class Wyjatek extends Exception{

    public Wyjatek(String komunikat){
        super();
    }
    public Wyjatek() {

    }
}

class Zad11 {
    public static void main(String[] args) {
        int liczba = -1;
        try{
            if(liczba <= 0){
                throw new Wyjatek();
            }
        }
        catch (Wyjatek e){
            System.out.println("Argument nie może być wartością ujemną");
        }
    }
}

package com.example.laboratoria3;

class Account {
    private String Id;
    private String name;
    private int balance = 0;
    private int amount;


    public Account(String Id, String name){
        this.Id = Id;
        this.name = name;
    }

    public Account(String Id, String name, int balance){
        this.Id = Id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return Id;
    }

    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        balance = amount + balance;
        return balance;
    }

    public int debit(int amount){
        if (this.amount <= this.balance){
            balance = balance - amount;
            return balance;
        }
        return balance;
    }
    public String toString(){
        return "Account[id=" +this.Id+ ",name=" +this.name+",balance="+this.balance+"]";
    }


}

class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name,String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String x){
        this.email = x;
    }

    public char getGender(){
        return gender;
    }
    public String toString() {
        return "Author[name=" + this.name + ",email=" + this.email + ",gender=" + this.gender + "]";
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book (String name,double price, Author author){
        this.name = name;
        this.price = price;
        this.author = author;

    }
    public Book (String name, double price, Author author, int qty){
        this.name = name;
        this.price = price;
        this.author = author;
        this.qty = qty;
    }
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "Book[name=" +this.name+",author="+ author.toString()+",price="+ this.price+ ",qty="+ this.qty+"]";
    }
}


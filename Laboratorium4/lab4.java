package com.example.laboratoria3;

// Zadanie 3-4

class Circle {
    double radius;
    String color;

    public Circle(){
        this.radius = 1;
        this.color = "red";
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor(){
        return color;
    }
    public void setRadius(double p){
        this.radius = p;
    }
    public void setColor(String col){
        this.color = col;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString(){
        return "Circle[radius=" +this.radius+ ", color='" +this.color+"']";
    }
}
class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, double height){
        super.radius = radius;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
}

// Zadanie 5

class Student extends Person{
    String program;
    int year;
    double fee;

    public Student(String name, String addres, String program, int year, double fee){
        super(name, addres);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram(){
        return program;
    }

    public void setProgram(String program){
        this.program = program;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public double getFee(){
        return fee;
    }

    public void setFee(double fee){
        this.fee = fee;
    }

    public String toString(){
        return "Student{program='" +this.program+ "', year=" +this.year+", fee="+this.fee+"}";
    }
}

class Staff extends Person{
    String school;
    double pay;

    public Staff(String name, String addres, String school, double pay){
        super(name, addres);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool(){
        return school;
    }

    public void setSchool(String school){
        this.school = school;
    }

    public double getPay(){
        return pay;
    }

    public void setPay(double pay){
        this.pay = pay;
    }

    public String toString(){
        return "Staff{school='"+this.school+"', pay="+this.pay+"}";
    }
}

// Zadanie 6

class Circle extends Shape{
    double radius = 2.5;

    public Circle(){
        radius = 1;
    }

    public Circle(double radius){
        radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return Math.PI * (radius * 2);
    }

    public String toString(){
        return "Circle{" +super.toString()+" radius="+this.radius+"}";
    }
}

class Rectangle extends Shape{
    double width = 2;
    double lenght = 2.5;

    public Rectangle(){
        width = 1;
        lenght = 1;
    }

    public Rectangle(double width, double lenght){
        width = width;
        lenght = lenght;
    }

    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        width = width;
        lenght = lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getLength(){
        return lenght;
    }

    public void setLenght(double lenght){
        this.lenght = lenght;
    }

    public double getArea(){
        return lenght * width;
    }

    public double getPerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public String toString(){
        return "Rectangle{"+super.toString()+" width="+this.width+", length="+this.lenght+"}";
    }
}
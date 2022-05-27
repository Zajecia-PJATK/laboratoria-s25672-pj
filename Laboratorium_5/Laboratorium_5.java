package com.example.laboratoria3.Laboratorium4;
// zadanie 8

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
public class MovablePoint implements Movable{
    private double x;
    private double y;
    private double xSpeed = 0;
    private double ySpeed = 0;

    public MovablePoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "MovablePoint={x=" + this.x + ",y=" + this.y
                + ",xSpeed=" + this.xSpeed + ",ySpeed=" + this.ySpeed +
                "}";
    }

    @Override
    public void moveUp(){
        this.y += ySpeed;
    }
    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }
    @Override
    public void moveLeft(){
        this.x -= xSpeed;
    }
    @Override
    public void moveRight(){
        this.x += xSpeed;
    }
}
public class Main {

    public static void main(String[] args) {
        MovablePoint x = new MovablePoint(0,0);
        x.setxSpeed(10);
        x.setySpeed(10);
        System.out.println(x.toString());
        x.moveLeft();
        x.moveDown();
        System.out.println(x.toString());
    }
}

// zadanie 9

package com.company;

public class CourseGrades implements Analyzable {
    GradedActivity tab[];

    public CourseGrades(GradedActivity[] tab) {
        this.tab = tab;
    }

    public void setTab(GradedActivity[] tab) {
        this.tab = tab;
    }

    public GradedActivity[] getTab() {
        return tab;
    }

    @Override
    public double getAverage() {
        double wynik = 0;
        for (int i = 0; i < tab.length; i++) wynik += tab[i].getScore();
        return wynik / tab.length;
    }

    @Override
    public GradedActivity getHighest() {
        GradedActivity temp = tab[0];
        for (int i = 1; i < tab.length; i++) if (tab[i].getScore() > temp.getScore()) temp = tab[i];
        return temp;
    }

    @Override
    public GradedActivity getLowest() {
        GradedActivity temp = tab[0];
        for (int i = 1; i < tab.length; i++) if (tab[i].getScore() < temp.getScore()) temp = tab[i];
        return temp;
    }
}
public class Main {

    public static void main(String[] args) {
        GradedActivity jedynka = new GradedActivity(1);
        GradedActivity dwojka = new GradedActivity(2);
        GradedActivity trojka = new GradedActivity(3);
        GradedActivity tab[] = {jedynka,dwojka,trojka};
        CourseGrades Nowak = new CourseGrades(tab);
        System.out.println(Nowak.getAverage());
        System.out.println(Nowak.getHighest());
        System.out.println(Nowak.getLowest());
    }
}


// zadanie 11

public class Comperator implements Comparable<Comperator> {
    int x;

    public Comperator(int x){
        this.x = x;
    }

    public int getX() {
        return x;
    }


    @Override
    public int compareTo(Comperator o) {
        if(this.x > o.getX() ) return 1;
        else if(this.x < o.getX()) return -1;
        else return 0;
    }
}
package com.company;

public class Main{


    Comperator x = new Comperator(17);
    Comperator y = new Comperator(18);
    Comperator z = new Comperator(17);

        System.out.println(x.compareTo(y));//-1
        System.out.println(x.compareTo(z));//0
        System.out.println(y.compareTo(x));//1

}

}

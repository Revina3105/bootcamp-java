package co.g2academy.oop;

public class Deer extends Animal implements Vegetarian {

    public static void main(String[] args) {

        Deer d = new Deer();
        Animal a = new Deer();
        Vegetarian v = new Deer();
        Object o = new Deer();

        //new Deer bisa diganti dengan d aja
    }
}

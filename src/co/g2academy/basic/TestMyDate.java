package co.g2academy.basic;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate today = new MyDate(25, 10, 2020);
        today.showMyDate();
        MyDate millenium = new MyDate();
        millenium.showMyDate();
    }
}

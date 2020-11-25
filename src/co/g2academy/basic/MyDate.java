package co.g2academy.basic;

public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;

    public MyDate() {}
    public MyDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public void showMyDate(){
        System.out.println("My date is: " + day + "-" + month + "-" + year);
    }
}

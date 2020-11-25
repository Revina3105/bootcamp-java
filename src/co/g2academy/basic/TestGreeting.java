package co.g2academy.basic;

public class TestGreeting {
    public static void main(String[] args) {
        Greeting hello = new Greeting();
        hello.name = "Revina";
        hello.greet();
        hello.name = "Ifnu";
        hello.greet();
        hello.greet();
    }
}

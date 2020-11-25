package co.g2academy.basic;

public class PassTest {
    public static void changeInt (int val) {
        val = 55;
    }


    public static void main(String[] args) {
        int val;
        val = 11;
        changeInt(val);
        System.out.println("Val value is " + val);
    }
}

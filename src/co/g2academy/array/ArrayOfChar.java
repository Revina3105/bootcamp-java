package co.g2academy.array;

public class ArrayOfChar {

    public char[] createArray() {
        char[] s = new char[26];
        for(int i = 0; i < s.length; i++) {
            s[i] = (char) ('A' + i);
        }
        return s;
    }
}

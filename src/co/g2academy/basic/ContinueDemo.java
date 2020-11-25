package co.g2academy.basic;

public class ContinueDemo {
    public static void main(String[] args) {
        String searchMe = "peter piper picked a peck of pickled peppers";
        int numPs = 0;

        for(int i = 0; i < searchMe.length(); i++) {
            if(searchMe.charAt(i) != 'p'){
                continue;
            }
            numPs++;
        }

        System.out.println("Found " + numPs + " p's in the string");
    }
}

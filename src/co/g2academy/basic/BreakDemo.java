package co.g2academy.basic;

public class BreakDemo {
    public static void main(String[] args){
        int[] arrayOfInts =
                {32, 97, 3, 594,
                 12, 076, 2000,
                 8, 622, 127};
        int searchFor = 12;

        boolean foundIt = false;
        int i = 0;
        for( ; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else  {
            System.out.println(searchFor + " is not the array");
        }
    }
}

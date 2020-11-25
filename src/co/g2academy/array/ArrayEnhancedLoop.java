package co.g2academy.array;

public class ArrayEnhancedLoop {

    private int[] list = {1,5,6,8,10};

    public int calculateSumOfAllItems() {
        int sum = 0;
        for(int element: list){
            sum = sum + element; //calculation
        }
        return sum;
    }

    public int calculateMultiplicationOfAllItem() {
        int multiplication = 1;
        for(int element : list){
            multiplication = multiplication * element;
        }
        return multiplication;
    }

    public int calculateAverageOfAllItems() {
        return calculateSumOfAllItems() / list.length;
    }
}

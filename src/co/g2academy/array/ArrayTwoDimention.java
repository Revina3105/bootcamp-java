package co.g2academy.array;

public class ArrayTwoDimention {

    private int[][] twoDim = new int[4][];
    private int[][] nonRectangularTwoDim = new int[4][];
    public ArrayTwoDimention() {
        twoDim[0] = new int[5];
        twoDim[1] = new int[5];

        nonRectangularTwoDim[0] = new int[2];
        nonRectangularTwoDim[1] = new int[4];
        nonRectangularTwoDim[2] = new int[6];
        nonRectangularTwoDim[3] = new int[8];
    }

    public int[][] getTwoDim() {
        return twoDim;
    }

    public int[][] getNonRectangularTwoDim() {
        return nonRectangularTwoDim;
    }
}

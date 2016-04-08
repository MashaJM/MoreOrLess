package MoreOrLess;


/**
 * Created by MashaJM on 08.04.2016.
 */
public class Model {
    private int min, max;

    public int rand (int min, int max) {

        return (min + (int)(Math.random() * ((max - min) + 1)));


    }

    public int rand () {

        return (0 + (int)(Math.random() * ((RAND_MAX - 0) + 1)));


    }




    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
}

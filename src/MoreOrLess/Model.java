package MoreOrLess;


/**
 * Created by MashaJM on 08.04.2016.
 */
public class Model {

    private int minBound, maxBound;
    private int hiddenNumber;



    public Model() {
        this.minBound = Controller.RAND_MIN;
        this.maxBound = Controller.RAND_MAX;
        this.hiddenNumber = rand();


    }
//int i, int i1, int rand
    public Model(int minBound, int maxBound) {
        this.minBound = minBound;
        this.maxBound = maxBound;
        this.hiddenNumber = rand(this.minBound, this.maxBound);
    }

    /**
     *
     * @return a randomize integer number between that is more than RAND_MIN and less than RAND_MAX
     */

    public int rand () {

        return Controller.RAND_MIN + 1  + (int) (Math.random() * (Controller.RAND_MAX - Controller.RAND_MIN - 1));


    }


    public static int rand (int minBound, int maxBound) {
        return (minBound+1) + (int) (Math.random() * (maxBound - minBound - 1));
    }




    public boolean guessNumber (int tryingNumber) {

        if (hiddenNumber == tryingNumber) return true;
        else if (hiddenNumber > tryingNumber){
            minBound = tryingNumber;

        } else {
            maxBound = tryingNumber;
        }
        return false;


    }






    public int getMinBound() {
        return minBound;
    }



    public int getHiddenNumber(int minBound, int maxBound) {
        return hiddenNumber;
    }

    public void setHiddenNumber() {

        hiddenNumber = rand();
    }

    public void setHiddenNumber(int minBound, int maxBound) {

        hiddenNumber = rand(minBound, maxBound);
    }
    public int getHiddenNumber() {
        return hiddenNumber;
    }

    public void setMinBound (int minBound) {
        this.minBound = minBound;
    }

    public int getMaxBound() {
        return maxBound;
    }

    public void setMaxBound(int maxBound) {
        this.maxBound = maxBound;
    }
}

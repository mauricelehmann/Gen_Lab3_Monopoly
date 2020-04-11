package java;

import java.util.Random;

/**
 *
 */
public class Dice {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 6;

    private int faceValue;

    /**
     *
     * @param min min value
     * @param max max value
     * @return A value is between min value (inclusive) and max value (inclusive)
     */
    private static int getRandomNumberInRange(int min, int max){
        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();
    }

    /**
     * This function set faceValue to a random value between 1 and 6
     */
    public void roll(){
        faceValue = getRandomNumberInRange(MIN_VALUE,MAX_VALUE);
    }

    /**
     *
     * @return faceValue
     */
    public int getFaceValue(){
        return faceValue;
    }
}

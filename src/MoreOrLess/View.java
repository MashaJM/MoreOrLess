package MoreOrLess;



/**
 * Created by MashaJM on 08.04.2016.
 */

public class View {
    //text constants


    public static final String GREETINGS = "Hello dear User. Let's try to guess one integer we will hide from you. " +
            "\n Do you want to choose the interval?\n " +
            "Or we can just play to default game on interval (0..100). \n Press Y for choose interval, Press N for having default game" ;

    public static final String SET_MIN_BORDER = "Input integer number for lower border";
    public static final String SET_MAX_BORDER = "Input integer number for upper border";


    public static final String INPUT_INT_DATA = "Input INT value = ";


    public static final String TRY_MORE = "It is not the number we hide!" ;
    public static final String TRY_LESS = "It is less than we hide!" ;

    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";

    public static final String OUT_OF_RANGE = "Please, choose a number inside the range: ";
    public static final String WE_FOUND = "We are happy! You guessed it ";


    public static void printMessage(String message){
        System.out.println(message);

    }
}

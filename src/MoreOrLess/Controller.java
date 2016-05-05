package MoreOrLess;

import java.util.Scanner;

/**
 * Created by MashaJM on 08.04.2016.
 */
public class Controller {

    public static final int RAND_MAX = 100;
    public static final int RAND_MIN = 0;

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    /**
     * check, if the User wants to solve the problem on default interval (0..100) or wants the new one
     * it is static because we need it for our model defining
     * @param
     * @return
     */

    public static Boolean isNewInterval() {
        View.printMessage(View.GREETINGS);

        Scanner scanner = new Scanner(System.in);
        while (true) {

            String yesOrNo = scanner.next();
            if ((yesOrNo.equals("Y")) || (yesOrNo.equals("y")))


            {
                System.out.println(yesOrNo);
                return true;

            } else if ((yesOrNo.equals("N")) || (yesOrNo.equals("n")))


            {

                System.out.println(yesOrNo);
                return false;
            } else {
                {
                    System.out.println("Wrong input! Repeat please!");
                    View.printMessage(View.WRONG_INPUT_INT_DATA);



                }

            }
        }
    }

    /**
     * set the interval's borders if it isn't default
     * @return
     */
    public static int[] setIntervals() {

        int array[] = new int[2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Set the minimal border");
        while (!sc.hasNextInt()) {


            System.out.println("wrong input data, try again");
            sc.next();

        }
        array[0] = sc.nextInt();
        System.out.println(array[0]);


        System.out.println("Set the maximal border");
        while (!sc.hasNextInt()) {
            System.out.println("wrong input data, try again");
            sc.next();
        }
        array[1] = sc.nextInt();
        System.out.println(array[1]);

        if (array[0] > array[1]) {
            int a = array[0];
            array[0] = array[1];
            array[1] = a;


        }



        return array;
    }

    /**
     * checks, if the User's number myNumber is inside interval (between min and max)
     * @param min
     * @param max
     * @param myNumber
     * @return
     */



    public boolean isInsideBorders(int min, int max, int myNumber) {
        return ((min < myNumber) && (myNumber < max));


    }


    /**
     * returns integer number inside the interval of our model
     * @param input
     * @return
     */



    public int desireInt (int input) {

             {
                Scanner scanner = new Scanner(System.in);
                 while (!isInsideBorders(model.getMinBound(), model.getMaxBound(), input)) {
                     view.printMessage(view.OUT_OF_RANGE);

                     input = inputInt(scanner);


                }return input;
            }


        }


    /**
     * returns user's input while it is integer number
     * @param scanner
     * @return
     */

    public int inputInt (Scanner scanner) {
        view.printMessage(view.INPUT_INT_DATA);
        while(! scanner.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            scanner.next();
        } return scanner.nextInt();}




    /**
     * the main game
     * @param model
     */
    public void game(Model model) {

//sout for checking only
        System.out.println("minBound = " + model.getMinBound());
        System.out.println("maxBound = " + model.getMaxBound());
        System.out.println("Hidden Number = " + model.getHiddenNumber());

        System.out.println(model.getHiddenNumber());

        Scanner scanner = new Scanner(System.in);

        while (!(model.guessNumber(desireInt(inputInt(scanner))))){
            System.out.println("minBound = " + model.getMinBound());
            System.out.println("maxBound = " + model.getMaxBound());

        }
        view.printMessage(view.WE_FOUND);





    }
}





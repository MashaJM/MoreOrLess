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
     * @param
     * @return
     */

    public static Boolean isNewInterval() {
        System.out.println("Hello dear User. Let's try to guess one integer we will hide from you. " +
                "\n Do you want to choose the interval?\n " +
                "Or we can just play to default game on interval (0..100). \n Press Y for choose interval, Press N for having default game");
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
            }
            {


                System.out.println("Wrong input! Repeat please!");
                System.out.println(yesOrNo);


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

        while (!sc.hasNextInt()) {
            System.out.println("Set the minimal border");
            sc.nextInt();
            System.out.println("wrong input data, try again");

        }
        array[0] = sc.nextInt();


        while (!sc.hasNextInt()) {
            System.out.println("Set the maximal border");
            sc.nextInt();
            System.out.println("wrong input data, try again");
        }
        array[1] = sc.nextInt();


        if (array[0] > array[1]) {
            int a = array[0];
            array[1] = array[0];
            array[0] = a;


        }
       // model.setMinBound(array[0]);
       // model.setMaxBound(array[1]);


        return array;
    }

    /**
     * checks, if the User's number myNumber is inside interval (between min and max)
     * @param min
     * @param max
     * @param myNumber
     * @return
     */
    public boolean isInsideBorders2(int min, int max, int myNumber) {
        if ((min < myNumber) && (myNumber < max)) return true;
        else return false;

    }


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






 /*   public Model chooseModel()
    {
        Scanner sc = new Scanner(System.in);
        if (isNewInterval(sc)) {
            this.setIntervals();
            model = new Model(setIntervals()[0], setIntervals()[1]);
            System.out.println("my intervals are: [" + setIntervals()[0] + ".." + setIntervals()[1] + "]");
            return model;
        } else model = new Model();
        return model;
    }
    */

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





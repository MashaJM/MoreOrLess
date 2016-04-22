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

    public Boolean isNewInterval(Scanner scanner) {
        view.printMessage(view.GREETINGS);

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


                view.printMessage(view.WRONG_INPUT_INT_DATA);
                System.out.println(yesOrNo);


            }

        }
    }


    public int[] setIntervals() {

        int array[] = new int[2];
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            view.printMessage(view.SET_MIN_BORDER);
            sc.nextInt();
            view.printMessage(view.WRONG_INPUT_INT_DATA);
        }
        array[0] = sc.nextInt();


        while (!sc.hasNextInt()) {
            view.printMessage(view.SET_MAX_BORDER);
            sc.nextInt();
            view.printMessage(view.WRONG_INPUT_INT_DATA);
        }
        array[1] = sc.nextInt();


        if (array[0] > array[1]) {
            int a = array[0];
            array[1] = array[0];
            array[0] = a;


        }
        model.setMinBound(array[0]);
        model.setMaxBound(array[1]);

        return array;
    }


    public boolean isInsideBorders(int min, int max, int myNumber) {
        if ((min < myNumber) & (myNumber < max)) return true;
        else return false;

    }








public int inputInt (Scanner scanner) {
    view.printMessage(view.INPUT_INT_DATA);
    while(! scanner.hasNextInt()) {
        view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
        scanner.next();
} return scanner.nextInt();}



public int desireInt (Scanner scanner) {
    while (!isInsideBorders(model.getMinBound(), model.getMaxBound(), inputInt(scanner))) {
    scanner.next();
        view.printMessage(view.OUT_OF_RANGE);

    }return scanner.nextInt();
    }










            //return false;



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


    public void game(Model model) {


        System.out.println("minBound = " + model.getMinBound());
        System.out.println("maxBound = " + model.getMaxBound());
        System.out.println("Hidden Number = " + model.getHiddenNumber());

        System.out.println(model.getHiddenNumber());
        //view.printMessage(view.INPUT_INT_DATA);
        Scanner scanner = new Scanner(System.in);

        while (!(model.guessNumber(desireInt(scanner)))){
            System.out.println("minBound = " + model.getMinBound());
            System.out.println("maxBound = " + model.getMaxBound());

        }
        view.printMessage(view.WE_FOUND);





            }
        }




    /**
     *
     * @param sc
     * @return
     */





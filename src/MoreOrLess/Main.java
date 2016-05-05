package MoreOrLess;
import java.util.Scanner;


/**
 * Created by MashaJM on 08.04.2016.
 */
public class Main {
    public static void main (String[] args) {


        Model model;
        if (Controller.isNewInterval()) {
            int array[]= Controller.setIntervals();
            model = new Model(array[0], array[1]);
        }
        else {
            model = new Model();
        }
        View view = new View();
        Controller controller = new Controller(model, view);

       controller.game(model);










    }



}

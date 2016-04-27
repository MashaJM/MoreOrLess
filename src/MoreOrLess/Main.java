package MoreOrLess;
import java.util.Scanner;


/**
 * Created by MashaJM on 08.04.2016.
 */
public class Main {
    public static void main (String[] args) {

       //Scanner scanner = new Scanner(System.in);
        //Controller.isNewInterval();
       // Controller.setIntervals();
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

       controller.game(model);










    }



}

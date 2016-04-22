package MoreOrLess;



/**
 * Created by MashaJM on 08.04.2016.
 */
public class Main {
    public static void main (String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
       controller.game(model);
        System.out.println("minBound = " + model.getMinBound());
        System.out.println("maxBound = " + model.getMaxBound());
        System.out.println("Hidden Number = " + model.getHiddenNumber());









    }



}

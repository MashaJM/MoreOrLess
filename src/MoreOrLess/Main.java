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










    }



}

/**
 * File name: Controller.java
 * Short description: manipulates view and model
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package Controller;

import Model.Model;
import View.View;

public class Controller {

    Model model;
    View view;

    public Controller(Model m, View v) {
        model = m;
        view = v;

        view.centerInitialSetup(model.getFpData().getLinesBeingDisplayed(), model.getFpData().getHeaders().size());
        view.centerUpdate(
               
                model.getFpData().getLines( // first argument to CenterUpdate
                        model.getFpData().getFirstLineToDisplay(), model.getFpData().getLastLineToDisplay()),
                model.getFpData().getHeaders() // second argument to CenterUpdate
        );
    }
    public Controller(){
        //empty constructor
    }
}

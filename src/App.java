
/**
 * File name: App.java
 * Short description: runs program
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
import Controller.Controller;
import Model.Model;
import View.View;

public class App {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
    }
}

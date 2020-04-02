/**
 * File name: View.java
 * Short description: displays and updates GUI
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package View;

import java.util.ArrayList;

public class View {

    // declare variables
    private InitialFrame iFrame;
    private InitialPanel iPanel;
    private CenterPanel cPanel;

    public View() {
        //  instantiate variables
        iFrame = new InitialFrame();
        iPanel = iFrame.getInitialPanel();
        cPanel = iFrame.getcPanel();

    }

    // add buttons and labels to the center panel
    public void centerInitialSetup(int rows, int cols) {
        cPanel.setupCenterPanel(rows, cols);
    }

    // update buttons and labels to show information in arrays
    public void centerUpdate(ArrayList<ArrayList<String>> player, ArrayList<String> headers) {
        cPanel.panelUpdate(player, headers);
    }

    // getters needed but not setters
    /**
     * @return the iFrame
     */
    public InitialFrame getiFrame() {
        return iFrame;
    }

    /**
     * @return the iPanel
     */
    public InitialPanel getiPanel() {
        return iPanel;
    }

    /**
     * @return the cPanel
     */
    public CenterPanel getcPanel() {
        return cPanel;
    }
}

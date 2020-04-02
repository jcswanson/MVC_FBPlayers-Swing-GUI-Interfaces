/**
 * File name: InitialFrame.java
 * Short description: creates JFrame for panels
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package View;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.UIManager;

/**
 *
 * @author jcswa
 */
public class InitialFrame extends JFrame {
    // declare variables
    private InitialPanel iPanel;
    private CenterPanel cPanel;

    public InitialFrame() {
    // instantiate variables and setup frame
        super("IST 242 - L04C");
        LayoutSetupMAC();
        iPanel = new InitialPanel();
        cPanel = iPanel.getcPanel();
        add(iPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1280, 700);
        setVisible(true);
    }
    // only getters required no setters
    public InitialPanel getInitialPanel() {
        return iPanel;
    }


    void LayoutSetupMAC() {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //------------------------------------------------------           
    }

    /**
     * @return the cPanel
     */
    public CenterPanel getcPanel() {
        return cPanel;
    }
}
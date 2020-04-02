/**
 * File name: InitialPanel.java
 * Short description: creates panel that holds center panel
 * IST 242 Assignment: L04C
 *
 * @author John C Swanson
 * @version 1.01 Mar 24, 2020
 */
package View;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author jcswa
 */
public class InitialPanel extends JPanel {

    private CenterPanel cPanel;
   

    public InitialPanel() {
        
        super();
        setBackground(Color.darkGray);       
        setLayout(new BorderLayout());
        cPanel = new CenterPanel();
        // add cPanel to center of layout 
        add(cPanel, BorderLayout.CENTER);
        
    }
    // getters and setters
    /**
     * @return the cPanel
     */
    public CenterPanel getcPanel() {
        return cPanel;
    }

    /**
     * @param cPanel the cPanel to set
     */
    public void setcPanel(CenterPanel cPanel) {
        this.cPanel = cPanel;
    }

}

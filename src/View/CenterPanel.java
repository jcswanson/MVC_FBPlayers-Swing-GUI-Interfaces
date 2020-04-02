/**
 * File name: CenterPanel.java
 * Short description: panel that has components, nested in initial panel
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package View;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author jcswa
 */
public class CenterPanel extends JPanel {
    // create lists for header labels and player buttons
    private ArrayList<JButton> playerButtons = new ArrayList<>();
    private ArrayList<JLabel> headerLabels = new ArrayList<>();

    public CenterPanel() {
        
        super();
        setBackground(Color.BLACK);

    }
    // create structure of the centerPanel
    public void setupCenterPanel(int rows, int cols) {
        // set the centerPanel to grid layout
        setLayout(new GridLayout(rows + 1, cols, 5, 5));
        // create the initial headers
        createLabels(cols);
        // create the initial buttons
        createButtons(rows * cols);
    }
    
    public void createButtons(int n) {
        // create buttons
        for (int b = 0; b < n; b++) {
            JButton jb = new JButton("Button " + (b + 1));
            //add buttons to list
            playerButtons.add(jb);
            // style the font different then the headers
            Font font = new Font(Font.SERIF, Font.CENTER_BASELINE | Font.ITALIC, 13);
            jb.setFont(font);
            // create orange borders with weight of 1 with square corners
            jb.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1, false));
            // set text color and button background color
            jb.setForeground(Color.white);
            jb.setBackground(Color.DARK_GRAY);
            add(playerButtons.get(b));
        }
        // update center panel
        validate();
        repaint();
    }
    // create label array and add to screen
    public void createLabels(int n) {
        // for loop to create "n" amount of header labels
        for (int h = 0; h < n; h++) {
            // create new label
            JLabel jl = new JLabel(" Header " + (h + 1), SwingConstants.CENTER);
            // change text color
            jl.setForeground(Color.orange);
            //format and set the font
            Font font = new Font(Font.SANS_SERIF, Font.CENTER_BASELINE | Font.BOLD, 13);
            jl.setFont(font);
            //setting background and etched header border
            jl.setBackground(Color.orange);
            jl.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
            // add label to list headerLabels
            headerLabels.add(jl);
            // add label to screen
            add(headerLabels.get(h));

        }
        // update center panel
                validate();
                repaint();
    }
    // update panel with text from lists
    public void panelUpdate(ArrayList<ArrayList<String>> playerData, ArrayList<String> headerAttrNames) {
        // set label headings text
        for (int h = 0; h < headerAttrNames.size(); h++) {
            // set header labels text with attribute names
            headerLabels.get(h).setText(headerAttrNames.get(h));
        }
        //button index number
        int b = 0;
        // grab each list of data for each player
        for (int d = 0; d < playerData.size() - 1 ; d++) {
            // add each player's data to a new string list
            ArrayList<String> data = playerData.get(d);
            // sort through player data setting button text to each data string
            for (int i = 0; i < data.size(); i++) {
                playerButtons.get(b).setText(data.get(i));
            // seperate counter to use all player data
                b++;
            }
        }
    }
    // getters and setters
    public ArrayList<JButton> getPlayerButtons() {
        return playerButtons;
    }

    public void setPlayerButtons(ArrayList<JButton> letters) {
        this.playerButtons = letters;
    }

    /**
     * @return the headerLabels
     */
    public ArrayList<JLabel> getHeaderLabels() {
        return headerLabels;
    }

    /**
     * @param headerLabels the headerLabels to set
     */
    public void setHeaderLabels(ArrayList<JLabel> headerLabels) {
        this.headerLabels = headerLabels;
    }

}

/**
 * File name: Model.java
 * Short description: sets model
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package Model;

import java.util.ArrayList;

public class Model{
    
    private FootballPlayerData fpData;
    private ArrayList<ArrayList<String>> lines;
    
    public Model() {
        fpData = new FootballPlayerData();
        
        //set data for displayable interfaces
        fpData.setFirstLineToDisplay(0);
        fpData.setLastLineToDisplay(20);
        fpData.setLinesBeingDisplayed(20);
        
        lines = fpData.getLines(fpData.getFirstLineToDisplay(), fpData.getLastLineToDisplay());
        
    }

    /**
     * @return the fpData
     */
    public FootballPlayerData getFpData() {
        return fpData;
    }

    /**
     * @param fpData the fpData to set
     */
    public void setFpData(FootballPlayerData fpData) {
        this.fpData = fpData;
    }

    /**
     * @return the lines
     */
    public ArrayList<ArrayList<String>> getLines() {
        return lines;
    }

    /**
     * @param lines the lines to set
     */
    public void setLines(ArrayList<ArrayList<String>> lines) {
        this.lines = lines;
    }

   
   
}

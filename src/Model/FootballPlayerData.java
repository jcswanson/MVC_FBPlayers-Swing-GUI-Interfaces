/**
 * File name: FootballPlayerData.java
 * Short description: retrieves player data
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package Model;

/**
 *
 * @author jcswa
 */
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;

public class FootballPlayerData implements TableData, Displayable {
    // declares variables
    protected ArrayList<FootballPlayer> players;
    protected int firstLineToDisplay;
    protected int lastLineToDisplay;
    protected int linesBeingDisplayed;
    protected int lineToHighlight;

    public FootballPlayerData() {
        this.players = new ArrayList<>();
        //placed method in constructor so when FootballPlayerData is called the xml is loaded into players
        this.loadTable();
        this.firstLineToDisplay = 0;
        this.lastLineToDisplay = 20;
        this.linesBeingDisplayed = 20;
    }

    public void ReadPlayersFromXML() {
        try {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null) {
                try {
                    fp = (FootballPlayer) decoder.readObject();
                    getPlayers().add(fp);
                } catch (ArrayIndexOutOfBoundsException theend) {
                    System.out.println("end of file");
                    break;
                }
            }
            decoder.close();
        } catch (Exception xx) {
            xx.printStackTrace();
        }
    }

    @Override
    public void loadTable() {
        ReadPlayersFromXML();//loads xml file, above method goes in constructor

    }

    @Override
    public ArrayList getTable() {
        return null;

    }

    @Override
    public ArrayList<String> getHeaders() {

        ArrayList<String> headers = new ArrayList<>();
        FootballPlayer fbp = new FootballPlayer();//called an instance of fbp so I could use attribute name in for loop
        for (int i = 0; i < 7; i++) { // not very future proof if we decide down the road to have more than 7 attributes
            headers.add(fbp.getAttributeName(i));
        }
        return headers;
    }

    @Override
    public ArrayList<String> getLine(int line) {
//        ArrayList<String> lines = new ArrayList<>();//instantiate the return list
//        for (int i = 0; i < 7; i++) { // not very future proof if we decide down the road to have more than 7 attributes
//            lines.add(players.get(line).getAttribute(i));//load the return list with all attributes of specific line
//        }
//       new code to get all the attributes at one time
        return players.get(line).getAttributes();
    }

    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine) {
        ArrayList<ArrayList<String>> listLines = new ArrayList<>();//instantiate the return list
        for (int i = firstLine; i <= lastLine; i++) {//trying to add to the return list the attribute lines between first and last
            listLines.add(getLine(i));//used getLine to get the attributes between first and last lines and added them to return listLines
        }
        return listLines;
    }

    /**
     * @return the players
     */
    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList<FootballPlayer> players) {
        this.players = players;
    }
    
    // getters and setters for displayable interface
    @Override
    public int getFirstLineToDisplay() {            
            return firstLineToDisplay; 
    }

    @Override
    public int getLineToHighlight() {
            return lineToHighlight;
    }

    @Override
    public int getLastLineToDisplay() {
            return lastLineToDisplay;
    }

    @Override
    public int getLinesBeingDisplayed() {
            return linesBeingDisplayed;
    }

    @Override
    public void setFirstLineToDisplay(int firstLine) {
            firstLineToDisplay = firstLine;
    }

    @Override
    public void setLineToHighlight(int highlightedLine) {
            lineToHighlight = highlightedLine;
    }

    @Override
    public void setLastLineToDisplay(int lastLine) {
            lastLineToDisplay = lastLine;
    }

    @Override
    public void setLinesBeingDisplayed(int numberOfLines) {
            linesBeingDisplayed = numberOfLines;
    }

}

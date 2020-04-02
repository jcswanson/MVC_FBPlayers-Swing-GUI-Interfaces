/**
 * File name: Displayable.java
 * Short description: displayable interface
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
public interface Displayable {

    public int getFirstLineToDisplay();

    public int getLineToHighlight();

    public int getLastLineToDisplay();

    public int getLinesBeingDisplayed();

    public void setFirstLineToDisplay(int firstLine);

    public void setLineToHighlight(int highlightedLine);

    public void setLastLineToDisplay(int lastLine);

    public void setLinesBeingDisplayed(int numberOfLines);
}

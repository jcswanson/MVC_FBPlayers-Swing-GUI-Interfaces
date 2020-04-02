/**
 * File name: TableData.java
 * Short description: retreivs table data
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
import java.util.ArrayList;

public interface TableData
{

    public void loadTable();

    public ArrayList getTable();

    public ArrayList<String> getHeaders();

    public ArrayList<String> getLine(int line);

    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine);

}


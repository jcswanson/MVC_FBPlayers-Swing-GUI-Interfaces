/**
 * File name: Height.java
 * Short description: creates a height object for fb player
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

public class Height {

    protected int feet;
    protected int inches;

    public Height(int feet, int inches) {
        super();
        this.feet = feet;
        this.inches = inches;
    }

    public Height() {
        //empty constructor per guidelines
    }
    //  getters and setters

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    // display total # of inches for height comparison ease
    public int getHeightInches() {
        int heightInches = this.feet * 12;
        return heightInches + this.inches;
    }

    @Override // display height as a string with the delimiter comma and apostrophe between feet and inches
    public String toString() {
        return feet + "'" + inches + "\"";
    }

}

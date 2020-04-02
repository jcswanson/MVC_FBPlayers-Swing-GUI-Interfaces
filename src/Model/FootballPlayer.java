/**
 * File name: FootballPlayer.java
 * Short description: creates player object
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author jcswa
 */
public class FootballPlayer extends Person implements TableMember {

    protected int number;
    protected String position;

    public FootballPlayer(int number, String firstName, String position, Height height, int weight, String hometown, String highschool) {
        super(firstName, height, weight, hometown, highschool);//Person constructor called with super
        //the two FootballPlayer values below will be added along with the super 
        this.number = number;
        this.position = position;
    }

    public FootballPlayer(int number, String firstName, String position, int feet, int inches, int weight, String hometown, String highschool) {
        super(firstName, new Height(feet, inches), weight, hometown, highschool);//Person constructor called with super with inches and feet as per zoom instruction
        //the two FootballPlayer values below will be added along with the super 
        this.number = number;
        this.position = position;
    }
    // empty constructor for XML method

    public FootballPlayer() {
        //empty constructor per guidelines
    }

    @Override // Super brings Person's toString method over to add to FBPlayer's.  Height's toString is in super already!
    public String toString() {
        return super.toString() + "\nNumber= " + getNumber() + "\nPosition= " + getPosition() + " ";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String getAttribute(int n) {
        //used a switch/case statement to identify the value for each integer going into the attribute value list
        switch (n) {
            case 0:
                return name;
            case 1:
                return height.toString();
            case 2:
                return weight + ""; // need to make string without conversion
            case 3:
                return hometown;
            case 4:
                return highschool;
            case 5:
                return number + "";
            case 6:
                return position;

        }
        return null;
    }

    @Override
    public ArrayList<String> getAttributes() {
        //setup arraylist for values
        ArrayList<String> attributes = new ArrayList<>();
        //enter values using for statement to enter the 7 case values
        for (int i = 0; i < 7; i++) { // not very future proof if we decide down the road to have more than 7 attributes
            attributes.add(getAttribute(i));
        }
        return attributes;
    }

    @Override
    public String getAttributeName(int n) {
        //used a switch/case statement to identify the attribute for each integer going into the names list
        switch (n) {
            case 0:
                return "Name";
            case 1:
                return "Height";
            case 2:
                return "Weight";
            case 3:
                return "Hometown";
            case 4:
                return "Highschool";
            case 5:
                return "Number";
            case 6:
                return "Position";

        }
        return null;
    }

    @Override
    public ArrayList<String> getAttributeNames() {
        //setup arraylist for the names
        ArrayList<String> attributeNames = new ArrayList<>();
        //add the names to the arraylist using a for statement 
        for (int i = 0; i < 7; i++) {  // will have to think of a way to future proof this if we add more than 7 names
            attributeNames.add(getAttributeName(i));
        }
        return attributeNames;
    }

}

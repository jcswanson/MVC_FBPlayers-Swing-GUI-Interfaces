/**
 * File name: Person.java
 * Short description: creates person object
 * IST 242 Assignment: L04C Graphics, Interfaces, MVC
 *
 * @author JOHN C SWANSON
 * @version 1.01 March 24, 2020
 */

package Model;

public class Person {

    protected String name;
    protected Height height;
    protected int weight;
    protected String highschool;
    protected String hometown;

    public Person(String firstName, Height height, int weight, String hometown, String highschool) {
        this.name = firstName;
        this.height = height;
        this.weight = weight;
        this.highschool = highschool;
        this.hometown = hometown;
    }

    //empty constructor for making an object and setting variables later
    public Person() {
      //empty constructor per guidelines
    }
    // toString method
    @Override
    public String toString() { //     Height toString method is called in person not FB player
        return name + "\nHeight = " + height.toString() + "\nWeight = " + weight + " lbs\nHighschool = " + highschool + "\nHometown = " + hometown;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHighschool() {
        return highschool;
    }

    public void setHighSchool(String highschool) {
        this.highschool = highschool;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

}

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Shape.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * 
 */ 
public abstract class Shape
{
    //instance variable for a Shape
    protected int numberOfDimensions;
    //default constructor for a Shape
    public Shape(int numberOfDimensions)
    {
        this.numberOfDimensions = numberOfDimensions;
    }
    //abstract methods to be defined in subclasses
    public abstract int getnumberOfDimensions();
    public abstract void create(); 
}

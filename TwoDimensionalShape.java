/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * TwoDimensionalShape.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A TwoDimensionalShape is a Shape.
 * A TwoDimensionalShape has an area.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * 
 */ 
public abstract class TwoDimensionalShape extends Shape
{  
    //instance variable for a 2D shape
    protected double area;
    //default constructor for a 2D shape
    public TwoDimensionalShape(){
        super(2);
    }
    //inheritted getter for number of dimensions
    public int getnumberOfDimensions(){
        return 2;
    }
    //abstract methods to be defined in subclasses
    public abstract double getArea();
    public abstract void create(); 
}

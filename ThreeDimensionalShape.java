/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * ThreeDimensionalShape.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has an volume.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * 
 */ 

public abstract class ThreeDimensionalShape extends Shape
{   
    //instance variable for a 3D shape
    protected double volume;
    //default constructor for a 3D shape
    public ThreeDimensionalShape(){
        super(3);
    }
    //inherited getter for number of dimensions
    public int getnumberOfDimensions(){
        return 3;
    }
    //abstract mmethods to be defined in subclasses  
    public abstract double getVolume();
    public abstract void create(); 
}

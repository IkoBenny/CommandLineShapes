import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Sphere.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has a volume.
 * A Sphere is a ThreeDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a sphere. Some appropiate assumptions
 * about sphere are made and documented in the code.
 */ 

public class Sphere extends ThreeDimensionalShape
{
    //instance variables for Sphere
    private final static double PI = 3.1415926535;
    private int radius;
    
    //default constructor for Sphere
    public Sphere(){
        super();
        radius =0;
    }   
    //getter for Sphere radius
    public double getRadius(){
        return radius;
    }   
    //setter for Sphere radius
    public void setRadius(int radius){
         this.radius = radius;
    } 
    //overriden getVolume method, returns volume for a Sphere object
    public double getVolume(){
        //V = PI4/3r^3
        return radius * radius * radius * (1.3333333) * PI;
    }
    //overridden create method, creates Sphere and displays volume
    public void create(){
        //create sphere then set measurements
        Sphere s = new Sphere();
        Scanner x = new Scanner(System.in);
        //set radius   
        System.out.println("What is the radius?");
        int input = x.nextInt();
        s.setRadius(input);  
        //return volume of Sphere
        System.out.println("The volume of the sphere is " + s.getVolume());  
        System.out.println();
    } 
}

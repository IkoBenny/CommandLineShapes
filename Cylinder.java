import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Cylinder.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has a volume.
 * A Cylinder is a ThreeDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a cylinder. Some appropiate assumptions
 * about cylinder are made and documented in the code.
 */ 

public class Cylinder extends ThreeDimensionalShape
{
    //instance variables for Cylnider
    private final static double PI = 3.1415926535;
    private int radius;
    private int height;
     
    //default constructor for Cylinder
    public Cylinder(){
      super();
      radius = 0;
      height =0;  
    }
    
    //getter for Cylinder radius
    public double getRadius(){
        return radius;
    }   
    //setter for Cylinder radius
    public void setRadius(int radius){
         this.radius = radius;
    } 
    //setter for Cylinder height
    public void setHeight(int height){
        this.height = height;
    }
    //getter for Cylinder height
    public int getHeight(){
        return height;
    }
    //overriden getVolume, returns volume for a Cylinder object
    public double getVolume(){
        //V = PI2rh
        return PI * radius * radius * height;
    }
    //overridden create method, creates Cylinder and displays volume
    public void create(){
        //create cylinder then set measurements
        Cylinder c = new Cylinder();
        Scanner x = new Scanner(System.in);
        //set radius    
        System.out.println("What is the radius?");
        int input = x.nextInt();
        c.setRadius(input);
        //set height
        System.out.println("What is the height?");
        input = x.nextInt();
        c.setHeight(input);      
        //return volume of cube
        System.out.println("The volume of the cylinder is " + c.getVolume()); 
        System.out.println();
    } 
}

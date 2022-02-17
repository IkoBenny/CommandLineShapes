import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Cone.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has a volume.
 * A Cone is a ThreeDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a cone. Some appropiate assumptions
 * about cone are made and documented in the code.
 */ 

public class Cone extends ThreeDimensionalShape
{
    //instance variables for a Cone
    private final static double PI = 3.1415926535;
    private int radius;
    private int height;
      
    //default constructor for a Cone object
    public Cone(){
        super();
        radius = 0;
        height = 0;          
    }    
    //getter for Cone radius
    public double getRadius(){
        return radius;
    }   
    //setter for Cone radius
    public void setRadius(int radius){
         this.radius = radius;
    }  
    //getter for Cone height
    public int getHeight(){
        return height;
    }
    //setter for Cube height
    public void setHeight(int height){
        this.height = height;
    }
    //override getVolume method, returns volume of a Cone
    public double getVolume(){
        //V = (height x π x radius2)/ 3
        return (height * PI * radius * radius) / 3;
    }    
    //overridden create method, creates Cone and displays volume
    public void create(){
        //create cone then set measurements
        Cone c = new Cone();
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
        System.out.println("The volume of the cone is " + c.getVolume());  
        System.out.println();
    } 
}

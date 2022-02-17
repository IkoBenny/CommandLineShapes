import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Circle.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A TwoDimensionalShape is a Shape.
 * A TwoDimensionalShape has an area.
 * A Circle is a TwoDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a Circle.Some appropiate assumptions
 * about circles are made and documented in the code.
 */ 

public class Circle extends TwoDimensionalShape
{
    //instance variables for a circle
    private final static double PI = 3.1415926535;
    private int radius;
    
    //default constructor for a Circle
    public Circle(){
        super();
        radius =0;
    }  
    //getter for Circle radius
    public double getRadius(){
        return radius;
    }   
    //setter for Circle radius
    public void setRadius(int radius){
         this.radius = radius;
    }    
    //getter for Circle diameter
    public double getDiameter(){
        return radius * 2;
    }
    //getter for Circle Circumference
    public double getCircumference(){
        return PI * radius * 2;
    }
    //overriden getArea method for a Circle object
    public double getArea(){
        // A = PI2r
        return PI * radius * radius;
    }
    //overridden create method,  creates Circle and displays area
    public void create(){
        //create square then set measurements
        Circle c = new Circle();
        Scanner x = new Scanner(System.in);
        //set radius     
        System.out.println("What is the radius?");
        int input = x.nextInt();
        c.setRadius(input);      
        //return area of Circle        
        System.out.println("The area of the circle is " + c.getArea());  
        System.out.println();
    } 

}

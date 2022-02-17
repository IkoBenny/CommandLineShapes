import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Rectangle.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A TwoDimensionalShape is a Shape.
 * A TwoDimensionalShape has an area.
 * A Rectangle is a TwoDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a Rectangle.Some appropiate assumptions
 * about rectangle are made and documented in the code.
 */ 

public class Rectangle extends TwoDimensionalShape
{
    // instance variables - replace the example below with your own
    private int width;
    private int length;
    
    //getter for width variable
    public int getWidth(){
        return width;
    }
    //getter for length variable
    public int getLength(){
        return length;
    }
    //setter for width variable
    public void setWidth(int width){
        this.width = width;
    }
    //setter for length variable
    public void setLength(int length){
        this.length = length;
    }
    //overriden getArea, returns area for a Rectangle
    public double getArea(){
        // A = wl
        return width * length;
    }  
    //overridden create method, creates Rectangle and displays area
    public void create(){
        //create rectangle then set measurements
        Rectangle r = new Rectangle();
        Scanner x = new Scanner(System.in);
        //set width     
        System.out.println("What is the width?");
        int input = x.nextInt();
        r.setWidth(input);
        //set height
        System.out.println("What is the length?");
        input = x.nextInt();
        r.setLength(input);
        //return area of Square
        System.out.println("The area of the rectangle is " + r.getArea());  
        System.out.println();
    }   
}

import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Square.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A TwoDimensionalShape is a Shape.
 * A TwoDimensionalShape has an area.
 * A Square is a TwoDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a Square.Some appropiate assumptions
 * about squares are made and documented in the code.
 */ 

public class Square extends TwoDimensionalShape
{ 
    //instance variables
    private int width;
    private int height;
    boolean isPerfect = true;
  
    //default Square constructor
    public Square(){
        super();
        width = 0;
        height = 0;
    }
    //getter for Square width
    public int getWidth(){
        return width;
    }
    //getter for Square height
    public int getHeight(){
        return height;
    }
    //setter for Square width
    public void setWidth(int width){
        this.width = width;
    }
    //setter for Square height
    public void setHeight(int height){
        this.height = height;
    }
    //returns true if this Square is a perfect square, and false otherwise
    public boolean isPerfectSquare(){
        if(width == height)
        return isPerfect;
        else
        return false;
    }   
    //overridden getArea
    public double getArea(){
        // A = wh
        return width * height;
    }
    //overridden create method, creates Square and displays area
    public void create(){
        //create square then set measurements
        Square sq = new Square();
        Scanner x = new Scanner(System.in);
        //set width     
        System.out.println("What is the width?");
        int input = x.nextInt();
        sq.setWidth(input);
        //set height
        System.out.println("What is the height?");
        input = x.nextInt();
        sq.setHeight(input);
        //return area of Square
        System.out.println("The area of the square is " + sq.getArea());
        System.out.println();
    } 
   
}

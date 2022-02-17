import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Triangle.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A TwoDimensionalShape is a Shape.
 * A TwoDimensionalShape has an area.
 * A Triangle is a TwoDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a Triangle.Some appropiate assumptions
 * about triangles are made and documented in the code.
 */ 

public class Triangle extends TwoDimensionalShape
{
    //instance variables for a Triangle
    private int side1;
    private int side2;
    private int side3;
    private String type;
    
    //default constructor for a Triangle
    public Triangle(){
        super();
        side1 = 0;
        side2 = 0;
        side3 = 0;
        type ="";
    }  

    //get first side length
    public int getside1(){
        return side1;
    }
    //get second side length
    public int getside2(){
        return side2;
    }
    //get third side length
    public int getside3(){
        return side3;
    }
    //get Triangle type Equilateral/Isosceles/Scalene
    public String gettype(){
        return type;
    }  
    //setter for Triangle, sets all 3 sides at once and identifies type
    public void setSides(int side1,int side2,int side3){
        //sets values for sides
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
        //if sides one and 2 are equal, triangle is equilateral or isosceles
        if(side1 == side2){
        if(side1 == side3)
        setTriangleType("Equilateral");
        else
        setTriangleType("Isosceles");
    }   //if sides 1 and 3 are equal, but not 1 and 2 it is a scalene or isosceles
        else{
        if(side1 == side3)
        setTriangleType("Isosceles");
        else
        setTriangleType("Scalene");
    }
    }
    //sets String representation of Triangle type
    public void setTriangleType(String type){
        this.type = type;
    }
    //returns value of smallestSide of a Triangle, used for calculating area
    public int getLargestSide(){
        int largestSide = side1;
        if(side1 < side2)
        largestSide = side2;
        if(largestSide < side3)
        largestSide = side3;
        
        return largestSide;
    }
    //returns value of smallestSide of a Triangle, used for calculating area
    public int getSmallestSide(){
        int smallestSide = side1;
        if(side1 > side2)
        smallestSide = side2;
        if(smallestSide > side3)
        smallestSide = side3;
        
        return smallestSide;
    }
    //overriden getArea, returns area for a Triangle
    public double getArea(){
        if(type.equals("Equilateral"))
        return 1/2 * side1 * side2;
        // if it is an equilateral use any sides to calculate,
        //otherwise take smallest and largest side
        
        // A = 1/2 bh
         return .5 * getLargestSide() * getSmallestSide();        
    }
    //overridden create method,  creates Triangle and displays area
    public void create(){
        //create triangle then set measurements
        Triangle t = new Triangle();
        Scanner x = new Scanner(System.in);
        //set side 1    
        System.out.println("What is the length of the first side?");
        int input1 = x.nextInt();      
        //set side 2
        System.out.println("What is the length of the second side?");
        int input2 = x.nextInt();
        //set side 3 
        System.out.println("What is the length of the third side?");
        int input3 = x.nextInt();
        //create Triangle with 3 sides
        t.setSides(input1, input2, input3);
        
        //return area of Triangle
        System.out.println("The area of the triangle is " + t.getArea());  
        System.out.println();
    } 
    
}

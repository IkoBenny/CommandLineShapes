import java.util.*;
/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Torus.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has a volume.
 * A Torus is a ThreeDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a torus. Some appropiate assumptions
 * about torus are made and documented in the code.
 */ 
public class Torus extends ThreeDimensionalShape
{
    //instance variables for a Torus
    private final static double PI = 3.1415926535;
    private int radius1;
    private int radius2;
    
    //getter for Sphere radius1
    public double getRadius1(){
        return radius1;
    }   
    //setter for Sphere radius1
    public void setRadius1(int radius1){
         this.radius1 = radius1;
    } 
    //getter for Sphere radius2
    public double getRadius2(){
        return radius2;
    }   
    //setter for Sphere radius2
    public void setRadius2(int radius2){
         this.radius2 = radius2;
    } 
    //overriden method for a Torus object, returns volume
    public double getVolume(){
        //Volume = 1/4PI^2(r1 + r2)(r2 - r1)^2
        return .25 * PI * PI *(radius1 + radius2) * (radius2 - radius1) * (radius2 - radius1);
    }  
    //overridden create method, creates Torus and displays volume
    public void create(){
        //create square then set measurements
        Torus t = new Torus();
        Scanner x = new Scanner(System.in);
        //set radius1    
        System.out.println("What is the first radius?");
        int input = x.nextInt();
        t.setRadius1(input);
        //set radius2
        System.out.println("What is the second radius?");
        input = x.nextInt();
        t.setRadius2(input);
        //return volume of Sphere
        System.out.println("The volume of the torus is " + t.getVolume());
        System.out.println();
    }   
}

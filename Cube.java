import java.util.*;

/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * Cube.Java
 * A Shape is an object.
 * A Shape has a NumberofDimensions.
 * A ThreeDimensionalShape is a Shape.
 * A ThreeDimensionalShape has a volume.
 * A Cube is a ThreeDimensionalShape.
 * This class represents the design of an Inheritance hierarchy
 * that satisfies these is-a and has-a relationships.
 * Also, this class fills in additional methods and variables
 * that make sense for a cube.Some appropiate assumptions
 * about cubes are made and documented in the code.
 */ 

public class Cube extends ThreeDimensionalShape
{
    //instance variables for a cube
    private int width;
    private int height;
    private int depth;
    
    //default Cube constructor
    public Cube(){
        super();
        width = 0;
        height = 0;
        depth =0;
    }
  
    //getter for Cube width
    public int getWidth(){
        return width;
    }
    //getter for Cube height
    public int getHeight(){
        return height;
    }
    //getter for Cube depth
    public int getDepth(){
        return depth;
    }
    //setter for Cube width
    public void setWidth(int width){
        this.width = width;
    }
    //setter for Cube height
    public void setHeight(int height){
        this.height = height;
    }
    //setter for Cube depth
    public void setDepth(int depth){
        this.depth = depth;
    }
    //overriden getVolume method, calculates volume for a Cube object
    public double getVolume(){
        //V = wdh
        return width * depth * height;   
    }   
    //overridden create method, creates Cube and displays volume
    public void create(){
        //create cube then set measurements
        Cube c = new Cube();
        Scanner x = new Scanner(System.in);
        //set width     
        System.out.println("What is the width?");
        int input = x.nextInt();
        c.setWidth(input);
        //set height
        System.out.println("What is the height?");
        input = x.nextInt();
        c.setHeight(input);
        //set depth
        System.out.println("What is the depth?");
        input = x.nextInt();
        c.setDepth(input);
        //return volume of cube
        System.out.println("The volume of the cube is " + c.getVolume());
        System.out.println();
    } 
}

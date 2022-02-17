            import java.util.*;
            import java.text.*;
            
            /*Benny Iko
             * 3/28/2020
             * Object-Oriented and Concurrent Programming
             * CMSC 335 7981
             * JavaOOShapes.Java
             * A Shape is an object.
             * A Shape has a NumberofDimensions.
             * A ThreeDimensionalShape is a Shape.
             * A ThreeDimensionalShape has an volume.
             * This class represents the design of an Inheritance hierarchy
             * that satisfies these is-a and has-a relationships.
             * Specifically, this class creates a command line driven menu
             * that allows a user to construct each of the TwoDimensional and ThreeDimensional Shape subclasses.
             * The menu continues to loop prompting for a specific class
             * and then prompt for appropriate input parameters.
             * The values volume or area as appropriate to the shape are returned. 
             * Error checks are made ensuring appropriate menu items and types of data were input.
             * An option to exit the program is available as well that 
             * provides an appropriate Thank you message along with the current date and time.
             * 
             */ 
            
            public class JavaOOShapes
            {      
               public static void main (String [] args) throws IllegalInputException{
                   //show menu and take user input
                   JavaOOShapes proj1 = new JavaOOShapes(); 
                   Scanner x = new Scanner(System.in);
                   int programSelection = 0;      
                   //show menu until user chooses to exit
                   while(programSelection != 10){
                   proj1.displayMenu();
                   programSelection = proj1.getInputFromUser(x);      
                   //if number is 1-10 run program
                   //otherwise report error     
                   if(programSelection > 10 || programSelection < 1)
                   throw new IllegalInputException(programSelection + " is invalid");
                   else{          
                       switch(programSelection){
                           //program menu
                           //where cases map to corresponding selections
                           case 1:{
                               Circle c = new Circle();
                               c.create();
                               break;
                            }
                           case 2:{
                               Rectangle r = new Rectangle();
                               r.create();
                               break;
                            }
                           case 3:{
                               Square s = new Square();
                               s.create();
                               break;
                            }
                           case 4:{
                               Triangle t = new Triangle();  
                               t.create();
                               break;
                            }
                           case 5:{
                               Sphere s = new Sphere();  
                               s.create();
                               break;
                            }
                           case 6:{
                               Cube c = new Cube();
                               c.create();
                               break;
                            }
                           case 7:{
                               Cone c = new Cone();  
                               c.create();
                               break;
                            }
                           case 8:{
                               Cylinder c = new Cylinder();
                               c.create();
                               break;
                            }
                           case 9:{
                               Torus t = new Torus();  
                               t.create();
                               break;             
                            }
                           case 10:{
                               //print date and time upon exit
                               Date time = new Date( );
                               SimpleDateFormat f = new SimpleDateFormat (" yyyy.MM.dd 'the time is' hh:mm:ss a zzz");
                               System.out.print("Thanks for using the program. Today is ");
                               System.out.print(f.format(time));
                
                
                
                }
               
            }
           
        }
    }
    }
    //default constructor
    public JavaOOShapes(){       
        System.out.println("*********Welcome to the Java OO Shapes Program **********");      
    }
       //takes integer input and returns same integer value
    public int getInputFromUser(Scanner s){
        int input = s.nextInt();
        return input;
    }
        //displays user menu
    public void displayMenu(){
        System.out.println("Select from the menu below:");
        System.out.println("1. Construct a Circle");
        System.out.println("2. Construct a Rectangle");
        System.out.println("3. Construct a Square");
        System.out.println("4. Construct a Triangle");
        System.out.println("5. Construct a Sphere");
        System.out.println("6. Construct a Cube");
        System.out.println("7. Construct a Cone");
        System.out.println("8. Construct a Cylinder");
        System.out.println("9. Construct a Torus");
        System.out.println("10. Exit the program");     
    }
        
}

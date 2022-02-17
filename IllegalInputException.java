/*Benny Iko
 * 3/28/2020
 * Object-Oriented and Concurrent Programming
 * CMSC 335 7981
 * IllegalInputException.Java
 * Error checks make sure appropriate menu items 
 * and types of data were input. This exception 
 * is thrown whenever inappropiate data is entered by the user
 * 
 */ 

public class IllegalInputException extends Exception
{   
      public IllegalInputException(String message){
      super("Unexpected Input: " + message);
    }
}


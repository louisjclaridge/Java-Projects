/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbergenerator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class RandomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       randomNumberGen();
    }
    
    public static void randomNumberGen()
    {
        //Initalises the scanner for use 
        Scanner userInput = new Scanner(System.in);
        //Initialises the random for use
        Random randomNumber = new Random();
        
        
        //Getting values from the user
        System.out.print("Enter minimum value" + System.lineSeparator());
        int minValue = Integer.parseInt(userInput.next());
        System.out.print("Enter maximum value" + System.lineSeparator());
        int maxValue = Integer.parseInt(userInput.next());
        
        //Genrating a random number with a min and max value
        int Output = randomNumber.nextInt((maxValue - minValue) + 1) + minValue;
        
        //Printing out to the console with a linebreak
        System.out.print("Your random number is: " + Output + System.lineSeparator());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcalculator;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class AdvancedCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public static void calculator() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter first number" + System.lineSeparator());
        int numberOne = Integer.parseInt(userInput.next());
        System.out.print("Please enter second number" + System.lineSeparator());
        int numberTwo = Integer.parseInt(userInput.next());

        int Output = numberOne + numberTwo;

        System.out.print("Your result is: " + Output + System.lineSeparator());

    }
    
}

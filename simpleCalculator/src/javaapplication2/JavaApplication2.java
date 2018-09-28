/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author louis
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculator();
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

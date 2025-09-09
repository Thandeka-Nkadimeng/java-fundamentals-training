/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author Thandeka Nkadimeng This class demonstrate the use of pre decrement /
 * decrement and post increment/decrement
 */
public class IncrementDecrement {

    public static void main(String[] args) {
        // TODO code application logic here
        int number = 25;

        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value number by 1, but keep original value: " + number++);
        System.out.println("New value of number is: " + number);

        System.out.println("Increment the value number by 1, but keep original value: " + number--);
        System.out.println("New value of number is: " + number);

        number = 25;
        System.out.println("Original value of number: " + number);
        System.out.println("Increment the value number by 1, but keep original value: " + ++number);
        System.out.println("New value of number is: " + number);

        System.out.println("Increment the value number by 1, but keep original value: " + --number);
        System.out.println("New value of number is: " + number);
    }
}

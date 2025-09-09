/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2.Exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Thandeka Nkadimeng
 */
public class RoomPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");

        double price = 0;
        boolean validBed = true;

        // Prompt user for bed type
        System.out.println("Choose a bed type:" + "\n"
                + "(A) Queen bed" + "\n"
                + "(B) King bed" + "\n"
                + "(C) King bed with pullout couch (suite)" + "\n"
                + "Enter your choice (A, B, or C): ");
        String bedChoice = input.nextLine().toUpperCase();

        // Determine base price OR USE
        switch (bedChoice) {
            case "A":
                price = 125;
                break;
            case "B":
                price = 139;
                break;
            case "C":
                price = 165;
                break;
            default:
                System.out.println("Invalid bed type entered.");
                validBed = false;
                price = 0;
        }

        // If bed type was valid, ask for view type
        if (validBed) {
            System.out.println("Choose a view:" + "\n"
                    + "(1) Lake view (+$15)" + "\n"
                    + "(2) Park view" + "\n"
                    + "Enter your choice (1 or 2): ");
            String viewChoice = input.nextLine();

            if (viewChoice.equals("1")) {
                price += 15;
                System.out.println("Total price of the room: $" + df.format(price));
            } else if (viewChoice.equals("2")) {
                System.out.println("Total price of the room: $" + df.format(price));
            } else {
                System.out.println("Invalid view option entered.");
            }
        }

        input.close();
    }
}

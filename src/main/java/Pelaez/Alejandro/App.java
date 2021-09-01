/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alejandro Pelaez
 */
package Pelaez.Alejandro;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the amount? ");
        float amount = input.nextFloat();
        System.out.print("What is the state? ");
        String state = input.next();
        float tax = 0.55f;
        float total;
        if (state.equalsIgnoreCase("WI"))
        {
            total = (amount + tax);
            System.out.printf("The subtotal is: $%.2f\n" +
                    "The tax is: $%.2f\n" +
                    "The total is: $%.2f", amount, tax, total);
            System.out.print("\n");
            return;
        }

        total = amount;
        System.out.printf("The total is: $%.2f", total);
        System.out.print("\n");
    }
}

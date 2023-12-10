package org.example;

public class Question3 {
    /* QUESTION 3
    A cashier only has 100, 50 and 20 naira bills (NAI) available to be dispensed.
    Given an amount between 40 and 10000 naira (inclusive) and assuming that the cashier wants to use as few bills as possible, determinate the minimal number of 100, 50 and 20 naira bills the cashier needs to dispense (in that order).

    Solution.*/
    public class Cashier {
        public static void main(String[] args) {
            int amount = 4567; // Replace with the desired amount
            // Check if the amount is within the valid range (40 to 10000 naira)
            if (amount < 40 || amount > 10000) {
                System.out.println("Invalid amount. Please enter an amount between 40 and 10000 naira.");
            } else {
                // Calculate the number of each bill denomination
                int hundreds = amount / 100;
                int fifties = (amount % 100) / 50;
                int twenties = ((amount % 100) % 50) / 20;
                // Output the results
                System.out.println("Number of 100 Naira Bills: " + hundreds);
                System.out.println("Number of 50 Naira Bills: " + fifties);
                System.out.println("Number of 20 Naira Bills: " + twenties);
            }
        }
    }

}



package org.example;
import java.util.HashMap;
import java.util.Map;
public class Question2 {

/*
DESCRIPTION:
Welcome young Jedi! In this Kata you must create a function that takes an amount of US currency in cents, and returns a dictionary/hash which shows the least amount of coins used to make up that amount. The only coin denominations considered in this exercise are: Pennies (1¢), Nickels (5¢), Dimes (10¢) and Quarters (25¢). Therefor the dictionary returned should contain exactly 4 key/value pairs.
Notes:
* If the function is passed either 0 or a negative number, the function should return the dictionary with all values equal to 0.
* If a float is passed into the function, its value should be rounded down, and the resulting dictionary should never contain fractions of a coin.
Examples
loose_change(56)    ==>  {'Nickels': 1, 'Pennies': 1, 'Dimes': 0, 'Quarters': 2}
loose_change(-435)  ==>  {'Nickels': 0, 'Pennies': 0, 'Dimes': 0, 'Quarters': 0}
loose_change(4.935) ==>  {'Nickels': 0, 'Pennies': 4, 'Dimes': 0, 'Quarters': 0}
*/

    public class CoinChange {
        public static Map<String, Integer> leastCoins(int amount) {
            Map<String, Integer> coins = new HashMap<>();

            // Initialize the coin denominations.
            int[] denominations = {25, 10, 5, 1};
            String[] coinNames = {"Quarters", "Dimes", "Nickels", "Pennies"};

            for (int i = 0; i < denominations.length; i++) {
                int coinCount = amount / denominations[i];
                coins.put(coinNames[i], coinCount);
                amount %= denominations[i];
            }

            return coins;
        }
        public static void main(String[] args) {
            int amount = 73;
            Map<String, Integer> result = leastCoins( amount );
            System.out.println( "Quarters: " + result.get( "Quarters" ) );
            System.out.println( "Dimes: " + result.get( "Dimes" ) );
            System.out.println( "Nickels: " + result.get( "Nickels" ) );
            System.out.println( "Pennies: " + result.get( "Pennies" ) );
        }
    }
}

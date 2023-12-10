package org.example;

public class Question4 {
    public class LargestUnproduceableValue {
        public static int coins(int coin1, int coin2) {
            if (coin1 == 1 || coin2 == 1) {
                return -1; // If either coin is 1, we can produce any integer.
            }
            if (coin1 == coin2) {
                return -1; // If the coins are identical, we can produce any integer.
            }
            return (coin1 * coin2) - (coin1 + coin2);
        }

        public static void main(String[] args) {
            System.out.println(coins(1, 1));  // Output: -1
            System.out.println(coins(2, 3));  // Output: 1
            System.out.println(coins(2, 2));  // Output: -1
        }
    }

}

package Array;

import java.util.Scanner;

class StockProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minPrice as maximum possible value
        int maxProfit = 0; // Initialize maxProfit as 0

        for (int price : prices) {  // Loop through the array
            if (price < minPrice) {
                minPrice = price; // Update minPrice if we find a lower price
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate profit & update maxProfit
            }
        }

        return maxProfit; // Return the maximum profit found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the size of the array
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int[] prices = new int[n];

        // Taking input for stock prices
        System.out.println("Enter the stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        StockProfit sp = new StockProfit();
        int result = sp.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);

        scanner.close();
    }
}


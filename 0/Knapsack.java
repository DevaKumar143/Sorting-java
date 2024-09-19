// // package 0;

// // public class 1knap {
    
// // }

// public class Knapsack {

//     // Function to solve the 0/1 Knapsack problem using dynamic programming
//     public static int knapsack(int[] weights, int[] values, int capacity) {
//         int n = weights.length;

//         // Create a 2D array to store the maximum value that can be obtained with the given capacity
//         int[][] dp = new int[n + 1][capacity + 1];

//         // Populate the dp array
//         for (int i = 1; i <= n; i++) {
//             for (int w = 1; w <= capacity; w++) {
//                 // If the weight of the current item is less than or equal to the current capacity,
//                 // consider including it in the knapsack
//                 if (weights[i - 1] <= w) {
//                     // Choose the maximum of including the current item or excluding it
//                     dp[i][w] = Math.max(values[i - 1] + dp[i - 1][w - weights[i - 1]], dp[i - 1][w]);
//                 } else {
//                     // If the weight of the current item is greater than the current capacity,
//                     // exclude it from the knapsack
//                     dp[i][w] = dp[i - 1][w];
//                 }
//             }
//         }

//         // Return the maximum value that can be obtained with the given capacity
//         return dp[n][capacity];
//     }

//     // Main method to test the Knapsack implementation
//     public static void main(String[] args) {
//         int[] weights = {10, 20, 30};
//         int[] values = {60, 100, 120};
//         int capacity = 50;

//         int maxValue = knapsack(weights, values, capacity);
//         System.out.println("Maximum value that can be obtained: " + maxValue);
//     }
// }


import java.util.*;

public class Knapsack { 
    // A utility function that returns 
    // maximum of two integers 
    static int max(int a, int b) { return (a > b) ? a : b; } 
    // Returns the maximum value that 
    // can be put in a knapsack of 
    // capacity W 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
    // Base Case 
    if (n == 0 || W == 0) 
    return 0; 
    // If weight of the nth item is 
    // more than Knapsack capacity W, 
    // then this item cannot be included 
    // in the optimal solution 
    if (wt[n - 1] > W) 
    return knapSack(W, wt, val, n - 1); 
    // Return the maximum of two cases: 
    // (1) nth item included 
    // (2) not included 
    else
    return max(val[n - 1] 
    + knapSack(W - wt[n - 1], wt, 
    val, n - 1), 
    knapSack(W, wt, val, n - 1)); 
    } 
    // Driver code 
    public static void main(String args[]) 
    { 
    int profit[] = new int[] { 60, 100, 120 }; 
    int weight[] = new int[] { 10, 20, 30 }; 
    int W = 50; 
    int n = profit.length; 
    System.out.println(knapSack(W, weight, profit, n)); 
    } 
}
// // public class hello {
    
// // }
// // import java.util.Arrays;
// // import java.util.Comparator;

// // public class FractionalKnapsack {

// //     // Item class to represent each item with its weight and value
// //     static class Item {
// //         int weight;
// //         int value;

// //         Item(int weight, int value) {
// //             this.weight = weight;
// //             this.value = value;
// //         }
// //     }

// //     // Function to calculate maximum value of knapsack using greedy approach
// //     public static double getMaxValue(int[] weights, int[] values, int capacity) {
// //         // Construct array of items
// //         Item[] items = new Item[weights.length];
// //         for (int i = 0; i < weights.length; i++) {
// //             items[i] = new Item(weights[i], values[i]);
// //         }

// //         // Sort items by value per unit weight in non-decreasing order
// //         Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

// //         double totalValue = 0.0; // Initialize total value of knapsack

// //         // Loop through items and fill knapsack until capacity is reached
// //         for (Item item : items) {
// //             // If capacity is zero, break the loop
// //             if (capacity == 0) {
// //                 break;
// //             }

// //             // If current item's weight is less than or equal to remaining capacity,
// //             // take the whole item and update capacity and total value
// //             if (item.weight <= capacity) {
// //                 totalValue += item.value;
// //                 capacity -= item.weight;
// //             } else { // If current item's weight is more than remaining capacity,
// //                      // take a fraction of the item and update capacity and total value
// //                 totalValue += ((double) capacity / item.weight) * item.value;
// //                 break;
// //             }
// //         }

// //         return totalValue;
// //     }

// //     // Main method to test FractionalKnapsack implementation
// //     public static void main(String[] args) {
// //         int[] weights = {10, 20, 30};
// //         int[] values = {60, 100, 120};
// //         int capacity = 50;

// //         double maxValue = getMaxValue(weights, values, capacity);
// //         System.out.println("Maximum value of items that can be included in the knapsack: " + maxValue);
// //     }
// // }

// import java.util.*;
// import java.util.Arrays;
// import java.util.Comparator;

// public class FractionalKnapsack {

//     static class Item {
//         int weight;
//         int value;

//         Item(int weight, int value) {
//             this.weight = weight;
//             this.value = value;
//         }
//     }

//     // Function to calculate maximum value of knapsack using greedy approach
//     public static double getMaxValue(int[] weights, int[] values, int capacity) {
//         int n = weights.length;

//         // Create an array of Items
//         Item[] items = new Item[n];
//         for (int i = 0; i < n; i++) {
//             items[i] = new Item(weights[i], values[i]);
//         }

//         // Sort items based on value-to-weight ratio in non-increasing order
//         Arrays.sort(items, Comparator.comparingDouble((Item item) -> (double) item.value / item.weight).reversed());

//         double maxValue = 0; // Initialize total value of knapsack
//         int remainingCapacity = capacity;

//         // Iterate through items
//         for (int i = 0; i < n; i++) {
//             if (remainingCapacity == 0) {
//                 break;
//             }
//             // If the weight of the current item is less than or equal to remaining capacity,
//             // take the whole item
//             if (items[i].weight <= remainingCapacity) {
//                 maxValue += items[i].value;
//                 remainingCapacity -= items[i].weight;
//             } else { // If the weight of the current item is greater than remaining capacity,
//                      // take a fraction of the item
//                 maxValue += (double) items[i].value * remainingCapacity / items[i].weight;
//                 remainingCapacity = 0;
//             }
//         }

//         return maxValue;
//     }

//     // Main method to test FractionalKnapsack implementation
//     public static void main(String[] args) {
//         int[] weights = {10, 20, 30};
//         int[] values = {60, 100, 120};
//         int capacity = 50;

//         double maxValue = getMaxValue(weights, values, capacity);
//         System.out.println("Maximum value of items that can be included in the knapsack: " + maxValue);
//     }
// }


// import java.util.*;
// class Item {
//  int weight;
//  int profit;
//  double ratio;
 
//  public Item(int weight, int value) {
//  this.weight = weight;
//  this.profit= profit;
//  this.ratio = (double) profit / weight;
//  }
// }
// public class FractionalKnapsack {
 
//  public static double getMaxValue(Item[] items, int capacity) {
//  Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
 
//  double totalValue = 0;
//  int remainingCapacity = capacity;
 
//  for (Item item : items) {
//  if (remainingCapacity <= 0)
//  break;
//  int currentWeight = Math.min(item.weight, remainingCapacity);
//  totalValue += currentWeight * item.ratio;
//  remainingCapacity -= currentWeight;
//  }
 
//  return totalValue;
//  }
 
//  public static void main(String[] args) {
//  Scanner scanner = new Scanner(System.in);
//  System.out.println("Enter the number of items:");
//  int n = scanner.nextInt();
//  Item[] items = new Item[n];
//  System.out.println("Enter the weights and profits of each item:");
//  for (int i = 0; i < n; i++) {
//      System.out.println("Enter weight for item " + (i + 1) + ":");
//      int weight = scanner.nextInt();
//      System.out.println("Enter profit for item " + (i + 1) + ":");
//      int profit = scanner.nextInt();
//      items[i] = new Item(weight, profit);
//  }
//  System.out.println("Enter the capacity of the knapsack:");
//  int capacity = scanner.nextInt();

//  double maxValue = getMaxValue(items, capacity);
//  System.out.println("Maximum value that can be obtained = " + maxValue);
//  scanner.close();
// }
// }

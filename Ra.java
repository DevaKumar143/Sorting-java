// // public class hello {
    
// // }

// public class RabinKarpStringMatching {

//     private static final int PRIME = 101; // Prime number used for hashing
//     private static final int BASE = 256; // Base for the hash function

//     // Function to implement Rabin-Karp algorithm for string matching
//     public static void search(String pattern, String text) {
//         int m = pattern.length();
//         int n = text.length();
//         int patternHash = 0; // Hash value for pattern
//         int textHash = 0; // Hash value for current window of text

//         // Calculate hash value for pattern and the first window of text
//         for (int i = 0; i < m; i++) {
//             patternHash = (BASE * patternHash + pattern.charAt(i)) % PRIME;
//             textHash = (BASE * textHash + text.charAt(i)) % PRIME;
//         }

//         // Iterate through the text with a sliding window of length m
//         for (int i = 0; i <= n - m; i++) {
//             // Check if hash values of current window of text and pattern match
//             if (patternHash == textHash) {
//                 boolean match = true;
//                 // Check character by character if the pattern matches the substring in the text
//                 for (int j = 0; j < m; j++) {
//                     if (text.charAt(i + j) != pattern.charAt(j)) {
//                         match = false;
//                         break;
//                     }
//                 }
//                 if (match) {
//                     System.out.println("Pattern found at index " + i);
//                 }
//             }
//             // Calculate hash value for next window of text
//             if (i < n - m) {
//                 textHash = (BASE * (textHash - text.charAt(i) * (int) Math.pow(BASE, m - 1)) + text.charAt(i + m)) % PRIME;
//                 if (textHash < 0) {
//                     textHash += PRIME; // Ensure that the hash value remains positive
//                 }
//             }
//         }
//     }

//     // Main method to test RabinKarpStringMatching implementation
//     public static void main(String[] args) {
//         String text = "AABAACAADAABAABA";
//         String pattern = "AABA";
//         System.out.println("Text: " + text);
//         System.out.println("Pattern: " + pattern);
//         System.out.println("Pattern found at indices:");
//         search(pattern, text);
//     }
// }

// public class RabinKarp {
//     public final static int d = 10;
//     static void search(String pattern, String txt, int q) {
//     int m = pattern.length();
//     int n = txt.length();
//     int i, j;
//     int p = 0;
//     int t = 0;
//     int h = 1;
//     for (i = 0; i < m - 1; i++)
//     h = (h * d) % q;
//     // Calculate hash value for pattern and text
//     for (i = 0; i < m; i++) {
//     p = (d * p + pattern.charAt(i)) % q;
//     t = (d * t + txt.charAt(i)) % q;
//     }
//     // Find the match
//     for (i = 0; i <= n - m; i++) {
//     if (p == t) {
//     for (j = 0; j < m; j++) {
//     if (txt.charAt(i + j) != pattern.charAt(j))
//     break;
//     }
//     if (j == m)
//     System.out.println("Pattern is found at position: " + (i + 1));
//     }
//     if (i < n - m) {
//     t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
//     if (t < 0)
//     t = (t + q);
//     }
//     }
//     }
//     public static void main(String[] args) {
//     String txt = "ABCCDDAEFG";
//     String pattern = "CDD";
//     int q = 13;
//     search(pattern, txt, q);
//     }
// }

import java.util.*;
class Item {
 int weight;
 int profit;
 double ratio;
 
 public Item(int weight, int value) {
 this.weight = weight;
 this.profit= profit;
 this.ratio = (double) profit / weight;
 }
}
public class Ra {
 
 public static double getMaxValue(Item[] items, int capacity) {
 Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
 
 double totalValue = 0;
 int remainingCapacity = capacity;
 
 for (Item item : items) {
 if (remainingCapacity <= 0)
 break;
 int currentWeight = Math.min(item.weight, remainingCapacity);
 totalValue += currentWeight * item.ratio;
 remainingCapacity -= currentWeight;
 }
 
 return totalValue;
 }
 
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter the number of items:");
 int n = scanner.nextInt();
 Item[] items = new Item[n];
 System.out.println("Enter the weights and profits of each item:");
 for (int i = 0; i < n; i++) {
     System.out.println("Enter weight for item " + (i + 1) + ":");
     int weight = scanner.nextInt();
     System.out.println("Enter profit for item " + (i + 1) + ":");
     int profit = scanner.nextInt();
     items[i] = new Item(weight, profit);
 }
 System.out.println("Enter the capacity of the knapsack:");
 int capacity = scanner.nextInt();

 double maxValue = getMaxValue(items, capacity);
 System.out.println("Maximum value that can be obtained = " + maxValue);
 scanner.close();
}
}

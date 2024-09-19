// public class Bubble {
    
// }

import java.util.Scanner; 
// public class bubbleSort
// {
// public static void main(String[] args)
// {
// int n=10, i, j, x;
// int[] array = new int[n];
// Scanner s = new Scanner(System.in);
// System.out.print("Enter 10 Elements in Random Order:” );
// for(i=0; i<n; i++)
// array[i] = s.nextInt();
// for(i=0; i<(n-1); i++)
// {
// for(j=0; j<(n-i-1); j++)
// {
// if(array[j]>array[j+1])
// {
// x = array[j];
// array[j] = array[j+1]; 
// array[j+1] = x;
// }
// }
// }
// System.out.println("\nThe new sorted array is:"); 
// for(i=0; i<n; i++)
// System.out.print(array[i]+ " ");
// }
// }

public class bubbleSort {
    // Function to perform bubble sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}



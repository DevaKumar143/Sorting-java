// public class Binary {
    
// }
import java.util.*;
// import java.util.Scanner;

//  public class binarySearch {
// public static void main(String[] args)
// {
//  int i, search, first, last, middle; 
//  int[] arr = new int[10];
//  System.out.print("Enter 10 Elements (inAscending): ");
// Scanner s= new Scanner(System.in); 

//  for(i=0; i<10; i++)
// arr[i] = s.nextInt();
//  System.out.print("Enter an Element to Search: ");
// int  x = sc.nextInt();
// first = 1;
// last = 10;
// middle = (first+last)/2; while(first<=last)
// {
// middle = (first+last)/2;
// if(arr[middle]==x){
// System.out.println("\nThe element is available at Index No."+middle);
// flag=1 break;
// }
// elseif(arr[middle]<x) first = middle+1;
// else
// last = middle-1;
// }
// if(flag==0)
// System.out.println("\nThe element is not available in given array");
// }
// }
// // }

public class binarySearch {
    // Returns the index of target if it is present in the array, otherwise returns -1
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

            // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If we reach here, then the element was not present
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 10, 40 };
        int target = 10;
        int result = binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}



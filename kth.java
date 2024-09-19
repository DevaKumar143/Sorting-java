// public class kth {
    
// }

import java.util.Arrays; 
import java.util.Collections; 
class Kth
{
public static int kthSmallestelem(Integer[] arr, int K)
{
Arrays.sort(arr);
return arr[K - 1];
}
public static void main(String[] args)
{
Integer arr[] = new Integer[] { 121, 13, 45, 17, 19 };
 int K = 2;
System.out.print("K'th smallest element is " + kthSmallestelem(arr, K));
}
}

